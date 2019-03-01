package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderSource extends js.Object {
  var noCache: scala.Boolean
  var path: java.lang.String
  var src: java.lang.String
}

object LoaderSource {
  @scala.inline
  def apply(noCache: scala.Boolean, path: java.lang.String, src: java.lang.String): LoaderSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("noCache")(noCache)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[LoaderSource]
  }
}

