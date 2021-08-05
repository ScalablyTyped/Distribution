package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generators {
  
  @JSImport("openid-client", "generators")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculates the S256 PKCE code challenge for an arbitrary code verifier.
    * Encodes in url safe base64.
    * @param verifier Code verifier to calculate the S256 code challenge for
    */
  inline def codeChallenge(verifier: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeChallenge")(verifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  inline def codeVerifier(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeVerifier")().asInstanceOf[String]
  inline def codeVerifier(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeVerifier")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  inline def nonce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nonce")().asInstanceOf[String]
  inline def nonce(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nonce")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
  inline def random(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generates random bytes and encodes them in url safe base64.
    * @param bytes Number indicating the number of bytes to generate. Default: 32
    */
  inline def state(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("state")().asInstanceOf[String]
  inline def state(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("state")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
