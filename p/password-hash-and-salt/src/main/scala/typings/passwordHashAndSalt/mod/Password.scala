package typings.passwordHashAndSalt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password extends js.Object {
  def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit = js.native
  def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit = js.native
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
  @scala.inline
  implicit class PasswordOps[Self <: Password] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit): Self = this.set("hash", js.Any.fromFunction1(value))
    @scala.inline
    def setVerifyAgainst(value: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit): Self = this.set("verifyAgainst", js.Any.fromFunction2(value))
  }
  
}

