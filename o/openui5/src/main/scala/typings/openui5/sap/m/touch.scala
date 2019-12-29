package typings.openui5.sap.m

import typings.jquery.JQueryStatic
import typings.openui5.Anon_TouchInitDict
import typings.openui5.sap.ui.core.Element
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.touch")
@js.native
object touch extends js.Object {
  def countContained(oTouchList: TouchList, vElement: String): Double = js.native
  /**
    * Given a list of touches, count the number of touches related with the given element.
    * @param oTouchList The list of touch objects to search.
    * @param vElement A jQuery element or an element reference or an element id.
    * @returns The number of touches related with the given element.
    */
  def countContained(oTouchList: TouchList, vElement: JQueryStatic): Double = js.native
  def countContained(oTouchList: TouchList, vElement: Element): Double = js.native
  def find(oTouchList: TouchList, oTouch: Double): js.Any = js.native
  /**
    * Given a list of touch objects, find the touch that matches the given one.
    * @param oTouchList The list of touch objects to search.
    * @param oTouch A touch object to find or a Touch.identifier that uniquely identifies the current
    * finger in the touch session.
    * @returns The touch matching if any.
    */
  def find(oTouchList: TouchList, oTouch: Anon_TouchInitDict): js.Any = js.native
}

