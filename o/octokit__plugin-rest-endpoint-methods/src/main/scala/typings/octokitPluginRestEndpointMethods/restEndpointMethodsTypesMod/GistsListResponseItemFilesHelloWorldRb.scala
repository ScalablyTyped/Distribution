package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListResponseItemFilesHelloWorldRb extends js.Object {
  var filename: String
  var language: String
  var raw_url: String
  var size: Double
  var `type`: String
}

object GistsListResponseItemFilesHelloWorldRb {
  @scala.inline
  def apply(filename: String, language: String, raw_url: String, size: Double, `type`: String): GistsListResponseItemFilesHelloWorldRb = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListResponseItemFilesHelloWorldRb]
  }
}

