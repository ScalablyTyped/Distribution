package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphImages extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OpenGraphImages {
  @scala.inline
  def apply(
    alt: String = null,
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): OpenGraphImages = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphImages]
  }
}

