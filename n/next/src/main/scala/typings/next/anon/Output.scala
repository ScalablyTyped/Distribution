package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  var output: String
  
  var outputWithMessages: String
  
  var totalNextPluginErrorCount: Double
  
  var totalNextPluginWarningCount: Double
}
object Output {
  
  inline def apply(
    output: String,
    outputWithMessages: String,
    totalNextPluginErrorCount: Double,
    totalNextPluginWarningCount: Double
  ): Output = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], outputWithMessages = outputWithMessages.asInstanceOf[js.Any], totalNextPluginErrorCount = totalNextPluginErrorCount.asInstanceOf[js.Any], totalNextPluginWarningCount = totalNextPluginWarningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  extension [Self <: Output](x: Self) {
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputWithMessages(value: String): Self = StObject.set(x, "outputWithMessages", value.asInstanceOf[js.Any])
    
    inline def setTotalNextPluginErrorCount(value: Double): Self = StObject.set(x, "totalNextPluginErrorCount", value.asInstanceOf[js.Any])
    
    inline def setTotalNextPluginWarningCount(value: Double): Self = StObject.set(x, "totalNextPluginWarningCount", value.asInstanceOf[js.Any])
  }
}
