package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDObject extends js.Object {
  var uuids: js.Array[java.lang.String]
}

object UUIDObject {
  @scala.inline
  def apply(uuids: js.Array[java.lang.String]): UUIDObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuids")(uuids)
    __obj.asInstanceOf[UUIDObject]
  }
}

