package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionScope extends StObject {
  
  /**
    * The execution scope of the analysis.
    */
  var executionScope: js.UndefOr[Selectors] = js.undefined
  
  /**
    * Should the test fail or not if there are issues of any severity.
    */
  var failOnAnyIssues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the test fail or not if there are issues of high severity. This parameter will override failOnAnyIssues
    * if set.
    */
  var failOnHighIssues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The metadata that will be passed to the analyse method.
    */
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The rules to check.
    */
  var rules: js.UndefOr[js.Array[LibName]] = js.undefined
}
object ExecutionScope {
  
  inline def apply(): ExecutionScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionScope] (val x: Self) extends AnyVal {
    
    inline def setExecutionScope(value: Selectors): Self = StObject.set(x, "executionScope", value.asInstanceOf[js.Any])
    
    inline def setExecutionScopeUndefined: Self = StObject.set(x, "executionScope", js.undefined)
    
    inline def setFailOnAnyIssues(value: Boolean): Self = StObject.set(x, "failOnAnyIssues", value.asInstanceOf[js.Any])
    
    inline def setFailOnAnyIssuesUndefined: Self = StObject.set(x, "failOnAnyIssues", js.undefined)
    
    inline def setFailOnHighIssues(value: Boolean): Self = StObject.set(x, "failOnHighIssues", value.asInstanceOf[js.Any])
    
    inline def setFailOnHighIssuesUndefined: Self = StObject.set(x, "failOnHighIssues", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRules(value: js.Array[LibName]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: LibName*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
