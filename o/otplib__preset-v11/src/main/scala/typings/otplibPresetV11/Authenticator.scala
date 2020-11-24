package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticator extends TOTP {
  
  var Authenticator: Instantiable0[typings.otplibPresetV11.Authenticator] = js.native
  
  def decode(encodedKey: String): String = js.native
  
  def encode(secret: String): String = js.native
  
  def generateSecret(): String = js.native
  def generateSecret(len: Double): String = js.native
  
  def keyuri(user: String, service: String, secret: String): String = js.native
}
