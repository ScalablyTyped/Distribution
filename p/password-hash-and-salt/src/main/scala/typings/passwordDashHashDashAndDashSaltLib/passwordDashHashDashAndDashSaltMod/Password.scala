package typings
package passwordDashHashDashAndDashSaltLib.passwordDashHashDashAndDashSaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  def hash(cb: js.Function2[/* error */ java.lang.String, /* hash */ java.lang.String, scala.Unit]): scala.Unit
  def verifyAgainst(
    hash: java.lang.String,
    cb: js.Function2[/* error */ java.lang.String, /* verified */ scala.Boolean, scala.Unit]
  ): scala.Unit
}

object Password {
  @scala.inline
  def apply(
    hash: js.Function2[/* error */ java.lang.String, /* hash */ java.lang.String, scala.Unit] => scala.Unit,
    verifyAgainst: (java.lang.String, js.Function2[/* error */ java.lang.String, /* verified */ scala.Boolean, scala.Unit]) => scala.Unit
  ): Password = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), verifyAgainst = js.Any.fromFunction2(verifyAgainst))
  
    __obj.asInstanceOf[Password]
  }
}

