package typings.nivoCore

import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.nivoCoreStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon[T] extends js.Object {
  var id: String
  var `match`: js.Object | SvgFillMatcher[T] | Asterisk
}

object Anon {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | Asterisk): Anon[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon[T]]
  }
}

