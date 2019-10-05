package typings.openui5.sap.ui

import typings.openui5.sap.ui.core.mvc.HTMLView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.htmlview")
@js.native
object htmlview extends js.Object {
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
  def apply(sId: String, vView: String): HTMLView | js.Any = js.native
  def apply(sId: String, vView: js.Any): HTMLView | js.Any = js.native
  //  Defines or creates an instance of a declarative HTML view.
  def apply(vView: js.Any): HTMLView = js.native
}

