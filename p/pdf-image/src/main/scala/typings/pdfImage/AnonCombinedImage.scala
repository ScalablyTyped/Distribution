package typings.pdfImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCombinedImage[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: CombinedImage
}

object AnonCombinedImage {
  @scala.inline
  def apply[CombinedImage /* <: Boolean */](combinedImage: CombinedImage): AnonCombinedImage[CombinedImage] = {
    val __obj = js.Dynamic.literal(combinedImage = combinedImage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCombinedImage[CombinedImage]]
  }
}

