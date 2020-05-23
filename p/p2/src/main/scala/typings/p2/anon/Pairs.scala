package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pairs extends js.Object {
  var pairs: js.Array[typings.p2.mod.Body]
  var `type`: String
}

object Pairs {
  @scala.inline
  def apply(pairs: js.Array[typings.p2.mod.Body], `type`: String): Pairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pairs]
  }
}

