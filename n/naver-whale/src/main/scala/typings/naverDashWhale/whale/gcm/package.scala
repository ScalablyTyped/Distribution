package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  import typings.chrome.chrome.events.Event

  type GcmErrorEvent = Event[js.Function1[/* error */ typings.chrome.chrome.gcm.GcmError, Unit]]
  type MessageDeletionEvent = Event[js.Function0[Unit]]
  type MessageReceptionEvent = Event[js.Function1[/* message */ typings.chrome.chrome.gcm.IncomingMessage, Unit]]
}
