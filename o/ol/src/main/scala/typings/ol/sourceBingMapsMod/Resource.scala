package typings.ol.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var imageHeight: Double
  var imageUrl: String
  var imageUrlSubdomains: js.Array[String]
  var imageWidth: Double
  var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.undefined
  var zoomMax: Double
  var zoomMin: Double
}

object Resource {
  @scala.inline
  def apply(
    imageHeight: Double,
    imageUrl: String,
    imageUrlSubdomains: js.Array[String],
    imageWidth: Double,
    zoomMax: Double,
    zoomMin: Double,
    imageryProviders: js.Array[ImageryProvider] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight, imageUrl = imageUrl, imageUrlSubdomains = imageUrlSubdomains, imageWidth = imageWidth, zoomMax = zoomMax, zoomMin = zoomMin)
    if (imageryProviders != null) __obj.updateDynamic("imageryProviders")(imageryProviders)
    __obj.asInstanceOf[Resource]
  }
}

