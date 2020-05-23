package typings.photoswipe.mod

import typings.photoswipe.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * Internal property added by PhotoSwipe.
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    * This number is computed to be this item's smaller dimension divided by the larger dimension.
    */
  var fitRatio: js.UndefOr[Double] = js.undefined
  /**
    * The height of this image.
    */
  var h: js.UndefOr[Double] = js.undefined
  /**
    * HTML content instead of image.
    */
  var html: js.UndefOr[String] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialPosition: js.UndefOr[js.Any] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialZoomLevel: js.UndefOr[Double] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var loadError: js.UndefOr[Boolean] = js.undefined
  /**
    * The url to small image placeholder, large image will be loaded on top
    */
  var msrc: js.UndefOr[String] = js.undefined
  /**
    * The url of this image.
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var vGap: js.UndefOr[Top] = js.undefined
  /**
    * The width of this image.
    */
  var w: js.UndefOr[Double] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    fitRatio: js.UndefOr[Double] = js.undefined,
    h: js.UndefOr[Double] = js.undefined,
    html: String = null,
    initialPosition: js.Any = null,
    initialZoomLevel: js.UndefOr[Double] = js.undefined,
    loadError: js.UndefOr[Boolean] = js.undefined,
    msrc: String = null,
    src: String = null,
    vGap: Top = null,
    w: js.UndefOr[Double] = js.undefined
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(fitRatio)) __obj.updateDynamic("fitRatio")(fitRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(initialZoomLevel)) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError.get.asInstanceOf[js.Any])
    if (msrc != null) __obj.updateDynamic("msrc")(msrc.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (vGap != null) __obj.updateDynamic("vGap")(vGap.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

