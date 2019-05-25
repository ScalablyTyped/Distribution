package typings
package neffosDotJsLib.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "Message")
@js.native
class Message () extends js.Object {
  /* The actual body of the incoming data. */
  var Body: WSData = js.native
  /* The Err contains any message's error if defined and not empty.
    server-side and client-side can return an error instead of a message from inside event callbacks. */
  var Err: java.lang.String = js.native
  /* The Event that this message sent to. */
  var Event: java.lang.String = js.native
  /* The IsForced if true then it means that this is not an incoming action but a force action.
    For example when websocket connection lost from remote the OnNamespaceDisconnect `Message.IsForced` will be true */
  var IsForced: scala.Boolean = js.native
  /* The IsLocal reprots whether an event is sent by the client-side itself, i.e when `connect` call on `OnNamespaceConnect` event the `Message.IsLocal` will be true,
    server-side can force-connect a client to connect to a namespace as well in this case the `IsLocal` will be false. */
  var IsLocal: scala.Boolean = js.native
  /* The IsNative reports whether the Message is websocket native messages, only Body is filled. */
  var IsNative: scala.Boolean = js.native
  /* The Namespace that this message sent to. */
  var Namespace: java.lang.String = js.native
  /* The Room that this message sent to. */
  var Room: java.lang.String = js.native
}

