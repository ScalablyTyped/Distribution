package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseFilesHelloWorldPy extends js.Object {
  var content: String
  var filename: String
  var language: String
  var raw_url: String
  var size: Double
  var truncated: Boolean
  var `type`: String
}

object GistsUpdateResponseFilesHelloWorldPy {
  @scala.inline
  def apply(
    content: String,
    filename: String,
    language: String,
    raw_url: String,
    size: Double,
    truncated: Boolean,
    `type`: String
  ): GistsUpdateResponseFilesHelloWorldPy = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateResponseFilesHelloWorldPy]
  }
}

