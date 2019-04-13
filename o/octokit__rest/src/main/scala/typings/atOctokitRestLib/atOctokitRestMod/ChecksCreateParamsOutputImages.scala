package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsOutputImages extends js.Object {
  var alt: java.lang.String
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var image_url: java.lang.String
}

object ChecksCreateParamsOutputImages {
  @scala.inline
  def apply(alt: java.lang.String, image_url: java.lang.String, caption: java.lang.String = null): ChecksCreateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt, image_url = image_url)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    __obj.asInstanceOf[ChecksCreateParamsOutputImages]
  }
}

