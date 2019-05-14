package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdate_Options extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[js.Object] = js.undefined
  var `files.content`: js.UndefOr[java.lang.String] = js.undefined
  var `files.filename`: js.UndefOr[java.lang.String] = js.undefined
  var gist_id: java.lang.String
}

object GistsUpdate_Options {
  @scala.inline
  def apply(
    gist_id: java.lang.String,
    description: java.lang.String = null,
    files: js.Object = null,
    `files.content`: java.lang.String = null,
    `files.filename`: java.lang.String = null
  ): GistsUpdate_Options = {
    val __obj = js.Dynamic.literal(gist_id = gist_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (files != null) __obj.updateDynamic("files")(files)
    if (`files.content` != null) __obj.updateDynamic("files.content")(`files.content`)
    if (`files.filename` != null) __obj.updateDynamic("files.filename")(`files.filename`)
    __obj.asInstanceOf[GistsUpdate_Options]
  }
}

