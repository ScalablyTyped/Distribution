package typings
package olLib.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var imageHeight: scala.Double
  var imageUrl: java.lang.String
  var imageUrlSubdomains: js.Array[java.lang.String]
  var imageWidth: scala.Double
  var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.undefined
  var zoomMax: scala.Double
  var zoomMin: scala.Double
}

object Resource {
  @scala.inline
  def apply(
    imageHeight: scala.Double,
    imageUrl: java.lang.String,
    imageUrlSubdomains: js.Array[java.lang.String],
    imageWidth: scala.Double,
    zoomMax: scala.Double,
    zoomMin: scala.Double,
    imageryProviders: js.Array[ImageryProvider] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight, imageUrl = imageUrl, imageUrlSubdomains = imageUrlSubdomains, imageWidth = imageWidth, zoomMax = zoomMax, zoomMin = zoomMin)
    if (imageryProviders != null) __obj.updateDynamic("imageryProviders")(imageryProviders)
    __obj.asInstanceOf[Resource]
  }
}

