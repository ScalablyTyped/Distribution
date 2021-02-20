package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojGanttDependencySettableProperties extends JetSettableProperties {
  
  var predecessorTaskId: js.Any = js.native
  
  var shortDesc: String | Null = js.native
  
  var successorTaskId: js.Any = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var `type`: finishStart | finishFinish | startStart | startFinish = js.native
}
object ojGanttDependencySettableProperties {
  
  @scala.inline
  def apply(
    predecessorTaskId: js.Any,
    successorTaskId: js.Any,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: finishStart | finishFinish | startStart | startFinish
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
  
  @scala.inline
  implicit class ojGanttDependencySettablePropertiesMutableBuilder[Self <: ojGanttDependencySettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredecessorTaskId(value: js.Any): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescNull: Self = StObject.set(x, "shortDesc", null)
    
    @scala.inline
    def setSuccessorTaskId(value: js.Any): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: finishStart | finishFinish | startStart | startFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
