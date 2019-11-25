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
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], imageUrlSubdomains = imageUrlSubdomains.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    if (imageryProviders != null) __obj.updateDynamic("imageryProviders")(imageryProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

