package typings.nodeJose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exp extends js.Object {
  var exp: Boolean | typings.nodeJose.mod.JWS.Exp
}

object Exp {
  @scala.inline
  def apply(exp: Boolean | typings.nodeJose.mod.JWS.Exp): Exp = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exp]
  }
}

