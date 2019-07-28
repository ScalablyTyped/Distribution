package typings.openui5.sapNs.uiNs.coreNs

import typings.openui5.sapNs.uiNs.coreNs.mvcNs.HTMLView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.DeclarativeSupport")
@js.native
class DeclarativeSupport () extends js.Object {
  /**
    * Enhances the given DOM element by parsing the Control and Elements info and creatingthe SAPUI5
    * controls for them.
    * @param oElement the DOM element to compile
    * @param oView The view instance to use
    * @param isRecursive Whether the call of the function is recursive.
    */
  def compile(oElement: Element): Unit = js.native
  def compile(oElement: Element, oView: HTMLView): Unit = js.native
  def compile(oElement: Element, oView: HTMLView, isRecursive: Boolean): Unit = js.native
}

