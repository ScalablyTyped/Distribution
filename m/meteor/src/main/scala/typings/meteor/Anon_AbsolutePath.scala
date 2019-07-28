package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsolutePath extends js.Object {
  var absolutePath: String
  var cacheable: Boolean
  var content: js.UndefOr[String] = js.undefined
  var hash: String
  var sourceMapUrl: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_AbsolutePath {
  @scala.inline
  def apply(
    absolutePath: String,
    cacheable: Boolean,
    hash: String,
    `type`: String,
    content: String = null,
    sourceMapUrl: String = null
  ): Anon_AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath, cacheable = cacheable, hash = hash)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (sourceMapUrl != null) __obj.updateDynamic("sourceMapUrl")(sourceMapUrl)
    __obj.asInstanceOf[Anon_AbsolutePath]
  }
}

