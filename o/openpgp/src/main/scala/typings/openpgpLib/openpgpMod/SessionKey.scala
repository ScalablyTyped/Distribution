package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionKey extends js.Object {
  var algorithm: java.lang.String
  var data: stdLib.Uint8Array
}

object SessionKey {
  @scala.inline
  def apply(algorithm: java.lang.String, data: stdLib.Uint8Array): SessionKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, data = data)
  
    __obj.asInstanceOf[SessionKey]
  }
}

