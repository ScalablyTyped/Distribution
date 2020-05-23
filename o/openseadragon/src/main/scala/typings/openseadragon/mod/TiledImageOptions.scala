package typings.openseadragon.mod

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.Error
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiledImageOptions extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  var clip: js.UndefOr[Rect] = js.undefined
  var collectionImmediately: js.UndefOr[Boolean] = js.undefined
  var compositeOperation: js.UndefOr[String] = js.undefined
  var crossOriginPolicy: js.UndefOr[String] = js.undefined
  var degrees: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var fitBounds: js.UndefOr[Rect] = js.undefined
  var fitBoundsPlacement: js.UndefOr[Placement] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var tileSource: String | js.Object
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object TiledImageOptions {
  @scala.inline
  def apply(
    tileSource: String | js.Object,
    ajaxHeaders: js.Object = null,
    ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined,
    clip: Rect = null,
    collectionImmediately: js.UndefOr[Boolean] = js.undefined,
    compositeOperation: String = null,
    crossOriginPolicy: String = null,
    degrees: js.UndefOr[Double] = js.undefined,
    error: /* error */ Error => Unit = null,
    fitBounds: Rect = null,
    fitBoundsPlacement: Placement = null,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    placeholderFillStyle: String | CanvasGradient | CanvasPattern = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    success: /* event */ Event => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TiledImageOptions = {
    val __obj = js.Dynamic.literal(tileSource = tileSource.asInstanceOf[js.Any])
    if (ajaxHeaders != null) __obj.updateDynamic("ajaxHeaders")(ajaxHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxWithCredentials)) __obj.updateDynamic("ajaxWithCredentials")(ajaxWithCredentials.get.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionImmediately)) __obj.updateDynamic("collectionImmediately")(collectionImmediately.get.asInstanceOf[js.Any])
    if (compositeOperation != null) __obj.updateDynamic("compositeOperation")(compositeOperation.asInstanceOf[js.Any])
    if (crossOriginPolicy != null) __obj.updateDynamic("crossOriginPolicy")(crossOriginPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(degrees)) __obj.updateDynamic("degrees")(degrees.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (fitBounds != null) __obj.updateDynamic("fitBounds")(fitBounds.asInstanceOf[js.Any])
    if (fitBoundsPlacement != null) __obj.updateDynamic("fitBoundsPlacement")(fitBoundsPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWithAjax)) __obj.updateDynamic("loadTilesWithAjax")(loadTilesWithAjax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placeholderFillStyle != null) __obj.updateDynamic("placeholderFillStyle")(placeholderFillStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledImageOptions]
  }
}

