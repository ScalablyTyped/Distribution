package typings.p2

import typings.p2.p2Mod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pairs extends js.Object {
  var pairs: js.Array[Body]
  var `type`: String
}

object Anon_Pairs {
  @scala.inline
  def apply(pairs: js.Array[Body], `type`: String): Anon_Pairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pairs]
  }
}

