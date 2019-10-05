package typings.naverDashWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object network {
  import typings.chrome.chrome.events.Event

  type NavigatedEvent = Event[js.Function1[/* url */ String, Unit]]
  type RequestFinishedEvent = Event[js.Function1[/* request */ typings.chrome.chrome.devtools.network.Request, Unit]]
}
