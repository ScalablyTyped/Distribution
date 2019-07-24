package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthenticationContext extends js.Object {
  var auth: AuthenticationCredentials = js.native
  var authMethod: java.lang.String = js.native
  var authMethods: js.Array[java.lang.String] = js.native
  var extensions: js.Array[java.lang.String] = js.native
  var maxAllowedSize: scala.Double | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  def reject(err: java.lang.String): js.Any = js.native
  def reject(err: stdLib.Error): js.Any = js.native
  def resolve(): js.Any = js.native
  def sendCommand(cmd: java.lang.String): js.Promise[CustomAuthenticationResponse] = js.native
  def sendCommand(
    cmd: java.lang.String,
    done: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ CustomAuthenticationResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

