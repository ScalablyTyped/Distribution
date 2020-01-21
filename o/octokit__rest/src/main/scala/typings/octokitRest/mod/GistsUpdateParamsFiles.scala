package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateParamsFiles extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object GistsUpdateParamsFiles {
  @scala.inline
  def apply(content: String = null, filename: String = null): GistsUpdateParamsFiles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateParamsFiles]
  }
}

