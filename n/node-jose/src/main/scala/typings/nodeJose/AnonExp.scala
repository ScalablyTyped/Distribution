package typings.nodeJose

import typings.nodeJose.mod.JWS.Exp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExp extends js.Object {
  var exp: Boolean | Exp
}

object AnonExp {
  @scala.inline
  def apply(exp: Boolean | Exp): AnonExp = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExp]
  }
}

