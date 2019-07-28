package typings.p2

import typings.p2.p2Mod.Spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spring extends js.Object {
  var spring: Spring
  var `type`: String
}

object Anon_Spring {
  @scala.inline
  def apply(spring: Spring, `type`: String): Anon_Spring = {
    val __obj = js.Dynamic.literal(spring = spring)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Spring]
  }
}

