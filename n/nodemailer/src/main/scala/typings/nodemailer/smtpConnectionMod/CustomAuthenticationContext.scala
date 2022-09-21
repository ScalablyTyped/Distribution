package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAuthenticationContext extends StObject {
  
  var auth: AuthenticationCredentials = js.native
  
  var authMethod: String = js.native
  
  var authMethods: js.Array[String] = js.native
  
  var extensions: js.Array[String] = js.native
  
  var maxAllowedSize: Double | `false` = js.native
  
  def reject(err: String): Any = js.native
  def reject(err: js.Error): Any = js.native
  
  def resolve(): Any = js.native
  
  def sendCommand(cmd: String): js.Promise[CustomAuthenticationResponse] = js.native
  def sendCommand(
    cmd: String,
    done: js.Function2[/* err */ js.Error | Null, /* data */ CustomAuthenticationResponse, Unit]
  ): Unit = js.native
}
