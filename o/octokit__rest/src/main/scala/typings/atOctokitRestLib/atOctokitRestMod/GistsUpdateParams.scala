package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateParams extends js.Object {
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The filenames and content that make up this gist.
    */
  var files: js.UndefOr[GistsUpdateParamsFiles] = js.undefined
  var gist_id: java.lang.String
}

object GistsUpdateParams {
  @scala.inline
  def apply(
    gist_id: java.lang.String,
    description: java.lang.String = null,
    files: GistsUpdateParamsFiles = null
  ): GistsUpdateParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[GistsUpdateParams]
  }
}

