package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openrct2.mod.global.LoadTitleSequenceCommand
  - typings.openrct2.mod.global.LocationTitleSequenceCommand
  - typings.openrct2.mod.global.RotateTitleSequenceCommand
  - typings.openrct2.mod.global.ZoomTitleSequenceCommand
  - typings.openrct2.mod.global.FollowTitleSequenceCommand
  - typings.openrct2.mod.global.SpeedTitleSequenceCommand
  - typings.openrct2.mod.global.WaitTitleSequenceCommand
  - typings.openrct2.mod.global.LoadScenarioTitleSequenceCommand
  - typings.openrct2.mod.global.RestartTitleSequenceCommand
  - typings.openrct2.mod.global.EndTitleSequenceCommand
*/
trait TitleSequenceCommand extends StObject
object TitleSequenceCommand {
  
  inline def EndTitleSequenceCommand(): typings.openrct2.mod.global.EndTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[typings.openrct2.mod.global.EndTitleSequenceCommand]
  }
  
  inline def FollowTitleSequenceCommand(): typings.openrct2.mod.global.FollowTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(id = null)
    __obj.updateDynamic("type")("follow")
    __obj.asInstanceOf[typings.openrct2.mod.global.FollowTitleSequenceCommand]
  }
  
  inline def LoadScenarioTitleSequenceCommand(scenario: String): typings.openrct2.mod.global.LoadScenarioTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loadsc")
    __obj.asInstanceOf[typings.openrct2.mod.global.LoadScenarioTitleSequenceCommand]
  }
  
  inline def LoadTitleSequenceCommand(index: Double): typings.openrct2.mod.global.LoadTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[typings.openrct2.mod.global.LoadTitleSequenceCommand]
  }
  
  inline def LocationTitleSequenceCommand(x: Double, y: Double): typings.openrct2.mod.global.LocationTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("location")
    __obj.asInstanceOf[typings.openrct2.mod.global.LocationTitleSequenceCommand]
  }
  
  inline def RestartTitleSequenceCommand(): typings.openrct2.mod.global.RestartTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("restart")
    __obj.asInstanceOf[typings.openrct2.mod.global.RestartTitleSequenceCommand]
  }
  
  inline def RotateTitleSequenceCommand(rotations: Double): typings.openrct2.mod.global.RotateTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(rotations = rotations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rotate")
    __obj.asInstanceOf[typings.openrct2.mod.global.RotateTitleSequenceCommand]
  }
  
  inline def SpeedTitleSequenceCommand(speed: Double): typings.openrct2.mod.global.SpeedTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("speed")
    __obj.asInstanceOf[typings.openrct2.mod.global.SpeedTitleSequenceCommand]
  }
  
  inline def WaitTitleSequenceCommand(duration: Double): typings.openrct2.mod.global.WaitTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("wait")
    __obj.asInstanceOf[typings.openrct2.mod.global.WaitTitleSequenceCommand]
  }
  
  inline def ZoomTitleSequenceCommand(zoom: Double): typings.openrct2.mod.global.ZoomTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("zoom")
    __obj.asInstanceOf[typings.openrct2.mod.global.ZoomTitleSequenceCommand]
  }
}
