package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyAlgorithm extends KeyAlgorithm {
  var hash: KeyAlgorithm
  var length: scala.Double
}

object HmacKeyAlgorithm {
  @scala.inline
  def apply(hash: KeyAlgorithm, length: scala.Double, name: java.lang.String): HmacKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash, length = length, name = name)
  
    __obj.asInstanceOf[HmacKeyAlgorithm]
  }
}

