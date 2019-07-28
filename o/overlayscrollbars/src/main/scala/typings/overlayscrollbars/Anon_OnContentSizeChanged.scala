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
    if (onContentSizeChanged != null) __obj.updateDynamic("onContentSizeChanged")(onContentSizeChanged)
    if (onDestroyed != null) __obj.updateDynamic("onDestroyed")(onDestroyed)
    if (onDirectionChanged != null) __obj.updateDynamic("onDirectionChanged")(onDirectionChanged)
    if (onHostSizeChanged != null) __obj.updateDynamic("onHostSizeChanged")(onHostSizeChanged)
    if (onInitializationWithdrawn != null) __obj.updateDynamic("onInitializationWithdrawn")(onInitializationWithdrawn)
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(onInitialized)
    if (onOverflowAmountChanged != null) __obj.updateDynamic("onOverflowAmountChanged")(onOverflowAmountChanged)
    if (onOverflowChanged != null) __obj.updateDynamic("onOverflowChanged")(onOverflowChanged)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(onScrollStart)
    if (onScrollStop != null) __obj.updateDynamic("onScrollStop")(onScrollStop)
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(onUpdated)
    __obj.asInstanceOf[Anon_OnContentSizeChanged]
  }
}

