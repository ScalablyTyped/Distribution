package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object systemMod {
  
  type MonitorEvent[Topic, Type] = typings.openfin.monitorMod.MonitorInfo with (typings.openfin.eventsBaseMod.BaseEvent[Topic, Type])
}
