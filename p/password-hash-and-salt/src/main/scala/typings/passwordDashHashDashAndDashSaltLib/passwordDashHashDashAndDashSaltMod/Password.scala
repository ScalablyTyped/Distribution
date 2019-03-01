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
    hash: js.Function1[
      js.Function2[/* error */ java.lang.String, /* hash */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    verifyAgainst: js.Function2[
      java.lang.String, 
      js.Function2[/* error */ java.lang.String, /* verified */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ): Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("verifyAgainst")(verifyAgainst)
    __obj.asInstanceOf[Password]
  }
}

