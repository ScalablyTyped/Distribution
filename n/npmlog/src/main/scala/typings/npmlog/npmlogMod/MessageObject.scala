package typings.npmlog.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageObject extends js.Object {
  var id: Double
  var level: String
  var message: String
  var messageRaw: String
  var prefix: String
}

object MessageObject {
  @scala.inline
  def apply(id: Double, level: String, message: String, messageRaw: String, prefix: String): MessageObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageRaw = messageRaw.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageObject]
  }
}

