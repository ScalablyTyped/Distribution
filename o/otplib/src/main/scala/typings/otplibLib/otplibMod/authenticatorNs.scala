package typings
package otplibLib.otplibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib", "authenticator")
@js.native
object authenticatorNs extends js.Object {
  trait VerifyOptions extends js.Object {
    var secret: java.lang.String
    var token: java.lang.String
  }
  
  def check(token: java.lang.String, secret: java.lang.String): scala.Boolean = js.native
  def generate(secret: java.lang.String): java.lang.String = js.native
  def generateSecret(): java.lang.String = js.native
  def verify(options: VerifyOptions): scala.Boolean = js.native
}

