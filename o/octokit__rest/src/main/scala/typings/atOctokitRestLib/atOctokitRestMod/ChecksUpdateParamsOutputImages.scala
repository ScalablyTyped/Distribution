package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutputImages extends js.Object {
  var alt: java.lang.String
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var image_url: java.lang.String
}

object ChecksUpdateParamsOutputImages {
  @scala.inline
  def apply(alt: java.lang.String, image_url: java.lang.String, caption: java.lang.String = null): ChecksUpdateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt, image_url = image_url)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    __obj.asInstanceOf[ChecksUpdateParamsOutputImages]
  }
}

