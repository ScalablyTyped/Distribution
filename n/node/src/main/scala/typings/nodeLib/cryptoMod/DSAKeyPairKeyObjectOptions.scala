package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSAKeyPairKeyObjectOptions extends js.Object {
  /**
    * Size of q in bits
    */
  var divisorLength: scala.Double
  /**
    * Key size in bits
    */
  var modulusLength: scala.Double
}

object DSAKeyPairKeyObjectOptions {
  @scala.inline
  def apply(divisorLength: scala.Double, modulusLength: scala.Double): DSAKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(divisorLength = divisorLength, modulusLength = modulusLength)
  
    __obj.asInstanceOf[DSAKeyPairKeyObjectOptions]
  }
}

