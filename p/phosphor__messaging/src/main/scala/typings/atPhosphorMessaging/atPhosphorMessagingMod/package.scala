package typings.atPhosphorMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPhosphorMessagingMod {
  type MessageHook = IMessageHook | (js.Function2[/* handler */ IMessageHandler, /* msg */ Message, Boolean])
}
