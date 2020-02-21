package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataFile extends js.Object {
  var data: AnonMapTo
  var file: AnonAlias
  var headers: AnonRequired
  @JSName("headers.content-length")
  var `headersDotcontent-length`: AnonRequired
  @JSName("headers.content-type")
  var `headersDotcontent-type`: AnonRequired
  var label: AnonType
  var name: AnonRequired
  var url: AnonRequired
}

object AnonDataFile {
  @scala.inline
  def apply(
    data: AnonMapTo,
    file: AnonAlias,
    headers: AnonRequired,
    `headersDotcontent-length`: AnonRequired,
    `headersDotcontent-type`: AnonRequired,
    label: AnonType,
    name: AnonRequired,
    url: AnonRequired
  ): AnonDataFile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-length")(`headersDotcontent-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-type")(`headersDotcontent-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataFile]
  }
}

