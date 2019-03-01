package typings
package p2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: p2Lib.p2Mod.p2Ns.Body
  var `type`: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(body: p2Lib.p2Mod.p2Ns.Body, `type`: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Anon_Body]
  }
}

