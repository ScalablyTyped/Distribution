package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttDependencySettableProperties
  extends StObject
     with JetSettableProperties {
  
  var predecessorTaskId: js.Any
  
  var shortDesc: String | Null
  
  var successorTaskId: js.Any
  
  var svgClassName: String
  
  var svgStyle: js.Object
  
  var `type`: finishStart | finishFinish | startStart | startFinish
}
object ojGanttDependencySettableProperties {
  
  inline def apply(
    predecessorTaskId: js.Any,
    successorTaskId: js.Any,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: finishStart | finishFinish | startStart | startFinish
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], shortDesc = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
  
  extension [Self <: ojGanttDependencySettableProperties](x: Self) {
    
    inline def setPredecessorTaskId(value: js.Any): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    inline def setSuccessorTaskId(value: js.Any): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setType(value: finishStart | finishFinish | startStart | startFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
