package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object windowMod {
  
  type SpecificWindowEvent[Type] = typings.openfin.eventsBaseMod.WindowEvent[typings.openfin.openfinStrings.window, Type]
  
  type WindowPerformanceReport[Topic, Type] = typings.std.Performance with (typings.openfin.eventsBaseMod.WindowEvent[Topic, Type])
}
