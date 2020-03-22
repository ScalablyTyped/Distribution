package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbsolutePath extends js.Object {
  var absolutePath: String
  var cacheable: Boolean
  var content: js.UndefOr[String] = js.undefined
  var hash: String
  var sourceMapUrl: js.UndefOr[String] = js.undefined
  var `type`: String
}

object AnonAbsolutePath {
  @scala.inline
  def apply(
    absolutePath: String,
    cacheable: Boolean,
    hash: String,
    `type`: String,
    content: String = null,
    sourceMapUrl: String = null
  ): AnonAbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (sourceMapUrl != null) __obj.updateDynamic("sourceMapUrl")(sourceMapUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolutePath]
  }
}

