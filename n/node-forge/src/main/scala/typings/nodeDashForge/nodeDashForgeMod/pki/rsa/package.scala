package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsa {
  import typings.nodeDashForge.nodeDashForgeMod.pss.PSS

  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.nodeDashForgeStrings.`RSAES-PKCS1-V1_5`
    - typings.nodeDashForge.nodeDashForgeStrings.`RSA-OAEP`
    - typings.nodeDashForge.nodeDashForgeStrings.RAW
    - typings.nodeDashForge.nodeDashForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = _EncryptionScheme | Null
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.nodeDashForgeStrings.`RSASSA-PKCS1-V1_5`
    - typings.nodeDashForge.nodeDashForgeMod.pss.PSS
    - typings.nodeDashForge.nodeDashForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = _SignatureScheme | PSS | Null
}
