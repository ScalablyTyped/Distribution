package typings
package npmlogLib.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageObject extends js.Object {
  var id: scala.Double
  var level: java.lang.String
  var message: java.lang.String
  var messageRaw: java.lang.String
  var prefix: java.lang.String
}

object MessageObject {
  @scala.inline
  def apply(
    id: scala.Double,
    level: java.lang.String,
    message: java.lang.String,
    messageRaw: java.lang.String,
    prefix: java.lang.String
  ): MessageObject = {
    val __obj = js.Dynamic.literal(id = id, level = level, message = message, messageRaw = messageRaw, prefix = prefix)
  
    __obj.asInstanceOf[MessageObject]
  }
}

