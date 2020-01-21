package typings.passwordHashAndSalt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit
  def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit
}

object Password {
  @scala.inline
  def apply(
    hash: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit,
    verifyAgainst: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit
  ): Password = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), verifyAgainst = js.Any.fromFunction2(verifyAgainst))
  
    __obj.asInstanceOf[Password]
  }
}

