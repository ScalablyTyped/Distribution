package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rsa {
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typings.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typings.nodeForge.nodeForgeStrings.RAW
    - typings.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = typings.nodeForge.mod.pki.rsa._EncryptionScheme | scala.Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typings.nodeForge.mod.pss.PSS
    - typings.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = typings.nodeForge.mod.pki.rsa._SignatureScheme | typings.nodeForge.mod.pss.PSS | scala.Null
}
