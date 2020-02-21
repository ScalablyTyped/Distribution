package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: AnonType
  var files: AnonRequired
  @JSName("files.content")
  var filesDotcontent: AnonType
  var public: AnonType
}

object AnonDescription {
  @scala.inline
  def apply(description: AnonType, files: AnonRequired, filesDotcontent: AnonType, public: AnonType): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

