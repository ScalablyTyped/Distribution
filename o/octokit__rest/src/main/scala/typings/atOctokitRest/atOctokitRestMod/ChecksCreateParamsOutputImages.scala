package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsOutputImages extends js.Object {
  var alt: String
  var caption: js.UndefOr[String] = js.undefined
  var image_url: String
}

object ChecksCreateParamsOutputImages {
  @scala.inline
  def apply(alt: String, image_url: String, caption: String = null): ChecksCreateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt, image_url = image_url)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    __obj.asInstanceOf[ChecksCreateParamsOutputImages]
  }
}

