package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "generators")
@js.native
object generators extends js.Object {
  
  /**
    * Calculates the S256 PKCE code challenge for an arbitrary code verifier.
    * Encodes in url safe base64.
    * @param verifier Code verifier to calculate the S256 code challenge for
    */
  def codeChallenge(verifier: String): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  def codeVerifier(): String = js.native
  def codeVerifier(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  def nonce(): String = js.native
  def nonce(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  def random(): String = js.native
  def random(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  def state(): String = js.native
  def state(bytes: Double): String = js.native
}
