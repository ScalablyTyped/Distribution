package typings.openui5.global.sap.m

import typings.jquery.JQueryStatic
import typings.openui5.sap.ui.core.Element
import typings.std.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touch {
  
  @JSGlobal("sap.m.touch")
  @js.native
  val ^ : js.Any = js.native
  
  inline def countContained(oTouchList: TouchList, vElement: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
    * Given a list of touches, count the number of touches related with the given element.
    * @param oTouchList The list of touch objects to search.
    * @param vElement A jQuery element or an element reference or an element id.
    * @returns The number of touches related with the given element.
    */
  inline def countContained(oTouchList: TouchList, vElement: JQueryStatic): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countContained(oTouchList: TouchList, vElement: Element): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Given a list of touch objects, find the touch that matches the given one.
    * @param oTouchList The list of touch objects to search.
    * @param oTouch A touch object to find or a Touch.identifier that uniquely identifies the current
    * finger in the touch session.
    * @returns The touch matching if any.
    */
  inline def find(
    oTouchList: TouchList,
    oTouch: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Touch */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def find(oTouchList: TouchList, oTouch: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
