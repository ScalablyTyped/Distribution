package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseFilesHelloWorldPythonTxt extends js.Object {
  var content: java.lang.String
  var filename: java.lang.String
  var language: java.lang.String
  var raw_url: java.lang.String
  var size: scala.Double
  var truncated: scala.Boolean
  var `type`: java.lang.String
}

object GistsGetResponseFilesHelloWorldPythonTxt {
  @scala.inline
  def apply(
    content: java.lang.String,
    filename: java.lang.String,
    language: java.lang.String,
    raw_url: java.lang.String,
    size: scala.Double,
    truncated: scala.Boolean,
    `type`: java.lang.String
  ): GistsGetResponseFilesHelloWorldPythonTxt = {
    val __obj = js.Dynamic.literal(content = content, filename = filename, language = language, raw_url = raw_url, size = size, truncated = truncated)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GistsGetResponseFilesHelloWorldPythonTxt]
  }
}

