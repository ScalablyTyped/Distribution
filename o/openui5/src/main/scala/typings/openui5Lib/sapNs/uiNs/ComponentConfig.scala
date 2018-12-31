package typings
package openui5Lib.sapNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a Javascript module with its name, its dependencies and a module value or factory.The
  * typical and only suggested usage of this method is to have one single, top level call
  * to<code>sap.ui.define</code> in one Javascript resource (file). When a module is requested by
  * itsname for the first time, the corresponding resource is determined from the name and the
  * current{@link jQuery.sap.registerResourcePath configuration}. The resource will be loaded and
  * executedwhich in turn will execute the top level <code>sap.ui.define</code> call.If the module name
  * was omitted from that call, it will be substituted by the name that was used torequest the module.
  * As a preparation step, the dependencies as well as their transitive dependencies,will be loaded.
  * Then, the module value will be determined: if a static value (object, literal) wasgiven, that value
  * will be the module value. If a function was given, that function will be called(providing the module
  * values of the declared dependencies as parameters to the function) and itsreturn value will be used
  * as module value. The framework internally associates the resulting valuewith the module name and
  * provides it to the original requestor of the module. Whenever the moduleis requested again, the same
  * value will be returned (modules are executed only once).<i>Example:</i><br>The following example
  * defines a module "SomeClass", but doesn't hard code the module name.If stored in a file
  * 'sap/mylib/SomeClass.js', it can be requested as 'sap/mylib/SomeClass'.<pre> 
  * sap.ui.define(['./Helper', 'sap/m/Bar'], function(Helper,Bar) {    // create a new class    var
  * SomeClass = function();    // add methods to its prototype    SomeClass.prototype.foo = function() {
  *        // use a function from the dependency 'Helper' in the same package (e.g. 'sap/mylib/Helper' )
  *        var mSettings = Helper.foo();        // create and return a sap.m.Bar (using its local name
  * 'Bar')        return new Bar(mSettings);    }    // return the class as module value    return
  * SomeClass;  });</pre>In another module or in an application HTML page, the {@link sap.ui.require}
  * API can be usedto load the Something module and to work with
  * it:<pre>sap.ui.require(['sap/mylib/Something'], function(Something) {  // instantiate a Something
  * and call foo() on it  new Something().foo();});</pre><b>Module Name
  * Syntax</b><br><code>sap.ui.define</code> uses a simplified variant of the {@link
  * jQuery.sap.getResourcePathunified resource name} syntax for the module's own name as well as for its
  * dependencies.The only difference to that syntax is, that for <code>sap.ui.define</code>
  * and<code>sap.ui.require</code>, the extension (which always would be '.js') has to be omitted.Both
  * methods always add this extension internally.As a convenience, the name of a dependency can start
  * with the segment './' which will bereplaced by the name of the package that contains the currently
  * defined module (relative name).It is best practice to omit the name of the defined module (first
  * parameter) and to userelative names for the dependencies whenever possible. This reduces the
  * necessary configuration,simplifies renaming of packages and allows to map them to a different
  * namespace.<b>Dependency to Modules</b><br>If a dependencies array is given, each entry represents
  * the name of another module thatthe currently defined module depends on. All dependency modules are
  * loaded before the valueof the currently defined module is determined. The module value of each
  * dependency modulewill be provided as a parameter to a factory function, the order of the parameters
  * will matchthe order of the modules in the dependencies array.<b>Note:</b> the order in which the
  * dependency modules are <i>executed</i> is <b>not</b>defined by the order in the dependencies array!
  * The execution order is affected by dependencies<i>between</i> the dependency modules as well as by
  * their current state (whether a modulealready has been loaded or not). Neither module implementations
  * nor dependants that requirea module set must make any assumption about the execution order (other
  * than expressed bytheir dependencies). There is, however, one exception with regard to third party
  * libraries,see the list of limitations further down below.<b>Note:</b>a static module value (a
  * literal provided to <code>sap.ui.define</code>) cannotdepend on the module values of the depency
  * modules. Instead, modules can use a factory function,calculate the static value in that function,
  * potentially based on the dependencies, and returnthe result as module value. The same approach must
  * be taken when the module value is supposedto be a function.<b>Asynchronous
  * Contract</b><br><code>sap.ui.define</code> is designed to support real Asynchronous Module
  * Definitions (AMD)in future, although it internally still uses the the old synchronous module loading
  * of UI5.Callers of <code>sap.ui.define</code> therefore must not rely on any synchronous behaviorthat
  * they might observe with the current implementation.For example, callers of
  * <code>sap.ui.define</code> must not use the module value immediatelyafter invoking
  * <code>sap.ui.define</code>:<pre>  // COUNTER EXAMPLE HOW __NOT__ TO DO IT  // define a class
  * Something as AMD module  sap.ui.define('Something', [], function() {    var Something = function(); 
  *   return Something;  });  // DON'T DO THAT!  // accessing the class _synchronously_ after
  * sap.ui.define was called  new Something();</pre>Applications that need to ensure synchronous module
  * definition or synchronous loading of dependencies<b>MUST</b> use the old {@link jQuery.sap.declare}
  * and {@link jQuery.sap.require} APIs.<b>(No) Global References</b><br>To be in line with AMD best
  * practices, modules defined with <code>sap.ui.define</code>should not make any use of global
  * variables if those variables are also available as modulevalues. Instead, they should add
  * dependencies to those modules and use the corresponding parameterof the factory function to access
  * the module value.As the current programming model and the documentation of UI5 heavily rely on
  * global names,there will be a transition phase where UI5 enables AMD modules and local references to
  * modulevalues in parallel to the old global names. The fourth parameter of
  * <code>sap.ui.define</code>has been added to support that transition phase. When this parameter is
  * set to true, the frameworkprovides two additional functionalities<ol><li>before the factory function
  * is called, the existence of the global parent namespace for    the current module is
  * ensured</li><li>the module value will be automatically exported under a global name which is derived
  * from    the name of the module</li></ol>The parameter lets the framework know whether any of those
  * two operations is needed or not.In future versions of UI5, a central configuration option is planned
  * to suppress those 'exports'.<b>Third Party Modules</b><br>Although third party modules don't use UI5
  * APIs, they still can be listed as dependencies ina <code>sap.ui.define</code> call. They will be
  * requested and executed like UI5 modules, but theirmodule value will be <code>undefined</code>.If the
  * currently defined module needs to access the module value of such a third party module,it can access
  * the value via its global name (if the module supports such a usage).Note that UI5 temporarily
  * deactivates an existing AMD loader while it executes third party modulesknown to support AMD. This
  * sounds contradictarily at a first glance as UI5 wants to support AMD,but for now it is necessary to
  * fully support UI5 apps that rely on global names for such modules.Example:<pre>  // module
  * 'Something' wants to use third party library 'URI.js'  // It is packaged by UI5 as non-UI5-module
  * 'sap/ui/thirdparty/URI'  sap.ui.define('Something', ['sap/ui/thirdparty/URI'],
  * function(URIModuleValue) {    new URIModuleValue(); // fails as module value is undefined   
  * //global URI // (optional) declare usage of global name so that static code checks don't complain   
  * new URI(); // access to global name 'URI' works    ...  });</pre><b>Differences to
  * requireJS</b><br>The current implementation of <code>sap.ui.define</code> differs from
  * <code>requireJS</code>or other AMD loaders in several aspects:<ul><li>the name
  * <code>sap.ui.define</code> is different from the plain <code>define</code>.This has two reasons:
  * first, it avoids the impression that <code>sap.ui.define</code> isan exact implementation of an AMD
  * loader. And second, it allows the coexistence of an AMDloader (requireJS) and
  * <code>sap.ui.define</code> in one application as long as UI5 orapps using UI5 are not fully prepared
  * to run with an AMD loader</li><li><code>sap.ui.define</code> currently loads modules with
  * synchronous XHR calls. This isbasically a tribute to the synchronous history of UI5.<b>BUT:</b>
  * synchronous dependency loading and factory execution explicitly it not part ofcontract of
  * <code>sap.ui.define</code>. To the contrary, it is already clear and plannedthat asynchronous
  * loading will be implemented, at least as an alternative if not as the onlyimplementation. Also check
  * section <b>Asynchronous Contract</b> above.<br>Applications that need to ensure synchronous loading
  * of dependencies <b>MUST</b> use the old{@link jQuery.sap.require}
  * API.</li><li><code>sap.ui.define</code> does not support plugins to use other file types, formats
  * orprotocols. It is not planned to support this in future</li><li><code>sap.ui.define</code> does
  * <b>not</b> support the 'sugar' of requireJS where CommonJSstyle dependency declarations using
  * <code>sap.ui.require("something")</code> are automagicallyconverted into <code>sap.ui.define</code>
  * dependencies before executing the factory function.</li></ul><b>Limitations, Design
  * Considerations</b><br><ul><li><b>Limitation</b>: as dependency management is not supported for
  * Non-UI5 modules, the only way    to ensure proper execution order for such modules currently is to
  * rely on the order in the    dependency array. Obviously, this only works as long as
  * <code>sap.ui.define</code> uses    synchronous loading. It will be enhanced when asynchronous
  * loading is implemented.</li><li>it was discussed to enfore asynchronous execution of the module
  * factory function (e.g. with a    timeout of 0). But this would have invalidated the current
  * migration scenario where a    sync <code>jQuery.sap.require</code> call can load a
  * <code>sap.ui.define</code>'ed module.    If the module definition would not execute synchronously,
  * the synchronous contract of the    require call would be broken (default behavior in existing UI5
  * apps)</li><li>a single file must not contain multiple calls to <code>sap.ui.define</code>. Multiple
  * calls    currently are only supported in the so called 'preload' files that the UI5 merge tooling
  * produces.    The exact details of how this works might be changed in future implementations and are
  * not    yet part of the API contract</li></ul>
  * @since 1.27.0
  * @param sModuleName name of the module in simplified resource name syntax.       When omitted, the
  * loader determines the name from the request.
  * @param aDependencies list of dependencies of the module
  * @param vFactory the module value or a function that calculates the value
  * @param bExport whether an export to global names is required - should be used by SAP-owned code only
  */
trait ComponentConfig extends js.Object {
  // 	initial data of the Component (@see sap.ui.core.Component#getComponentData)
  var componentData: js.UndefOr[js.Any] = js.undefined
  // 	the sId of the new Component
  var id: js.UndefOr[java.lang.String] = js.undefined
  // 	the name of the Component to load
  var name: java.lang.String
  //	the mSettings of the new Component
  var settings: js.UndefOr[js.Any] = js.undefined
  // 	an alternate location from where to load the Component
  var url: js.UndefOr[java.lang.String] = js.undefined
}

