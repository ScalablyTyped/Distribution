package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsList
  extends officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.IList {
  /**
       * Scroll to and focus the item at the given index. focusIndex will call scrollToIndex on the specified index.
       *
       * @param index - Index of item to scroll to
       * @param forceIntoFirstElement - If true, focus will be set to the first focusable child element of the item rather
       *  than the item itself.
       * @param measureItem - Optional callback to measure the height of an individual item
       * @param scrollToMode - Optional setting to determine where in the window the item should be scrolled to when focused.
       */
  def focusIndex(index: scala.Double): scala.Unit = js.native
  /**
       * Scroll to and focus the item at the given index. focusIndex will call scrollToIndex on the specified index.
       *
       * @param index - Index of item to scroll to
       * @param forceIntoFirstElement - If true, focus will be set to the first focusable child element of the item rather
       *  than the item itself.
       * @param measureItem - Optional callback to measure the height of an individual item
       * @param scrollToMode - Optional setting to determine where in the window the item should be scrolled to when focused.
       */
  def focusIndex(index: scala.Double, forceIntoFirstElement: scala.Boolean): scala.Unit = js.native
  /**
       * Scroll to and focus the item at the given index. focusIndex will call scrollToIndex on the specified index.
       *
       * @param index - Index of item to scroll to
       * @param forceIntoFirstElement - If true, focus will be set to the first focusable child element of the item rather
       *  than the item itself.
       * @param measureItem - Optional callback to measure the height of an individual item
       * @param scrollToMode - Optional setting to determine where in the window the item should be scrolled to when focused.
       */
  def focusIndex(
    index: scala.Double,
    forceIntoFirstElement: scala.Boolean,
    measureItem: js.Function1[/* itemIndex */ scala.Double, scala.Double]
  ): scala.Unit = js.native
  /**
       * Scroll to and focus the item at the given index. focusIndex will call scrollToIndex on the specified index.
       *
       * @param index - Index of item to scroll to
       * @param forceIntoFirstElement - If true, focus will be set to the first focusable child element of the item rather
       *  than the item itself.
       * @param measureItem - Optional callback to measure the height of an individual item
       * @param scrollToMode - Optional setting to determine where in the window the item should be scrolled to when focused.
       */
  def focusIndex(
    index: scala.Double,
    forceIntoFirstElement: scala.Boolean,
    measureItem: js.Function1[/* itemIndex */ scala.Double, scala.Double],
    scrollToMode: officeDashUiDashFabricDashReactLib.libComponentsListListDotTypesMod.ScrollToMode
  ): scala.Unit = js.native
}

