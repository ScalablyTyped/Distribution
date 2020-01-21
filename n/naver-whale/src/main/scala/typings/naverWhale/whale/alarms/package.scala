package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  type AlarmEvent = typings.chrome.chrome.events.Event[js.Function1[/* alarm */ typings.chrome.chrome.alarms.Alarm, scala.Unit]]
}
