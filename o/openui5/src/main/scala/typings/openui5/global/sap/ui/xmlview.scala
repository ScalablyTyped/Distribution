package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.mvc.View
import typings.openui5.sap.ui.core.mvc.XMLView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.xmlview")
@js.native
object xmlview extends js.Object {
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
  def apply(sId: String, vView: String, param: js.Any): XMLView = js.native
  def apply(sId: String, vView: js.Any): View = js.native
  def apply(sId: String, vView: js.Any, param: js.Any): XMLView = js.native
  //  Instantiates an XMLView of the given name and with the given id.
  def apply(vView: js.Any): View = js.native
}

