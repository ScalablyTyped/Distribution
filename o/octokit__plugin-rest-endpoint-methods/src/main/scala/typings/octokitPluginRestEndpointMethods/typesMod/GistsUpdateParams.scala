package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateParams extends js.Object {
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The filenames and content that make up this gist.
    */
  var files: js.UndefOr[GistsUpdateParamsFiles] = js.undefined
  var gist_id: String
}

object GistsUpdateParams {
  @scala.inline
  def apply(gist_id: String, description: String = null, files: GistsUpdateParamsFiles = null): GistsUpdateParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateParams]
  }
}

