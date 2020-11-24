package typings.officeUiFabricReact.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IList extends js.Object {
  
  /**
    * Force the component to update.
    */
  def forceUpdate(): Unit = js.native
  
  /**
    * Get the start index of the page that is currently in view
    */
  def getStartItemIndexInView(): Double = js.native
  
  /**
    * Get the current height the list and it's pages.
    */
  var getTotalListHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /**
    * Scroll to the given index. By default will bring the page the specified item is on into the view. If a callback
    * to measure the height of an individual item is specified, will only scroll to bring the specific item into view.
    *
    * Note: with items of variable height and no passed in `getPageHeight` method, the list might jump after scrolling
    * when windows before/ahead are being rendered, and the estimated height is replaced using actual elements.
    *
    * @param index - Index of item to scroll to
    * @param measureItem - Optional callback to measure the height of an individual item
    * @param scrollToMode - Optional defines the behavior of the scrolling alignment. Defaults to auto.
    *  Note: The scrollToMode requires the measureItem callback is provided to function.
    */
  def scrollToIndex(index: Double): Unit = js.native
  def scrollToIndex(index: Double, measureItem: js.UndefOr[scala.Nothing], scrollToMode: ScrollToMode): Unit = js.native
  def scrollToIndex(index: Double, measureItem: js.Function1[/* itemIndex */ Double, Double]): Unit = js.native
  def scrollToIndex(
    index: Double,
    measureItem: js.Function1[/* itemIndex */ Double, Double],
    scrollToMode: ScrollToMode
  ): Unit = js.native
}
