package typings
package photoswipeLib.photoswipeMod

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
  var fitRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of this image.
    */
  var h: scala.Double
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialPosition: js.UndefOr[js.Any] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialZoomLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Internal property added by PhotoSwipe.
    */
  var loadError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The url of this image.
    */
  var src: java.lang.String
  /**
    * Internal property added by PhotoSwipe.
    */
  var vGap: js.UndefOr[photoswipeLib.Anon_BottomTop] = js.undefined
  /**
    * The width of this image.
    */
  var w: scala.Double
}

object Item {
  @scala.inline
  def apply(
    h: scala.Double,
    src: java.lang.String,
    w: scala.Double,
    bounds: js.Any = null,
    fitRatio: scala.Int | scala.Double = null,
    initialPosition: js.Any = null,
    initialZoomLevel: scala.Int | scala.Double = null,
    loadError: js.UndefOr[scala.Boolean] = js.undefined,
    vGap: photoswipeLib.Anon_BottomTop = null
  ): Item = {
    val __obj = js.Dynamic.literal(h = h, src = src, w = w)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (fitRatio != null) __obj.updateDynamic("fitRatio")(fitRatio.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition)
    if (initialZoomLevel != null) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError)
    if (vGap != null) __obj.updateDynamic("vGap")(vGap)
    __obj.asInstanceOf[Item]
  }
}

