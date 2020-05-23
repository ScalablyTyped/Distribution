package typings.pdfImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: js.UndefOr[CombinedImage] = js.undefined
}

object `0` {
  @scala.inline
  def apply[CombinedImage](combinedImage: CombinedImage = null): `0`[CombinedImage] = {
    val __obj = js.Dynamic.literal()
    if (combinedImage != null) __obj.updateDynamic("combinedImage")(combinedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[CombinedImage]]
  }
}

