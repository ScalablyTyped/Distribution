package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysTriggerOffsets extends js.Object {
  /**
    * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
    * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
    * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
    */
  var alwaysTriggerOffsets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function to call right before scrollbar(s) are updated.
    */
  var onBeforeUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when plugin markup is created.
    */
  var onCreate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
    */
  var onImageLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when scrollbars have initialized
    */
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when content becomes wide enough and horizontal scrollbar is added.
    */
  var onOverflowX: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
    */
  var onOverflowXNone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when content becomes long enough and vertical scrollbar is added.
    */
  var onOverflowY: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when content becomes short enough and vertical scrollbar is removed.
    */
  var onOverflowYNone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
    */
  var onScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
    */
  var onScrollStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
    */
  var onSelectorChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
    */
  var onTotalScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
    */
  var onTotalScrollBack: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Set an offset for which the onTotalScrollBack callback is triggered.
    * Its value is in pixels
    */
  var onTotalScrollBackOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set an offset for which the onTotalScroll callback is triggered.
    * Its value is in pixels.
    */
  var onTotalScrollOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function to call when scrollbar(s) are updated.
    */
  var onUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * User defined callback function, triggered while scrolling
    */
  var whileScrolling: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_AlwaysTriggerOffsets {
  @scala.inline
  def apply(
    alwaysTriggerOffsets: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeUpdate: js.Function0[scala.Unit] = null,
    onCreate: js.Function0[scala.Unit] = null,
    onImageLoad: js.Function0[scala.Unit] = null,
    onInit: js.Function0[scala.Unit] = null,
    onOverflowX: js.Function0[scala.Unit] = null,
    onOverflowXNone: js.Function0[scala.Unit] = null,
    onOverflowY: js.Function0[scala.Unit] = null,
    onOverflowYNone: js.Function0[scala.Unit] = null,
    onScroll: js.Function0[scala.Unit] = null,
    onScrollStart: js.Function0[scala.Unit] = null,
    onSelectorChange: js.Function0[scala.Unit] = null,
    onTotalScroll: js.Function0[scala.Unit] = null,
    onTotalScrollBack: js.Function0[scala.Unit] = null,
    onTotalScrollBackOffset: scala.Int | scala.Double = null,
    onTotalScrollOffset: scala.Int | scala.Double = null,
    onUpdate: js.Function0[scala.Unit] = null,
    whileScrolling: js.Function0[scala.Unit] = null
  ): Anon_AlwaysTriggerOffsets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysTriggerOffsets)) __obj.updateDynamic("alwaysTriggerOffsets")(alwaysTriggerOffsets)
    if (onBeforeUpdate != null) __obj.updateDynamic("onBeforeUpdate")(onBeforeUpdate)
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate)
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(onImageLoad)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onOverflowX != null) __obj.updateDynamic("onOverflowX")(onOverflowX)
    if (onOverflowXNone != null) __obj.updateDynamic("onOverflowXNone")(onOverflowXNone)
    if (onOverflowY != null) __obj.updateDynamic("onOverflowY")(onOverflowY)
    if (onOverflowYNone != null) __obj.updateDynamic("onOverflowYNone")(onOverflowYNone)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(onScrollStart)
    if (onSelectorChange != null) __obj.updateDynamic("onSelectorChange")(onSelectorChange)
    if (onTotalScroll != null) __obj.updateDynamic("onTotalScroll")(onTotalScroll)
    if (onTotalScrollBack != null) __obj.updateDynamic("onTotalScrollBack")(onTotalScrollBack)
    if (onTotalScrollBackOffset != null) __obj.updateDynamic("onTotalScrollBackOffset")(onTotalScrollBackOffset.asInstanceOf[js.Any])
    if (onTotalScrollOffset != null) __obj.updateDynamic("onTotalScrollOffset")(onTotalScrollOffset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (whileScrolling != null) __obj.updateDynamic("whileScrolling")(whileScrolling)
    __obj.asInstanceOf[Anon_AlwaysTriggerOffsets]
  }
}

