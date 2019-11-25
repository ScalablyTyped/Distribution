package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.BasicEventCallback
import typings.overlayscrollbars.overlayscrollbarsMod.DirectionChangedCallback
import typings.overlayscrollbars.overlayscrollbarsMod.OverflowAmountChangedCallback
import typings.overlayscrollbars.overlayscrollbarsMod.OverflowChangedCallback
import typings.overlayscrollbars.overlayscrollbarsMod.ScrollEventCallback
import typings.overlayscrollbars.overlayscrollbarsMod.SizeChangedCallback
import typings.overlayscrollbars.overlayscrollbarsMod.UpdatedCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnContentSizeChanged extends js.Object {
  var onContentSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.undefined
  var onDestroyed: js.UndefOr[BasicEventCallback | Null] = js.undefined
  var onDirectionChanged: js.UndefOr[DirectionChangedCallback | Null] = js.undefined
  var onHostSizeChanged: js.UndefOr[SizeChangedCallback | Null] = js.undefined
  var onInitializationWithdrawn: js.UndefOr[BasicEventCallback | Null] = js.undefined
  var onInitialized: js.UndefOr[BasicEventCallback | Null] = js.undefined
  var onOverflowAmountChanged: js.UndefOr[OverflowAmountChangedCallback | Null] = js.undefined
  var onOverflowChanged: js.UndefOr[OverflowChangedCallback | Null] = js.undefined
  var onScroll: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  var onScrollStart: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  var onScrollStop: js.UndefOr[ScrollEventCallback | Null] = js.undefined
  var onUpdated: js.UndefOr[UpdatedCallback | Null] = js.undefined
}

object Anon_OnContentSizeChanged {
  @scala.inline
  def apply(
    onContentSizeChanged: SizeChangedCallback = null,
    onDestroyed: BasicEventCallback = null,
    onDirectionChanged: DirectionChangedCallback = null,
    onHostSizeChanged: SizeChangedCallback = null,
    onInitializationWithdrawn: BasicEventCallback = null,
    onInitialized: BasicEventCallback = null,
    onOverflowAmountChanged: OverflowAmountChangedCallback = null,
    onOverflowChanged: OverflowChangedCallback = null,
    onScroll: ScrollEventCallback = null,
    onScrollStart: ScrollEventCallback = null,
    onScrollStop: ScrollEventCallback = null,
    onUpdated: UpdatedCallback = null
  ): Anon_OnContentSizeChanged = {
    val __obj = js.Dynamic.literal()
    if (onContentSizeChanged != null) __obj.updateDynamic("onContentSizeChanged")(onContentSizeChanged.asInstanceOf[js.Any])
    if (onDestroyed != null) __obj.updateDynamic("onDestroyed")(onDestroyed.asInstanceOf[js.Any])
    if (onDirectionChanged != null) __obj.updateDynamic("onDirectionChanged")(onDirectionChanged.asInstanceOf[js.Any])
    if (onHostSizeChanged != null) __obj.updateDynamic("onHostSizeChanged")(onHostSizeChanged.asInstanceOf[js.Any])
    if (onInitializationWithdrawn != null) __obj.updateDynamic("onInitializationWithdrawn")(onInitializationWithdrawn.asInstanceOf[js.Any])
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(onInitialized.asInstanceOf[js.Any])
    if (onOverflowAmountChanged != null) __obj.updateDynamic("onOverflowAmountChanged")(onOverflowAmountChanged.asInstanceOf[js.Any])
    if (onOverflowChanged != null) __obj.updateDynamic("onOverflowChanged")(onOverflowChanged.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(onScrollStart.asInstanceOf[js.Any])
    if (onScrollStop != null) __obj.updateDynamic("onScrollStop")(onScrollStop.asInstanceOf[js.Any])
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(onUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnContentSizeChanged]
  }
}

