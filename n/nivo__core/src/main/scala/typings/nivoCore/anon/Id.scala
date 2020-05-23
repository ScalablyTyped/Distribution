package typings.nivoCore.anon

import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.nivoCoreStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id[T] extends js.Object {
  var id: String
  var `match`: js.Object | SvgFillMatcher[T] | Asterisk
}

object Id {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | Asterisk): Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[T]]
  }
}

