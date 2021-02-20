package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalLexicalScopeNamesParameterType extends StObject {
  
  /**
    * Specifies in which execution context to lookup global scope variables.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
}
object GlobalLexicalScopeNamesParameterType {
  
  @scala.inline
  def apply(): GlobalLexicalScopeNamesParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalLexicalScopeNamesParameterType]
  }
  
  @scala.inline
  implicit class GlobalLexicalScopeNamesParameterTypeMutableBuilder[Self <: GlobalLexicalScopeNamesParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
  }
}
