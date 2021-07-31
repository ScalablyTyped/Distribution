package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateOnCallFrameParameterType extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
  
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
    * Specifies whether command line API should be available to the evaluated expression, defaults to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
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
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.undefined
}
object EvaluateOnCallFrameParameterType {
  
  @scala.inline
  def apply(callFrameId: CallFrameId, expression: String): EvaluateOnCallFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameParameterType]
  }
  
  @scala.inline
  implicit class EvaluateOnCallFrameParameterTypeMutableBuilder[Self <: EvaluateOnCallFrameParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
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
    def setThrowOnSideEffect(value: Boolean): Self = StObject.set(x, "throwOnSideEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOnSideEffectUndefined: Self = StObject.set(x, "throwOnSideEffect", js.undefined)
  }
}
