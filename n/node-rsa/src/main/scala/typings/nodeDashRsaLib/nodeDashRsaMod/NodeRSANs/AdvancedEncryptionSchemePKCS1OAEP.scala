package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1OAEP extends AdvancedEncryptionScheme {
  var hash: HashingAlgorithm
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[
      /* data */ nodeLib.Buffer, 
      /* length */ scala.Double, 
      /* hash */ HashingAlgorithm, 
      nodeLib.Buffer
    ]
  ] = js.undefined
  var scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1_oaep
}

object AdvancedEncryptionSchemePKCS1OAEP {
  @scala.inline
  def apply(
    hash: HashingAlgorithm,
    scheme: nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1_oaep,
    mgf: js.Function3[
      /* data */ nodeLib.Buffer, 
      /* length */ scala.Double, 
      /* hash */ HashingAlgorithm, 
      nodeLib.Buffer
    ] = null
  ): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("scheme")(scheme)
    if (mgf != null) __obj.updateDynamic("mgf")(mgf)
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
}

