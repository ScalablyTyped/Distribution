package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item
  extends photoswipeLib.photoswipeMod.Item {
  /**
    * The caption for this item.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
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
    msrc: java.lang.String = null,
    title: java.lang.String = null,
    vGap: photoswipeLib.Anon_BottomTop = null
  ): Item = {
    val __obj = js.Dynamic.literal(h = h, src = src, w = w)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (fitRatio != null) __obj.updateDynamic("fitRatio")(fitRatio.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition)
    if (initialZoomLevel != null) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError)
    if (msrc != null) __obj.updateDynamic("msrc")(msrc)
    if (title != null) __obj.updateDynamic("title")(title)
    if (vGap != null) __obj.updateDynamic("vGap")(vGap)
    __obj.asInstanceOf[Item]
  }
}

