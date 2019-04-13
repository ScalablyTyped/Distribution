package typings
package nodemailerLib.libMimeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** includes an address object or is set to false */
  var from: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`
  /** includes an array of address objects */
  var to: js.Array[java.lang.String]
}

object Envelope {
  @scala.inline
  def apply(
    from: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`,
    to: js.Array[java.lang.String]
  ): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to)
  
    __obj.asInstanceOf[Envelope]
  }
}

