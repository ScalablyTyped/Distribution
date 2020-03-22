package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemMod {
  type MonitorEvent[Topic, Type] = typings.openfin.monitorMod.MonitorInfo with (typings.openfin.eventsBaseMod.BaseEvent[Topic, Type])
}
