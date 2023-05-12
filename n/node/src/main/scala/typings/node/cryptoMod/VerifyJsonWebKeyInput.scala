package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyJsonWebKeyInput
  extends StObject
     with JsonWebKeyInput
     with SigningOptions
object VerifyJsonWebKeyInput {
  
  inline def apply(key: JsonWebKey): VerifyJsonWebKeyInput = {
    val __obj = js.Dynamic.literal(format = "jwk", key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyJsonWebKeyInput]
  }
}
