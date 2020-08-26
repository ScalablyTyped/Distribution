package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowMod {
  type SpecificWindowEvent[Type] = typings.openfin.eventsBaseMod.WindowEvent[typings.openfin.openfinStrings.window, Type]
  type WindowPerformanceReport[Topic, Type] = typings.std.Performance with (typings.openfin.eventsBaseMod.WindowEvent[Topic, Type])
}
