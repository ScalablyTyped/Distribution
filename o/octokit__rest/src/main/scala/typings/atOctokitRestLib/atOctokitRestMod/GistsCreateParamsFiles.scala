package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateParamsFiles extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object GistsCreateParamsFiles {
  @scala.inline
  def apply(content: java.lang.String = null): GistsCreateParamsFiles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[GistsCreateParamsFiles]
  }
}

