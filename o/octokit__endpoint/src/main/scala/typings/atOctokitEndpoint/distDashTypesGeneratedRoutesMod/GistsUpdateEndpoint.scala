package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[js.Object] = js.undefined
  var `files.content`: js.UndefOr[String] = js.undefined
  var `files.filename`: js.UndefOr[String] = js.undefined
  var gist_id: String
}

object GistsUpdateEndpoint {
  @scala.inline
  def apply(
    gist_id: String,
    description: String = null,
    files: js.Object = null,
    `files.content`: String = null,
    `files.filename`: String = null
  ): GistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (files != null) __obj.updateDynamic("files")(files)
    if (`files.content` != null) __obj.updateDynamic("files.content")(`files.content`)
    if (`files.filename` != null) __obj.updateDynamic("files.filename")(`files.filename`)
    __obj.asInstanceOf[GistsUpdateEndpoint]
  }
}

