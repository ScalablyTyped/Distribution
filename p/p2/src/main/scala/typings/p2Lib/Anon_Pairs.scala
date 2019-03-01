package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pairs extends js.Object {
  var pairs: js.Array[p2Lib.p2Mod.p2Ns.Body]
  var `type`: java.lang.String
}

object Anon_Pairs {
  @scala.inline
  def apply(pairs: js.Array[p2Lib.p2Mod.p2Ns.Body], `type`: java.lang.String): Anon_Pairs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pairs")(pairs)
    __obj.asInstanceOf[Anon_Pairs]
  }
}

