package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Chat extends js.Object {
  var from: plugapiLib.plugapiMod.PlugAPINs.UserNs.User
  var id: java.lang.String
  var mentions: js.Array[_]
  var message: java.lang.String
  var muted: scala.Boolean
  var raw: plugapiLib.plugapiMod.PlugAPINs.RawChatMessage
  var `type`: java.lang.String
}

