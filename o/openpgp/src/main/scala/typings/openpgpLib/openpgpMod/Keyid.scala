package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyid extends js.Object {
  var bytes: java.lang.String
}

object Keyid {
  @scala.inline
  def apply(bytes: java.lang.String): Keyid = {
    val __obj = js.Dynamic.literal(bytes = bytes)
  
    __obj.asInstanceOf[Keyid]
  }
}

