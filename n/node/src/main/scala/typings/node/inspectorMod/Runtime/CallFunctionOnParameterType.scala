package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionOnParameterType extends StObject {
  
  /**
    * Call arguments. All call arguments must belong to the same JavaScript world as the target object.
    */
  var arguments: js.UndefOr[js.Array[CallArgument]] = js.native
  
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies execution context which global object will be used to call function on. Either executionContextId or objectId should be specified.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  
  /**
    * Declaration of the function to call.
    */
  var functionDeclaration: String = js.native
  
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Symbolic group name that can be used to release multiple objects. If objectGroup is not specified and objectId is, objectGroup will be inherited from object.
    */
  var objectGroup: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the object to call function on. Either objectId or executionContextId should be specified.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.native
}
object CallFunctionOnParameterType {
  
  @scala.inline
  def apply(functionDeclaration: String): CallFunctionOnParameterType = {
    val __obj = js.Dynamic.literal(functionDeclaration = functionDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnParameterType]
  }
  
  @scala.inline
  implicit class CallFunctionOnParameterTypeMutableBuilder[Self <: CallFunctionOnParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[CallArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: CallArgument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = StObject.set(x, "awaitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitPromiseUndefined: Self = StObject.set(x, "awaitPromise", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    @scala.inline
    def setFunctionDeclaration(value: String): Self = StObject.set(x, "functionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
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
