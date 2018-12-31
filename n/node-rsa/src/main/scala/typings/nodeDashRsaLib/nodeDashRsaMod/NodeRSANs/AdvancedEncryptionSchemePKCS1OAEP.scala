package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1OAEP extends js.Object {
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

