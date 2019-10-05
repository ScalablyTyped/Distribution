package typings.openui5.sap.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.require")
@js.native
object require extends js.Object {
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
  def apply(vDependencies: String): js.Any = js.native
  def apply(vDependencies: String, fnCallback: js.Any): js.Any = js.native
  //  Resolves one or more module dependencies.
  def apply(vDependencies: js.Any): Unit = js.native
  def apply(vDependencies: js.Any, fnCallback: js.Any): Unit = js.native
  def apply(vDependencies: js.Array[String]): js.Any = js.native
  def apply(vDependencies: js.Array[String], fnCallback: js.Any): js.Any = js.native
}

