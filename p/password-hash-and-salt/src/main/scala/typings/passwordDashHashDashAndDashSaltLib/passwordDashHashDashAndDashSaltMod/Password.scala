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

