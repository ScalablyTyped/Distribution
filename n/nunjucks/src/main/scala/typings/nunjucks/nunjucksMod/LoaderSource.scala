package typings.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderSource extends js.Object {
  var noCache: Boolean
  var path: String
  var src: String
}

object LoaderSource {
  @scala.inline
  def apply(noCache: Boolean, path: String, src: String): LoaderSource = {
    val __obj = js.Dynamic.literal(noCache = noCache.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoaderSource]
  }
}

