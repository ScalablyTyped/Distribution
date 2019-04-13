package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDObject extends js.Object {
  var uuids: js.Array[java.lang.String]
}

object UUIDObject {
  @scala.inline
  def apply(uuids: js.Array[java.lang.String]): UUIDObject = {
    val __obj = js.Dynamic.literal(uuids = uuids)
  
    __obj.asInstanceOf[UUIDObject]
  }
}

