package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateParamsFiles extends js.Object {
  var content: js.UndefOr[String] = js.undefined
}

object GistsCreateParamsFiles {
  @scala.inline
  def apply(content: String = null): GistsCreateParamsFiles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[GistsCreateParamsFiles]
  }
}

