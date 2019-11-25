package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: Double
  /**
    * Key size in bits
    */
  var modulusLength: Double
}

object DSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(divisorLength: Double, modulusLength: Double): DSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DSAKeyPairKeyObjectOptions]
  }
}

