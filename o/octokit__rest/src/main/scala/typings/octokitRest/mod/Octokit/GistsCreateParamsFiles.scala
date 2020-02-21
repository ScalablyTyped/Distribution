package typings.octokitRest.mod.Octokit

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
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateParamsFiles]
  }
}

