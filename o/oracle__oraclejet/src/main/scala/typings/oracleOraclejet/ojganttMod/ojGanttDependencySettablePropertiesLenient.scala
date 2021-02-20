package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttDependencySettableProperties> */
@js.native
trait ojGanttDependencySettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var predecessorTaskId: js.UndefOr[js.Any] = js.native
  
  var shortDesc: js.UndefOr[String | Null] = js.native
  
  var successorTaskId: js.UndefOr[js.Any] = js.native
  
  var svgClassName: js.UndefOr[String] = js.native
  
  var svgStyle: js.UndefOr[js.Object] = js.native
  
  var `type`: js.UndefOr[finishStart | finishFinish | startStart | startFinish] = js.native
}
object ojGanttDependencySettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojGanttDependencySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttDependencySettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojGanttDependencySettablePropertiesLenientMutableBuilder[Self <: ojGanttDependencySettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredecessorTaskId(value: js.Any): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredecessorTaskIdUndefined: Self = StObject.set(x, "predecessorTaskId", js.undefined)
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    @scala.inline
    def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    @scala.inline
    def setSuccessorTaskId(value: js.Any): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessorTaskIdUndefined: Self = StObject.set(x, "successorTaskId", js.undefined)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setType(value: finishStart | finishFinish | startStart | startFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
