package typings
package openui5Lib.sapNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui")
@js.native
object uiNsMembers extends js.Object {
  /**
    * Creates a new instance of a <code>Component</code> or returns the instanceof an existing
    * <code>Component</code>.If you want to look up an existing <code>Component</code> you can callthis
    * function with a Component ID as parameter:<pre>  var oComponent =
    * sap.ui.component(sComponentId);</pre>To create a new instance of a component you pass a component
    * configurationobject into this function:<pre>  var oComponent = sap.ui.component({    name:
    * "my.Component",    url: "my/component/location",    id: "myCompId1"  });</pre>
    * @since 1.15.0
    * @param vConfig ID of an existing Component or the configuration object to create the Component
    * @returns the Component instance or a Promise in case of asynchronous loading
    */
  //  Creates a new instance of a Component or returns the instance of an existing Component.
  def component(vConfig: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Component | jqueryLib.JQueryPromise[_] = js.native
  def component(vConfig: js.Any): openui5Lib.sapNs.uiNs.coreNs.Component | jqueryLib.JQueryPromise[_] = js.native
  def component(vConfig: ComponentConfig): jqueryLib.JQueryPromise[openui5Lib.sapNs.uiNs.coreNs.Component] | openui5Lib.sapNs.uiNs.coreNs.Component = js.native
  /**
    * Defines a controller class or creates an instance of an already defined controller class.When a name
    * and a controller implementation object is given, a new controller classof the given name is created.
    * The members of the implementation object will be copiedinto each new instance of that controller
    * class (shallow copy).<b>Note</b>: as the members are shallow copied, controller instances will share
    * all object values.This might or might not be what applications expect.If only a name is given, a new
    * instance of the named controller class is returned.
    * @param sName The controller name
    * @param oControllerImpl An object literal defining the methods and properties of the controller
    * @returns void or the new controller instance, depending on the use case
    */
  def controller(sName: java.lang.String): scala.Unit | openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller = js.native
  def controller(sName: java.lang.String, oControllerImpl: js.Any): scala.Unit | openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller = js.native
  def define(aDependencies: js.Any, vFactory: js.Any): scala.Unit = js.native
  def define(sModuleName: java.lang.String, aDependencies: js.Any, vFactory: js.Any): scala.Unit = js.native
  //  Defines a Javascript module with its name, its dependencies and a module value or factory.
  def define(vFactory: js.Any): scala.Unit = js.native
  //  Creates 0.
  def extensionpoint(oContainer: js.Any, sExtName: java.lang.String): scala.Unit = js.native
  def extensionpoint(oContainer: js.Any, sExtName: java.lang.String, fnCreateDefaultContent: js.Any): scala.Unit = js.native
  def extensionpoint(
    oContainer: js.Any,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: js.Any
  ): scala.Unit = js.native
  def extensionpoint(
    oContainer: js.Any,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: js.Any,
    sAggregationName: java.lang.String
  ): scala.Unit = js.native
  def extensionpoint(oContainer: openui5Lib.sapNs.uiNs.coreNs.Fragment, sExtName: java.lang.String): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.Fragment,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.Fragment,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: openui5Lib.sapNs.uiNs.coreNs.Control
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.Fragment,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    sAggregationName: java.lang.String
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Creates 0..n UI5 controls from an ExtensionPoint.One control if the ExtensionPoint is e.g. filled
    * with a View, zero for ExtensionPoints without configured extension andn controls for multi-root
    * Fragments as extension.In JSViews, this function allows both JSON notation in aggregation content as
    * well as adding an extension point to an aggregation after the target controlhas already been
    * instantiated. In the latter case the optional parameters oTargetControls and oTargetAggregation need
    * to be specified.
    * @param oContainer The view or fragment containing the extension point
    * @param sExtName The extensionName used to identify the extension point in the customizing
    * @param fnCreateDefaultContent Optional callback function creating default content, returning an
    * Array of controls. It is executed			when there's no customizing, if not provided, no default content
    * will be rendered.
    * @param oTargetControl Optional - use this parameter to attach the extension point to a particular
    * aggregation
    * @param sAggregationName Optional - if provided along with oTargetControl, the extension point
    * content is added to this particular aggregation at oTargetControl,			if not given, but an
    * oTargetControl is still present, the function will attempt to add the extension point to the default
    * aggregation of oTargetControl.			If no oTargetControl is provided, sAggregationName will also be
    * ignored.
    * @returns an array with 0..n controls created from an ExtensionPoint
    */
  def extensionpoint(oContainer: openui5Lib.sapNs.uiNs.coreNs.mvcNs.View, sExtName: java.lang.String): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.mvcNs.View,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.mvcNs.View,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: openui5Lib.sapNs.uiNs.coreNs.Control
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def extensionpoint(
    oContainer: openui5Lib.sapNs.uiNs.coreNs.mvcNs.View,
    sExtName: java.lang.String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: openui5Lib.sapNs.uiNs.coreNs.Control,
    sAggregationName: java.lang.String
  ): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Instantiate a Fragment - this method loads the Fragment content, instantiates it, and returns this
    * content.The Fragment object itself is not an entity which has further significance beyond this
    * constructor.To instantiate an existing Fragment, call this method as:   sap.ui.fragment(sName,
    * sType, [oController]);The sName must correspond to an XML Fragment which can be loadedvia the module
    * system (fragmentName + suffix ".fragment.[typeextension]") and which defines the Fragment content.If
    * oController is given, the (event handler) methods referenced in the Fragment will be called on this
    * controller.Note that Fragments may require a Controller to be given and certain methods to be
    * available.The Fragment types "XML", "JS" and "HTML" are available by default; additional Fragment
    * types can be implementedand added using the sap.ui.core.Fragment.registerType() function.Advanced
    * usage:To instantiate a Fragment and give further configuration options, call this method as:   
    * sap.ui.fragment(oFragmentConfig, [oController]);The oFragmentConfig object can have the following
    * properties:- "fragmentName": the name of the Fragment, as above- "fragmentContent": the definition
    * of the Fragment content itself. When this property is given, any given name is ignored.        The
    * type of this property depends on the Fragment type, e.g. it could be a string for XML Fragments.-
    * "type": the type of the Fragment, as above (mandatory)- "id": the ID of the Fragment
    * (optional)Further properties may be supported by future or custom Fragment types. Any given
    * propertieswill be forwarded to the Fragment implementation.If you want to give a fixed ID for the
    * Fragment, please use the advanced version of this method call with theconfiguration object or use
    * the typed factories like sap.ui.xmlfragment(...) or sap.ui.jsfragment(...).Otherwise the Fragment ID
    * is generated. In any case, the Fragment ID will be used as prefix for the ID ofall contained
    * controls.
    * @param sName the Fragment name
    * @param sType the Fragment type, e.g. "XML", "JS", or "HTML"
    * @param oController the Controller which should be used by the controls in the Fragment. Note that
    * some Fragments may not need a Controller and other may need one - and even rely on certain methods
    * implemented in the Controller.
    * @returns the root Control(s) of the Fragment content
    */
  def fragment(sName: java.lang.String, sType: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def fragment(sName: java.lang.String, sType: java.lang.String, oController: js.Any): scala.Unit = js.native
  def fragment(
    sName: java.lang.String,
    sType: java.lang.String,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  //  Instantiate a Fragment - this method loads the Fragment content, instantiates it, and returns this content.
  @JSName("fragment")
  def fragment_Unit(sName: java.lang.String, sType: java.lang.String): scala.Unit = js.native
  //  Retrieve the SAPUI5 Core instance for the current window.
  //  and returns it or if a library name is specified then the version info of the individual library will be returned.
  def getCore(): openui5Lib.sapNs.uiNs.coreNs.Core = js.native
  // Loads the version info file (resources/sap-ui-version.json):void;
  def getVersionInfo(): scala.Unit = js.native
  /**
    * Loads the version info file (resources/sap-ui-version.json) and returnsit or if a library name is
    * specified then the version info of the individuallibrary will be returned.In case of the version
    * info file is not available an error will occur whencalling this function.
    * @param mOptions name of the library (e.g. "sap.ui.core") or a object map (see below)
    * @returns the full version info, the library specific one,                                  
    * undefined (if library is not listed or there was an error and "failOnError" is set to "false")      
    *                             or a Promise which resolves with one of them
    */
  def getVersionInfo(mOptions: java.lang.String): js.Any | jqueryLib.JQueryPromise[_] = js.native
  def getVersionInfo(mOptions: js.Any): js.Any | jqueryLib.JQueryPromise[_] = js.native
  @JSName("getVersionInfo")
  def getVersionInfo_Unit(sLibName: java.lang.String): scala.Unit = js.native
  /**
    * Instantiates an HTML-based Fragment.To instantiate a Fragment, call this method as:  
    * sap.ui.htmlfragment([sId], sFragmentName, [oController]);The Fragment instance ID is optional
    * (generated if not given) and will be used as prefix for the ID of allcontained controls. The
    * sFragmentName must correspond to an HTML Fragment which can be loadedvia the module system
    * (fragmentName + ".fragment.html") and which defines the Fragment.If oController is given, the
    * methods referenced in the Fragment will be called on this controller.Note that Fragments may require
    * a Controller to be given and certain methods to be available.Advanced usage:To instantiate a
    * Fragment and optionally directly give the HTML definition instead of loading it from a file,call
    * this method as:    sap.ui.htmlfragment(oFragmentConfig, [oController]);The oFragmentConfig object
    * can have a either a "fragmentName" or a "fragmentContent" property.fragmentContent is optional and
    * can hold the Fragment definition as XML string; if notgiven, fragmentName must be given and the
    * Fragment content definition is loaded by the module system.Again, if oController is given, the
    * methods referenced in the Fragment will be called on this controller.
    * @param sId id of the newly created Fragment
    * @param vFragment name of the Fragment (or Fragment configuration as described above, in this case no
    * sId may be given. Instead give the id inside the config object, if desired.)
    * @param oController a Controller to be used for event handlers in the Fragment
    * @returns the root Control(s) of the created Fragment instance
    */
  def htmlfragment(sId: java.lang.String, vFragment: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def htmlfragment(
    sId: java.lang.String,
    vFragment: java.lang.String,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def htmlfragment(sId: java.lang.String, vFragment: js.Any): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def htmlfragment(sId: java.lang.String, vFragment: js.Any, oController: js.Any): scala.Unit = js.native
  def htmlfragment(
    sId: java.lang.String,
    vFragment: js.Any,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  //  Instantiates an HTML-based Fragment.
  def htmlfragment(vFragment: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  def htmlfragment(vFragment: js.Any, oController: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  @JSName("htmlfragment")
  def htmlfragment_Unit(sId: java.lang.String, vFragment: js.Any): scala.Unit = js.native
  /**
    * Defines or creates an instance of a declarative HTML view.The behavior of this method depends on the
    * signature of the call and on the current context.<ul><li>View Definition <code>sap.ui.htmlview(sId,
    * vView)</code>: Defines a view of the given name with the givenimplementation. sId must be the views
    * name, vView must be an object and can containimplementations for any of the hooks provided by
    * HTMLView</li><li>View Instantiation <code>sap.ui.htmlview(sId?, vView)</code>: Creates an instance
    * of the view with the given name (and id)</li>.</ul>Any other call signature will lead to a runtime
    * error. If the id is omitted in the second variant, an id willbe created automatically.
    * @param sId id of the newly created view, only allowed for instance creation
    * @param vView name or implementation of the view.
    * @returns the created HTMLView instance in the creation case, otherwise undefined
    */
  def htmlview(sId: java.lang.String, vView: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.HTMLView | js.Any = js.native
  def htmlview(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.HTMLView | js.Any = js.native
  //  Defines or creates an instance of a declarative HTML view.
  def htmlview(vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.HTMLView = js.native
  @JSName("htmlview")
  def htmlview_HTMLView(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.HTMLView = js.native
  //  Defines OR instantiates an HTML-based Fragment.
  def jsfragment(sFragmentName: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  /**
    * Defines OR instantiates an HTML-based Fragment.To define a JS Fragment, call this method as:  
    * sap.ui.jsfragment(sName, oFragmentDefinition)Where:- "sName" is the name by which this fragment can
    * be found and instantiated. If defined in its own file,   in order to be found by the module loading
    * system, the file location and name must correspond to sName   (path + file name must be:
    * fragmentName + ".fragment.js").- "oFragmentDefinition" is an object at least holding the
    * "createContent(oController)" method which defines   the Fragment content. If given during
    * instantiation, the createContent method receives a Controller   instance (otherwise oController is
    * undefined) and the return value must be one sap.ui.core.Control   (which could have any number of
    * children).To instantiate a JS Fragment, call this method as:   sap.ui.jsfragment([sId],
    * sFragmentName, [oController]);The Fragment ID is optional (generated if not given) and the Fragment
    * implementation CAN use itto make contained controls unique (this depends on the implementation: some
    * JS Fragments may choosenot to support multiple instances within one application and not use the ID
    * prefixing).The sFragmentName must correspond to a JS Fragment which can be loadedvia the module
    * system (fragmentName + ".fragment.js") and which defines the Fragment.If oController is given, the
    * methods referenced in the Fragment will be called on this controller.Note that Fragments may require
    * a Controller to be given and certain methods to be available.
    * @param sId id of the newly created Fragment
    * @param sFragmentName name of the Fragment (or Fragment configuration as described above, in this
    * case no sId may be given. Instead give the id inside the config object, if desired)
    * @param oController a Controller to be used for event handlers in the Fragment
    * @returns the root Control(s) of the created Fragment instance
    */
  def jsfragment(sId: java.lang.String, sFragmentName: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def jsfragment(sId: java.lang.String, sFragmentName: java.lang.String, oController: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  def jsfragment(
    sId: java.lang.String,
    sFragmentName: java.lang.String,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def jsfragment(sId: java.lang.String, sFragmentName: js.Any): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def jsfragment(
    sId: java.lang.String,
    sFragmentName: js.Any,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  @JSName("jsfragment")
  def jsfragment_Fragment(sFragmentName: java.lang.String, oController: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  @JSName("jsfragment")
  def jsfragment_Fragment(sId: java.lang.String, sFragmentName: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  /**
    * Creates a JSON view of the given name and id.The <code>viewName</code> must either correspond to a
    * JSON module that can be loadedvia the module system (viewName + suffix ".view.json") and which
    * defines the view or it mustbe a configuration object for a view.The configuration object can have a
    * viewName, viewContent and a controller property. The viewNamebehaves as described above, viewContent
    * can hold the view description as JSON string or as object literal.<strong>Note</strong>: when an
    * object literal is given, it might be modified during view construction.The controller property can
    * hold an controller instance. If a controller instance is given,it overrides the controller defined
    * in the view.Like with any other control, an id is optional and will be created when missing.
    * @param sId id of the newly created view
    * @param vView name of a view resource or view configuration as described above.
    * @returns the created JSONView instance
    */
  def jsonview(sId: java.lang.String, vView: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSONView = js.native
  def jsonview(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  //  Creates a JSON view of the given name and id.
  def jsonview(vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  @JSName("jsonview")
  def jsonview_JSONView(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSONView = js.native
  /**
    * Defines or creates an instance of a JavaScript view.The behavior of this method depends on the
    * signature of the call and on the current context.<ul><li>View Definition <code>sap.ui.jsview(sId,
    * vView)</code>: Defines a view of the given name with the givenimplementation. sId must be the view's
    * name, vView must be an object and can containimplementations for any of the hooks provided by
    * JSView</li><li>View Instantiation <code>sap.ui.jsview(sId?, vView)</code>: Creates an instance of
    * the view with the given name (and id).If no view implementation has been defined for that view name,
    * a JavaScript module with the same name and with suffix "view.js" will be loadedand executed. The
    * module should contain a view definition (1st. variant above). </li></ul>Any other call signature
    * will lead to a runtime error. If the id is omitted in the second variant, an id willbe created
    * automatically.
    * @param sId id of the newly created view, only allowed for instance creation
    * @param vView name or implementation of the view.
    * @param bAsync defines how the view source is loaded and rendered later on (only relevant for
    * instantiation, ignored for everything else)
    * @returns the created JSView instance in the creation case, otherwise undefined
    */
  def jsview(sId: java.lang.String, vView: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView | js.Any = js.native
  def jsview(sId: java.lang.String, vView: java.lang.String, bAsync: scala.Boolean): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView | js.Any = js.native
  def jsview(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView | js.Any = js.native
  def jsview(sId: java.lang.String, vView: js.Any, bAsync: scala.Boolean): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView | js.Any = js.native
  //  Defines or creates an instance of a JavaScript view.
  def jsview(vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView = js.native
  @JSName("jsview")
  def jsview_JSView(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.JSView = js.native
  //  Creates a lazy loading stub for a given class sClassName.
  def lazyRequire(sClassName: java.lang.String): scala.Unit = js.native
  def lazyRequire(sClassName: java.lang.String, sMethods: java.lang.String): scala.Unit = js.native
  def lazyRequire(sClassName: java.lang.String, sMethods: java.lang.String, sModuleName: java.lang.String): scala.Unit = js.native
  /**
    * Redirects access to resources that are part of the given namespace to a locationrelative to the
    * assumed <b>application root folder</b>.Any UI5 managed resource (view, controller, control,
    * JavaScript module, CSS file, etc.)whose resource name starts with <code>sNamespace</code>, will be
    * loaded from anequally named subfolder of the <b>application root folder</b>.If the resource name
    * consists of multiple segments (separated by a dot), each segmentis assumed to represent an
    * individual folder. In other words: when a resource name isconverted to an URL, any dots ('.') are
    * converted to slashes ('/').<b>Limitation:</b> For the time being, the <b>application root folder</b>
    * is assumed to bethe same as the folder where the current page resides in.Usage sample:<pre>  // Let
    * UI5 know that resources, whose name starts with "com.mycompany.myapp"  // should be loaded from the
    * URL location "./com/mycompany/myapp"  sap.ui.localResources("com.mycompany.myapp");  // The
    * following call implicitly will use the mapping done by the previous line  // It will load a view
    * from ./com/mycompany/myapp/views/Main.view.xml  sap.ui.view({ view :
    * "com.mycompany.myapp.views.Main", type : sap.ui.core.mvc.ViewType.XML});</pre>When applications need
    * a more flexible mapping between resource names and their location,they can use {@link
    * jQuery.sap.registerModulePath}.It is intended to make this configuration obsolete in future
    * releases, but for the timebeing, applications must call this method when they want to store
    * resources relative tothe assumed application root folder.
    * @param sNamespace Namespace prefix for which to load resources relative to the application root
    * folder
    */
  def localResources(sNamespace: java.lang.String): scala.Unit = js.native
  //  Redirects access to resources that are part of the given namespace to a location relative to the assumed application root folder.
  @JSName("localResources")
  def localResources_Any(sNamespace: java.lang.String): js.Any = js.native
  /**
    * Ensures that a given a namespace or hierarchy of nested namespaces exists in thecurrent
    * <code>window</code>.
    * @param sNamespace undefined
    * @returns the innermost namespace of the hierarchy
    */
  def namespace(sNamespace: java.lang.String): js.Any = js.native
  /**
    * Resolves one or more module dependencies.<b>Synchronous Retrieval of a Single Module Value</b>When
    * called with a single string, that string is assumed to be the name of an already loadedmodule and
    * the value of that module is returned. If the module has not been loaded yet,or if it is a Non-UI5
    * module (e.g. third party module), <code>undefined</code> is returned.This signature variant allows
    * synchronous access to module values without initiating module loading.Sample:<pre>  var JSONModel =
    * sap.ui.require("sap/ui/model/json/JSONModel");</pre>For modules that are known to be UI5 modules,
    * this signature variant can be used to check whetherthe module has been loaded.<b>Asynchronous
    * Loading of Multiple Modules</b>If an array of strings is given and (optionally) a callback function,
    * then the stringsare interpreted as module names and the corresponding modules (and their
    * transitivedependencies) are loaded. Then the callback function will be called asynchronously.The
    * module values of the specified modules will be provided as parameters to the callbackfunction in the
    * same order in which they appeared in the dependencies array.The return value for the asynchronous
    * use case is <code>undefined</code>.<pre>  sap.ui.require(['sap/ui/model/json/JSONModel',
    * 'sap/ui/core/UIComponent'], function(JSONModel,UIComponent) {    var MyComponent =
    * UIComponent.extend('MyComponent', {      ...    });    ...  });</pre>This method uses the same
    * variation of the {@link jQuery.sap.getResourcePath unified resource name}syntax that {@link
    * sap.ui.define} uses: module names are specified without the implicit extension '.js'.Relative module
    * names are not supported.
    * @param vDependencies dependency (dependencies) to resolve
    * @param fnCallback callback function to execute after resolving an array of dependencies
    * @returns a single module value or undefined
    */
  def require(vDependencies: java.lang.String): js.Any = js.native
  def require(vDependencies: java.lang.String, fnCallback: js.Any): js.Any = js.native
  //  Resolves one or more module dependencies.
  def require(vDependencies: js.Any): scala.Unit = js.native
  def require(vDependencies: js.Any, fnCallback: js.Any): scala.Unit = js.native
  def require(vDependencies: js.Array[java.lang.String]): js.Any = js.native
  def require(vDependencies: js.Array[java.lang.String], fnCallback: js.Any): js.Any = js.native
  /**
    * Returns the URL of a resource that belongs to the given library and has the given relative location
    * within the library.This is mainly meant for static resources like images that are inside the
    * library.It is NOT meant for access to JavaScript modules or anything for which a different URL has
    * been registered with jQuery.sap.registerModulePath(). Forthese cases use
    * jQuery.sap.getModulePath().It DOES work, however, when the given sResourcePath starts with "themes/"
    * (= when it is a theme-dependent resource). Even when for this theme a differentlocation outside the
    * normal library location is configured.
    * @param sLibraryName the name of a library, like "sap.ui.commons"
    * @param sResourcePath the relative path of a resource inside this library, like "img/mypic.png" or
    * "themes/my_theme/img/mypic.png"
    * @returns the URL of the requested resource
    */
  def resource(sLibraryName: java.lang.String, sResourcePath: java.lang.String): java.lang.String = js.native
  //  Returns the URL of a resource that belongs to the given library and has the given relative location within the library.
  @JSName("resource")
  def resource_Unit(sLibraryName: java.lang.String, sResourcePath: java.lang.String): scala.Unit = js.native
  /**
    * Displays the control tree with the given root inside the area of the givenDOM reference (or inside
    * the DOM node with the given ID) or in the given Control.Example:<pre>  &lt;div
    * id="SAPUI5UiArea">&lt;/div>  &lt;script type="text/javascript">    var oRoot = new
    * sap.ui.commons.Label();    oRoot.setText("Hello world!");    sap.ui.setRoot("SAPUI5UiArea", oRoot); 
    * &lt;/script></pre><p>This is a shortcut for <code>sap.ui.getCore().setRoot()</code>.Internally, if a
    * string is given that does not identify an UIArea or a controlthen implicitly a new
    * <code>UIArea</code> is created for the given DOM referenceand the given control is added.
    * @param oDomRef a DOM Element or Id String of the UIArea
    * @param oControl the Control that should be added to the <code>UIArea</code>.
    */
  def setRoot(oDomRef: java.lang.String, oControl: openui5Lib.sapNs.uiNs.baseNs.Interface): scala.Unit = js.native
  def setRoot(oDomRef: java.lang.String, oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  def setRoot(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Control, oControl: openui5Lib.sapNs.uiNs.baseNs.Interface): scala.Unit = js.native
  def setRoot(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Control, oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  def setRoot(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Element, oControl: openui5Lib.sapNs.uiNs.baseNs.Interface): scala.Unit = js.native
  def setRoot(oDomRef: openui5Lib.sapNs.uiNs.coreNs.Element, oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  //  Creates a Template for the given id, dom reference or a configuration object.
  def template(): js.Any = js.native
  /**
    * Creates a Template for the given id, dom reference or a configuration object.If no parameter is
    * defined this function makes a lookup of DOM elementswhich are specifying a type attribute. If the
    * value of this type attributematches an registered type then the content of this DOM element will
    * beused to create a new <code>Template</code> instance.If you want to lookup all kind of existing and
    * known templates and parse themdirectly you can simply call:<pre>  sap.ui.template();</pre>To parse a
    * concrete DOM element you can do so by using this function in thefollowing way:<pre> 
    * sap.ui.template("theTemplateId");</pre>Or you can pass the reference to a DOM element and use this
    * DOM element asa source for the template:<pre>  sap.ui.template(oDomRef);</pre>The last option to use
    * this function is to pass the information via aconfiguration object. This configuration object can be
    * used to pass acontext for the templating framework when compiling the template:<pre>  var
    * oTemplateById = sap.ui.template({    id: "theTemplateId",    context: { ... }  });  var
    * oTemplateByDomRef = sap.ui.template({    domref: oDomRef,    context: { ... }  });</pre>It can also
    * be used to load a template from another file:<pre>  var oTemplate = sap.ui.template({    id:
    * "myTemplate",    src: "myTemplate.tmpl"  });  var oTemplateWithContext = sap.ui.template({    id:
    * "myTemplate",    src: "myTemplate.tmpl",    context: { ... }  });</pre>The properties of the
    * configuration object are the following:<ul><li><code>id</code> - the ID of the Template / the ID  of
    * the DOM element containing the source of the Template</li><li><code>domref</code> - the DOM element
    * containing the source of the Template</li><li><code>type</code> - the type of the
    * Template</li><li><code>src</code> - the URL to lookup the template</li>
    * (<i>experimental!</i>)<li><code>control</code> - the fully qualified name of the control to
    * declare</li> (<i>experimental!</i>)</ul>
    * @param oTemplate the id or the DOM reference to the template to lookup or an configuration object
    * containing the src, type and eventually the id of the Template.
    * @returns the created Template instance        or in case of usage without parametes any array of
    * templates is returned
    */
  def template(oTemplate: java.lang.String): js.Any | js.Array[_] = js.native
  def template(oTemplate: js.Any): js.Any | js.Array[_] = js.native
  @JSName("template")
  def template_Any(oTemplate: js.Any): js.Any = js.native
  /**
    * Defines or creates an instance of a template view.The behavior of this method depends on the
    * signature of the call and on the current context.<ul><li>View Definition
    * <code>sap.ui.templateview(sId, vView)</code>: Defines a view of the given name with the
    * givenimplementation. sId must be the views name, vView must be an object and can
    * containimplementations for any of the hooks provided by templateview</li><li>View Instantiation
    * <code>sap.ui.templateview(sId?, vView)</code>: Creates an instance of the view with the given name
    * (and id)</li>.</ul>Any other call signature will lead to a runtime error. If the id is omitted in
    * the second variant, an id willbe created automatically.
    * @param sId id of the newly created view, only allowed for instance creation
    * @param vView name or implementation of the view.
    * @returns the created TemplateView instance in the creation case, otherwise undefined
    */
  def templateview(sId: java.lang.String, vView: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.TemplateView | js.Any = js.native
  def templateview(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.TemplateView | js.Any = js.native
  //  Defines or creates an instance of a template view.
  def templateview(vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.TemplateView = js.native
  @JSName("templateview")
  def templateview_TemplateView(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.TemplateView = js.native
  //  Creates a view of the given type, name and with the given id.
  /**
    * Creates a view of the given type, name and with the given id.The <code>vView</code> configuration
    * object can have the following properties for the viewinstantiation:<ul><li>The ID
    * <code>vView.id</code> specifies an ID for the View instance. If no ID is given,an ID will be
    * generated.</li><li>The view name <code>vView.viewName</code> corresponds to an XML module that can
    * be loadedvia the module system (vView.viewName + suffix ".view.xml")</li><li>The controller instance
    * <code>vView.controller</code> must be a valid controller implementation.The given controller
    * instance overrides the controller defined in the view definition</li><li>The view type
    * <code>vView.type</code> specifies what kind of view will be instantiated. All validview types are
    * listed in the enumeration sap.ui.core.mvc.ViewType.</li><li>The view data
    * <code>vView.viewData</code> can hold user specific data. This data is availableduring the whole
    * lifecycle of the view and the controller</li><li>The view loading mode <code>vView.async</code> must
    * be a boolean and defines if the view source is loadedsynchronously or asynchronously. In async mode,
    * the view is rendered empty initially, and rerenderd with theloaded view
    * content.</li><li><code>vView.preprocessors</code></li> can hold a map from the specified
    * preprocessor type (e.g. "xml") to an array ofpreprocessor configurations; each configuration
    * consists of a <code>preprocessor</code> property (optional whenregistered as on-demand preprocessor)
    * and may contain further preprocessor-specific settings. The preprocessor canbe either a module name
    * as string implementation of {@link sap.ui.core.mvc.View.Preprocessor} or a function according
    * to{@link sap.ui.core.mvc.View.Preprocessor.process}. Do not set properties starting with underscore
    * like <code>_sProperty</code>property, these are reserved for internal purposes. When several
    * preprocessors are provided for one hook, it has to be madesure that they do not conflict when beeing
    * processed serially.<strong>Note</strong>: These preprocessors are only available to this instance.
    * For global oron-demand availability use {@link
    * sap.ui.core.mvc.XMLView.registerPreprocessor}.<strong>Note</strong>: Please note that preprocessors
    * in general are currently only availableto XMLViews.<strong>Note</strong>: Preprocessors only work in
    * async views and will be ignored when the view is instantiatedin sync mode by default, as this could
    * have unexpected side effects. You may override this behaviour by setting thebSyncSupport flag of the
    * preprocessor to true.
    * @param sId id of the newly created view, only allowed for instance creation
    * @param vView the view name or view configuration object
    * @returns the created View instance
    */
  def view(sId: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  def view(sId: java.lang.String, vView: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  def view(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  /**
    * Instantiates an XML-based Fragment.To instantiate a Fragment, call this method as:  
    * sap.ui.xmlfragment([sId], sFragmentName, [oController]);The Fragment instance ID is optional
    * (generated if not given) and will be used as prefix for the ID of allcontained controls. The
    * sFragmentName must correspond to an XML Fragment which can be loadedvia the module system
    * (fragmentName + ".fragment.xml") and which defines the Fragment.If oController is given, the methods
    * referenced in the Fragment will be called on this controller.Note that Fragments may require a
    * Controller to be given and certain methods to be available.Advanced usage:To instantiate a Fragment
    * and optionally directly give the XML definition instead of loading it from a file,call this method
    * as:    sap.ui.xmlfragment(oFragmentConfig, [oController]);The oFragmentConfig object can have a
    * either a "fragmentName" or a "fragmentContent" property.fragmentContent is optional and can hold the
    * Fragment definition as XML string; if notgiven, fragmentName must be given and the Fragment content
    * definition is loaded by the module system.Again, if oController is given, the methods referenced in
    * the Fragment will be called on this controller.
    * @param sId id of the newly created Fragment
    * @param vFragment name of the Fragment (or Fragment configuration as described above, in this case no
    * sId may be given. Instead give the id inside the config object, if desired)
    * @param oController a Controller to be used for event handlers in the Fragment
    * @returns the root Control(s) of the created Fragment instance
    */
  def xmlfragment(sId: java.lang.String, vFragment: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def xmlfragment(
    sId: java.lang.String,
    vFragment: java.lang.String,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def xmlfragment(sId: java.lang.String, vFragment: js.Any): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def xmlfragment(sId: java.lang.String, vFragment: js.Any, oController: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  def xmlfragment(
    sId: java.lang.String,
    vFragment: js.Any,
    oController: openui5Lib.sapNs.uiNs.coreNs.mvcNs.Controller
  ): openui5Lib.sapNs.uiNs.coreNs.Control | js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  //  Instantiates an XML-based Fragment.
  def xmlfragment(vFragment: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  def xmlfragment(vFragment: js.Any, oController: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  @JSName("xmlfragment")
  def xmlfragment_Fragment(sId: java.lang.String, vFragment: js.Any): openui5Lib.sapNs.uiNs.coreNs.Fragment = js.native
  /**
    * Instantiates an XMLView of the given name and with the given ID.The <code>viewName</code> must
    * either correspond to an XML module that can be loadedvia the module system (viewName + suffix
    * ".view.xml") and which defines the view, or it mustbe a configuration object for a view.The
    * configuration object can have a <code>viewName</code>, <code>viewContent</code> and a
    * <code>controller</code> property. The <code>viewName</code> behaves as described above.
    * <code>viewContent</code> is optionaland can hold a view description as XML string or as already
    * parsed XML Document. If not given, the view content definition is loaded by the module
    * system.<strong>Note</strong>: if a <code>Document</code> is given, it might be modified during view
    * construction.<strong>Note</strong>: if you enable caching, you need to take care of the invalidation
    * via keys. Automaticinvalidation takes only place if the UI5 version or the component descriptor
    * (manifest.json) change. This isstill an experimental feature and may experience slight changes of
    * the invalidation parameters or the cachekey format.The controller property can hold an controller
    * instance. If a controller instance is given,it overrides the controller defined in the view.Like
    * with any other control, ID is optional and one will be created automatically.
    * @param sId ID of the newly created view
    * @param vView Name of the view or a view configuration object as described above
    * @param  undefined
    * @returns the created XMLView instance
    */
  def xmlview(sId: java.lang.String, vView: java.lang.String, param: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLView = js.native
  def xmlview(sId: java.lang.String, vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
  def xmlview(sId: java.lang.String, vView: js.Any, param: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLView = js.native
  //  Instantiates an XMLView of the given name and with the given id.
  def xmlview(vView: js.Any): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
}

