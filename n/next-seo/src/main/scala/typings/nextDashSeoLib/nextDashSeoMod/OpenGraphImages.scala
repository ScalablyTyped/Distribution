package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphImages extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object OpenGraphImages {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): OpenGraphImages = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphImages]
  }
}

