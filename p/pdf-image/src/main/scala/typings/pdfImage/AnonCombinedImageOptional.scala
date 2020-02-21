package typings.pdfImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCombinedImageOptional[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: js.UndefOr[CombinedImage] = js.undefined
}

object AnonCombinedImageOptional {
  @scala.inline
  def apply[CombinedImage /* <: Boolean */](combinedImage: CombinedImage = null): AnonCombinedImageOptional[CombinedImage] = {
    val __obj = js.Dynamic.literal()
    if (combinedImage != null) __obj.updateDynamic("combinedImage")(combinedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCombinedImageOptional[CombinedImage]]
  }
}

