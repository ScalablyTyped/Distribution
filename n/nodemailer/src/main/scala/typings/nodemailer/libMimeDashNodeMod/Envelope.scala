package typings.nodemailer.libMimeDashNodeMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** includes an address object or is set to false */
  var from: String | `false`
  /** includes an array of address objects */
  var to: js.Array[String]
}

object Envelope {
  @scala.inline
  def apply(from: String | `false`, to: js.Array[String]): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Envelope]
  }
}

