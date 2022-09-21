package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generators {
  
  @JSImport("openid-client", "generators")
  @js.native
  val ^ : js.Any = js.native
  
  inline def codeChallenge(verifier: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeChallenge")(verifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def codeVerifier(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeVerifier")().asInstanceOf[String]
  inline def codeVerifier(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeVerifier")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nonce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nonce")().asInstanceOf[String]
  inline def nonce(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nonce")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
  inline def random(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def state(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("state")().asInstanceOf[String]
  inline def state(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("state")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
