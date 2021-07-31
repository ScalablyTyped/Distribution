package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateParameterType extends StObject {
  
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Expression to evaluate.
    */
  var expression: String
  
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.undefined
}
object EvaluateParameterType {
  
  @scala.inline
  def apply(expression: String): EvaluateParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateParameterType]
  }
  
  @scala.inline
  implicit class EvaluateParameterTypeMutableBuilder[Self <: EvaluateParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = StObject.set(x, "awaitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitPromiseUndefined: Self = StObject.set(x, "awaitPromise", js.undefined)
    
    @scala.inline
    def setContextId(value: ExecutionContextId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setIncludeCommandLineAPI(value: Boolean): Self = StObject.set(x, "includeCommandLineAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCommandLineAPIUndefined: Self = StObject.set(x, "includeCommandLineAPI", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    @scala.inline
    def setReturnByValue(value: Boolean): Self = StObject.set(x, "returnByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnByValueUndefined: Self = StObject.set(x, "returnByValue", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setUserGesture(value: Boolean): Self = StObject.set(x, "userGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGestureUndefined: Self = StObject.set(x, "userGesture", js.undefined)
  }
}
