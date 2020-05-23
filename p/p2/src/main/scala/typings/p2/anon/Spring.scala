package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spring extends js.Object {
  var spring: typings.p2.mod.Spring
  var `type`: String
}

object Spring {
  @scala.inline
  def apply(spring: typings.p2.mod.Spring, `type`: String): Spring = {
    val __obj = js.Dynamic.literal(spring = spring.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spring]
  }
}

