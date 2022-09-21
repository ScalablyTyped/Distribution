package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.loadsc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadScenarioTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var scenario: String
  
  var `type`: loadsc
}
object LoadScenarioTitleSequenceCommand {
  
  inline def apply(scenario: String): LoadScenarioTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loadsc")
    __obj.asInstanceOf[LoadScenarioTitleSequenceCommand]
  }
  
  extension [Self <: LoadScenarioTitleSequenceCommand](x: Self) {
    
    inline def setScenario(value: String): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
    
    inline def setType(value: loadsc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
