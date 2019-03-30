package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  type GcmErrorEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* error */ chromeLib.chromeNs.gcmNs.GcmError, scala.Unit]]
  type MessageDeletionEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type MessageReceptionEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* message */ chromeLib.chromeNs.gcmNs.IncomingMessage, scala.Unit]]
}
