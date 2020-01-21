package typings.naverWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object network {
  type NavigatedEvent = typings.chrome.chrome.events.Event[js.Function1[/* url */ java.lang.String, scala.Unit]]
  type RequestFinishedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* request */ typings.chrome.chrome.devtools.network.Request, scala.Unit]
  ]
}
