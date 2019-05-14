package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbsolutePath extends js.Object {
  var absolutePath: java.lang.String
  var cacheable: scala.Boolean
  var content: js.UndefOr[java.lang.String] = js.undefined
  var hash: java.lang.String
  var sourceMapUrl: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_AbsolutePath {
  @scala.inline
  def apply(
    absolutePath: java.lang.String,
    cacheable: scala.Boolean,
    hash: java.lang.String,
    `type`: java.lang.String,
    content: java.lang.String = null,
    sourceMapUrl: java.lang.String = null
  ): Anon_AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath, cacheable = cacheable, hash = hash)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (sourceMapUrl != null) __obj.updateDynamic("sourceMapUrl")(sourceMapUrl)
    __obj.asInstanceOf[Anon_AbsolutePath]
  }
}

