package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.touch")
@js.native
object touchNs extends js.Object {
  /**
         * Given a list of touches, count the number of touches related with the given element.
         * @param oTouchList The list of touch objects to search.
         * @param vElement A jQuery element or an element reference or an element id.
         * @returns The number of touches related with the given element.
        */
  def countContained(oTouchList: stdLib.TouchList, vElement: java.lang.String): scala.Double = js.native
  /**
         * Given a list of touches, count the number of touches related with the given element.
         * @param oTouchList The list of touch objects to search.
         * @param vElement A jQuery element or an element reference or an element id.
         * @returns The number of touches related with the given element.
        */
  def countContained(oTouchList: stdLib.TouchList, vElement: jqueryLib.JQueryStatic): scala.Double = js.native
  /**
         * Given a list of touches, count the number of touches related with the given element.
         * @param oTouchList The list of touch objects to search.
         * @param vElement A jQuery element or an element reference or an element id.
         * @returns The number of touches related with the given element.
        */
  def countContained(oTouchList: stdLib.TouchList, vElement: openui5Lib.sapNs.uiNs.coreNs.Element): scala.Double = js.native
  /**
         * Given a list of touch objects, find the touch that matches the given one.
         * @param oTouchList The list of touch objects to search.
         * @param oTouch A touch object to find or a Touch.identifier that uniquely identifies the current
         * finger in the touch session.
         * @returns The touch matching if any.
        */
  def find(oTouchList: stdLib.TouchList, oTouch: openui5Lib.Anon_TouchInitDict): js.Any = js.native
  /**
         * Given a list of touch objects, find the touch that matches the given one.
         * @param oTouchList The list of touch objects to search.
         * @param oTouch A touch object to find or a Touch.identifier that uniquely identifies the current
         * finger in the touch session.
         * @returns The touch matching if any.
        */
  def find(oTouchList: stdLib.TouchList, oTouch: scala.Double): js.Any = js.native
}

