package typings.phosphorMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MessageHook = typings.phosphorMessaging.mod.IMessageHook | (js.Function2[
    /* handler */ typings.phosphorMessaging.mod.IMessageHandler, 
    /* msg */ typings.phosphorMessaging.mod.Message, 
    scala.Boolean
  ])
}
