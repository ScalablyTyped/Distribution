package typings.next

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerCryptoUtilsMod {
  
  @JSImport("next/dist/server/crypto-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decryptWithSecret(secret: Buffer, encryptedData: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptWithSecret")(secret.asInstanceOf[js.Any], encryptedData.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encryptWithSecret(secret: Buffer, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptWithSecret")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
