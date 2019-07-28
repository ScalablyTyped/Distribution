package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsForkResponseFilesHelloWorldRb extends js.Object {
  var filename: String
  var language: String
  var raw_url: String
  var size: Double
  var `type`: String
}

object GistsForkResponseFilesHelloWorldRb {
  @scala.inline
  def apply(filename: String, language: String, raw_url: String, size: Double, `type`: String): GistsForkResponseFilesHelloWorldRb = {
    val __obj = js.Dynamic.literal(filename = filename, language = language, raw_url = raw_url, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GistsForkResponseFilesHelloWorldRb]
  }
}

