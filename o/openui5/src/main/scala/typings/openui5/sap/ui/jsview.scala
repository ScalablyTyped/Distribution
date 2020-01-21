package typings.openui5.sap.ui

import typings.openui5.sap.ui.core.mvc.JSView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.jsview")
@js.native
object jsview extends js.Object {
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
  def apply(sId: String, vView: String): JSView | js.Any = js.native
  def apply(sId: String, vView: String, bAsync: Boolean): JSView | js.Any = js.native
  def apply(sId: String, vView: js.Any): JSView = js.native
  def apply(sId: String, vView: js.Any, bAsync: Boolean): JSView | js.Any = js.native
  //  Defines or creates an instance of a JavaScript view.
  def apply(vView: js.Any): JSView = js.native
}

