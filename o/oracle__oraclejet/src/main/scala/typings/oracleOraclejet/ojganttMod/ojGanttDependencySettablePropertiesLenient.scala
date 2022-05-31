package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttDependencySettableProperties> */
trait ojGanttDependencySettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var predecessorTaskId: js.UndefOr[js.Any] = js.undefined
  
  var shortDesc: js.UndefOr[String | Null] = js.undefined
  
  var successorTaskId: js.UndefOr[js.Any] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var `type`: js.UndefOr[finishStart | finishFinish | startStart | startFinish] = js.undefined
}
object ojGanttDependencySettablePropertiesLenient {
  
  inline def apply(): ojGanttDependencySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttDependencySettablePropertiesLenient]
  }
  
  extension [Self <: ojGanttDependencySettablePropertiesLenient](x: Self) {
    
    inline def setPredecessorTaskId(value: js.Any): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
    
    inline def setPredecessorTaskIdUndefined: Self = StObject.set(x, "predecessorTaskId", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    inline def setSuccessorTaskId(value: js.Any): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
    
    inline def setSuccessorTaskIdUndefined: Self = StObject.set(x, "successorTaskId", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setType(value: finishStart | finishFinish | startStart | startFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
