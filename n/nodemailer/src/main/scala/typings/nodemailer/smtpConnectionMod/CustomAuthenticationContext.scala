package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAuthenticationContext extends StObject {
  
  var auth: AuthenticationCredentials = js.native
  
  var authMethod: String = js.native
  
  var authMethods: js.Array[String] = js.native
  
  var extensions: js.Array[String] = js.native
  
  var maxAllowedSize: Double | `false` = js.native
  
  def reject(err: String): js.Any = js.native
  def reject(err: Error): js.Any = js.native
  
  def resolve(): js.Any = js.native
  
  def sendCommand(cmd: String): js.Promise[CustomAuthenticationResponse] = js.native
  def sendCommand(
    cmd: String,
    done: js.Function2[/* err */ Error | Null, /* data */ CustomAuthenticationResponse, Unit]
  ): Unit = js.native
}
