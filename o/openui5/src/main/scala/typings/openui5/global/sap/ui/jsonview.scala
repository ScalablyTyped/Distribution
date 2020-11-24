package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.mvc.JSONView
import typings.openui5.sap.ui.core.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.jsonview")
@js.native
object jsonview extends js.Object {
  
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
  def apply(sId: String, vView: String): JSONView = js.native
  def apply(sId: String, vView: js.Any): JSONView = js.native
  //  Creates a JSON view of the given name and id.
  def apply(vView: js.Any): View = js.native
}
