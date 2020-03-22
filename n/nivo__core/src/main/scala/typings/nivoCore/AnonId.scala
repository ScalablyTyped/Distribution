package typings.nivoCore

import typings.nivoCore.mod.SvgFillMatcher
import typings.nivoCore.nivoCoreStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId[T] extends js.Object {
  var id: String
  var `match`: js.Object | SvgFillMatcher[T] | Asterisk
}

object AnonId {
  @scala.inline
  def apply[T](id: String, `match`: js.Object | SvgFillMatcher[T] | Asterisk): AnonId[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId[T]]
  }
}

