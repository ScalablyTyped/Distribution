package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseFilesHelloWorldPy extends js.Object {
  var content: String
  var filename: String
  var language: String
  var raw_url: String
  var size: Double
  var truncated: Boolean
  var `type`: String
}

object GistsGetRevisionResponseFilesHelloWorldPy {
  @scala.inline
  def apply(
    content: String,
    filename: String,
    language: String,
    raw_url: String,
    size: Double,
    truncated: Boolean,
    `type`: String
  ): GistsGetRevisionResponseFilesHelloWorldPy = {
    val __obj = js.Dynamic.literal(content = content, filename = filename, language = language, raw_url = raw_url, size = size, truncated = truncated)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GistsGetRevisionResponseFilesHelloWorldPy]
  }
}

