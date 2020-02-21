package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateParamsFiles extends js.Object {
  /**
    * The updated content of the file.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The new name for this file. To delete a file, set the value of the filename to `null`.
    */
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

