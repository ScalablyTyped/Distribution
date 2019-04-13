package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateParamsFiles extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object GistsUpdateParamsFiles {
  @scala.inline
  def apply(content: java.lang.String = null, filename: java.lang.String = null): GistsUpdateParamsFiles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[GistsUpdateParamsFiles]
  }
}

