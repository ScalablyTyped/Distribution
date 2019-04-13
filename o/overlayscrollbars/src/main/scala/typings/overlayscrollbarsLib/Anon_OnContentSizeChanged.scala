package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnContentSizeChanged extends js.Object {
  var onContentSizeChanged: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.SizeChangedCallback | scala.Null] = js.undefined
  var onDestroyed: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback | scala.Null] = js.undefined
  var onDirectionChanged: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.DirectionChangedCallback | scala.Null] = js.undefined
  var onHostSizeChanged: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.SizeChangedCallback | scala.Null] = js.undefined
  var onInitializationWithdrawn: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback | scala.Null] = js.undefined
  var onInitialized: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback | scala.Null] = js.undefined
  var onOverflowAmountChanged: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.OverflowAmountChangedCallback | scala.Null
  ] = js.undefined
  var onOverflowChanged: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverflowChangedCallback | scala.Null] = js.undefined
  var onScroll: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback | scala.Null] = js.undefined
  var onScrollStart: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback | scala.Null] = js.undefined
  var onScrollStop: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback | scala.Null] = js.undefined
  var onUpdated: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.UpdatedCallback | scala.Null] = js.undefined
}

object Anon_OnContentSizeChanged {
  @scala.inline
  def apply(
    onContentSizeChanged: overlayscrollbarsLib.overlayscrollbarsMod.SizeChangedCallback = null,
    onDestroyed: overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback = null,
    onDirectionChanged: overlayscrollbarsLib.overlayscrollbarsMod.DirectionChangedCallback = null,
    onHostSizeChanged: overlayscrollbarsLib.overlayscrollbarsMod.SizeChangedCallback = null,
    onInitializationWithdrawn: overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback = null,
    onInitialized: overlayscrollbarsLib.overlayscrollbarsMod.BasicEventCallback = null,
    onOverflowAmountChanged: overlayscrollbarsLib.overlayscrollbarsMod.OverflowAmountChangedCallback = null,
    onOverflowChanged: overlayscrollbarsLib.overlayscrollbarsMod.OverflowChangedCallback = null,
    onScroll: overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback = null,
    onScrollStart: overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback = null,
    onScrollStop: overlayscrollbarsLib.overlayscrollbarsMod.ScrollEventCallback = null,
    onUpdated: overlayscrollbarsLib.overlayscrollbarsMod.UpdatedCallback = null
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

