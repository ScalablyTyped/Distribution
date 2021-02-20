package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generators {
  
  /**
    * Calculates the S256 PKCE code challenge for an arbitrary code verifier.
    * Encodes in url safe base64.
    * @param verifier Code verifier to calculate the S256 code challenge for
    */
  @JSImport("openid-client", "generators.codeChallenge")
  @js.native
  def codeChallenge(verifier: String): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  @JSImport("openid-client", "generators.codeVerifier")
  @js.native
  def codeVerifier(): String = js.native
  @JSImport("openid-client", "generators.codeVerifier")
  @js.native
  def codeVerifier(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  @JSImport("openid-client", "generators.nonce")
  @js.native
  def nonce(): String = js.native
  @JSImport("openid-client", "generators.nonce")
  @js.native
  def nonce(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  @JSImport("openid-client", "generators.random")
  @js.native
  def random(): String = js.native
  @JSImport("openid-client", "generators.random")
  @js.native
  def random(bytes: Double): String = js.native
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  @JSImport("openid-client", "generators.state")
  @js.native
  def state(): String = js.native
  @JSImport("openid-client", "generators.state")
  @js.native
  def state(bytes: Double): String = js.native
}
