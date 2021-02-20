package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBlackboxedRangesParameterType extends StObject {
  
  var positions: js.Array[ScriptPosition] = js.native
  
  /**
    * Id of the script.
    */
  var scriptId: ScriptId = js.native
}
object SetBlackboxedRangesParameterType {
  
  @scala.inline
  def apply(positions: js.Array[ScriptPosition], scriptId: ScriptId): SetBlackboxedRangesParameterType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxedRangesParameterType]
  }
  
  @scala.inline
  implicit class SetBlackboxedRangesParameterTypeMutableBuilder[Self <: SetBlackboxedRangesParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositions(value: js.Array[ScriptPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: ScriptPosition*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
