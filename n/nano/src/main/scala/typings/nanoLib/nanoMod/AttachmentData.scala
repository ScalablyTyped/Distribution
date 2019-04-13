package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentData extends js.Object {
  var content_type: js.Any
  var data: js.Any
  var name: java.lang.String
}

object AttachmentData {
  @scala.inline
  def apply(content_type: js.Any, data: js.Any, name: java.lang.String): AttachmentData = {
    val __obj = js.Dynamic.literal(content_type = content_type, data = data, name = name)
  
    __obj.asInstanceOf[AttachmentData]
  }
}

