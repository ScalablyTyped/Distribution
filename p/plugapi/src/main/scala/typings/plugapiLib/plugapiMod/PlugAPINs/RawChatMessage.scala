package typings
package plugapiLib.plugapiMod.PlugAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawChatMessage extends js.Object {
  var cid: java.lang.String
  var message: java.lang.String
  var sub: scala.Double
  var uid: scala.Double
  var un: java.lang.String
}

object RawChatMessage {
  @scala.inline
  def apply(
    cid: java.lang.String,
    message: java.lang.String,
    sub: scala.Double,
    uid: scala.Double,
    un: java.lang.String
  ): RawChatMessage = {
    val __obj = js.Dynamic.literal(cid = cid, message = message, sub = sub, uid = uid, un = un)
  
    __obj.asInstanceOf[RawChatMessage]
  }
}

