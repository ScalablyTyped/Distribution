package typings.mcustomscrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlwaysTriggerOffsets extends js.Object {
  /**
    * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
    * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
    * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
    */
  var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to call right before scrollbar(s) are updated.
    */
  var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when plugin markup is created.
    */
  var onCreate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
    */
  var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrollbars have initialized
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes wide enough and horizontal scrollbar is added.
    */
  var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
    */
  var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes long enough and vertical scrollbar is added.
    */
  var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes short enough and vertical scrollbar is removed.
    */
  var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
    */
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
    */
  var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
    */
  var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
    */
  var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Set an offset for which the onTotalScrollBack callback is triggered.
    * Its value is in pixels
    */
  var onTotalScrollBackOffset: js.UndefOr[Double] = js.undefined
  /**
    * Set an offset for which the onTotalScroll callback is triggered.
    * Its value is in pixels.
    */
  var onTotalScrollOffset: js.UndefOr[Double] = js.undefined
  /**
    * A function to call when scrollbar(s) are updated.
    */
  var onUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered while scrolling
    */
  var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonAlwaysTriggerOffsets {
  @scala.inline
  def apply(
    alwaysTriggerOffsets: js.UndefOr[Boolean] = js.undefined,
    onBeforeUpdate: () => Unit = null,
    onCreate: () => Unit = null,
    onImageLoad: () => Unit = null,
    onInit: () => Unit = null,
    onOverflowX: () => Unit = null,
    onOverflowXNone: () => Unit = null,
    onOverflowY: () => Unit = null,
    onOverflowYNone: () => Unit = null,
    onScroll: () => Unit = null,
    onScrollStart: () => Unit = null,
    onSelectorChange: () => Unit = null,
    onTotalScroll: () => Unit = null,
    onTotalScrollBack: () => Unit = null,
    onTotalScrollBackOffset: Int | Double = null,
    onTotalScrollOffset: Int | Double = null,
    onUpdate: () => Unit = null,
    whileScrolling: () => Unit = null
  ): AnonAlwaysTriggerOffsets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysTriggerOffsets)) __obj.updateDynamic("alwaysTriggerOffsets")(alwaysTriggerOffsets.asInstanceOf[js.Any])
    if (onBeforeUpdate != null) __obj.updateDynamic("onBeforeUpdate")(js.Any.fromFunction0(onBeforeUpdate))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction0(onCreate))
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction0(onImageLoad))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onOverflowX != null) __obj.updateDynamic("onOverflowX")(js.Any.fromFunction0(onOverflowX))
    if (onOverflowXNone != null) __obj.updateDynamic("onOverflowXNone")(js.Any.fromFunction0(onOverflowXNone))
    if (onOverflowY != null) __obj.updateDynamic("onOverflowY")(js.Any.fromFunction0(onOverflowY))
    if (onOverflowYNone != null) __obj.updateDynamic("onOverflowYNone")(js.Any.fromFunction0(onOverflowYNone))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction0(onScroll))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction0(onScrollStart))
    if (onSelectorChange != null) __obj.updateDynamic("onSelectorChange")(js.Any.fromFunction0(onSelectorChange))
    if (onTotalScroll != null) __obj.updateDynamic("onTotalScroll")(js.Any.fromFunction0(onTotalScroll))
    if (onTotalScrollBack != null) __obj.updateDynamic("onTotalScrollBack")(js.Any.fromFunction0(onTotalScrollBack))
    if (onTotalScrollBackOffset != null) __obj.updateDynamic("onTotalScrollBackOffset")(onTotalScrollBackOffset.asInstanceOf[js.Any])
    if (onTotalScrollOffset != null) __obj.updateDynamic("onTotalScrollOffset")(onTotalScrollOffset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction0(onUpdate))
    if (whileScrolling != null) __obj.updateDynamic("whileScrolling")(js.Any.fromFunction0(whileScrolling))
    __obj.asInstanceOf[AnonAlwaysTriggerOffsets]
  }
}

