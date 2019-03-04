package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyContainer extends js.Object {
  var key: openpgpLib.openpgpMod.keyNs.Key
}

object KeyContainer {
  @scala.inline
  def apply(key: openpgpLib.openpgpMod.keyNs.Key): KeyContainer = {
    val __obj = js.Dynamic.literal(key = key)
  
    __obj.asInstanceOf[KeyContainer]
  }
}

