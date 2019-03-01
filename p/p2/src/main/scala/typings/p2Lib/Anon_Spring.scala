package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spring extends js.Object {
  var spring: p2Lib.p2Mod.p2Ns.Spring
  var `type`: java.lang.String
}

object Anon_Spring {
  @scala.inline
  def apply(spring: p2Lib.p2Mod.p2Ns.Spring, `type`: java.lang.String): Anon_Spring = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("spring")(spring)
    __obj.asInstanceOf[Anon_Spring]
  }
}

