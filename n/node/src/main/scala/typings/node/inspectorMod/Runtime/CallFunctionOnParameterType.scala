package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionOnParameterType extends js.Object {
  
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
  implicit class CallFunctionOnParameterTypeOps[Self <: CallFunctionOnParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctionDeclaration(value: String): Self = this.set("functionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: CallArgument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[CallArgument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = this.set("awaitPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwaitPromise: Self = this.set("awaitPromise", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = this.set("generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratePreview: Self = this.set("generatePreview", js.undefined)
    
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setReturnByValue(value: Boolean): Self = this.set("returnByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnByValue: Self = this.set("returnByValue", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setUserGesture(value: Boolean): Self = this.set("userGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGesture: Self = this.set("userGesture", js.undefined)
  }
}
