package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListPublicResponseItemFilesHelloWorldRb extends js.Object {
  var filename: java.lang.String
  var language: java.lang.String
  var raw_url: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
}

object GistsListPublicResponseItemFilesHelloWorldRb {
  @scala.inline
  def apply(
    filename: java.lang.String,
    language: java.lang.String,
    raw_url: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String
  ): GistsListPublicResponseItemFilesHelloWorldRb = {
    val __obj = js.Dynamic.literal(filename = filename, language = language, raw_url = raw_url, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GistsListPublicResponseItemFilesHelloWorldRb]
  }
}

