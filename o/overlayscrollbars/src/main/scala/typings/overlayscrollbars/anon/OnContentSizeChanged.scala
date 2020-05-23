package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.BasicEventCallback
import typings.overlayscrollbars.mod.DirectionChangedCallback
import typings.overlayscrollbars.mod.OverflowAmountChangedCallback
import typings.overlayscrollbars.mod.OverflowChangedCallback
import typings.overlayscrollbars.mod.ScrollEventCallback
import typings.overlayscrollbars.mod.SizeChangedCallback
import typings.overlayscrollbars.mod.UpdatedCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnContentSizeChanged extends js.Object {
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

object OnContentSizeChanged {
  @scala.inline
  def apply(
    onContentSizeChanged: js.UndefOr[Null | SizeChangedCallback] = js.undefined,
    onDestroyed: js.UndefOr[Null | BasicEventCallback] = js.undefined,
    onDirectionChanged: js.UndefOr[Null | DirectionChangedCallback] = js.undefined,
    onHostSizeChanged: js.UndefOr[Null | SizeChangedCallback] = js.undefined,
    onInitializationWithdrawn: js.UndefOr[Null | BasicEventCallback] = js.undefined,
    onInitialized: js.UndefOr[Null | BasicEventCallback] = js.undefined,
    onOverflowAmountChanged: js.UndefOr[Null | OverflowAmountChangedCallback] = js.undefined,
    onOverflowChanged: js.UndefOr[Null | OverflowChangedCallback] = js.undefined,
    onScroll: js.UndefOr[Null | ScrollEventCallback] = js.undefined,
    onScrollStart: js.UndefOr[Null | ScrollEventCallback] = js.undefined,
    onScrollStop: js.UndefOr[Null | ScrollEventCallback] = js.undefined,
    onUpdated: js.UndefOr[Null | UpdatedCallback] = js.undefined
  ): OnContentSizeChanged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onContentSizeChanged)) __obj.updateDynamic("onContentSizeChanged")(onContentSizeChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(onDestroyed)) __obj.updateDynamic("onDestroyed")(onDestroyed.asInstanceOf[js.Any])
    if (!js.isUndefined(onDirectionChanged)) __obj.updateDynamic("onDirectionChanged")(onDirectionChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(onHostSizeChanged)) __obj.updateDynamic("onHostSizeChanged")(onHostSizeChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(onInitializationWithdrawn)) __obj.updateDynamic("onInitializationWithdrawn")(onInitializationWithdrawn.asInstanceOf[js.Any])
    if (!js.isUndefined(onInitialized)) __obj.updateDynamic("onInitialized")(onInitialized.asInstanceOf[js.Any])
    if (!js.isUndefined(onOverflowAmountChanged)) __obj.updateDynamic("onOverflowAmountChanged")(onOverflowAmountChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(onOverflowChanged)) __obj.updateDynamic("onOverflowChanged")(onOverflowChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(onScroll)) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(onScrollStart)) __obj.updateDynamic("onScrollStart")(onScrollStart.asInstanceOf[js.Any])
    if (!js.isUndefined(onScrollStop)) __obj.updateDynamic("onScrollStop")(onScrollStop.asInstanceOf[js.Any])
    if (!js.isUndefined(onUpdated)) __obj.updateDynamic("onUpdated")(onUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnContentSizeChanged]
  }
}

