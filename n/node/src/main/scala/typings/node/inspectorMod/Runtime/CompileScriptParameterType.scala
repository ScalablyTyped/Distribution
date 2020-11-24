package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileScriptParameterType extends js.Object {
  
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  
  /**
    * Expression to compile.
    */
  var expression: String = js.native
  
  /**
    * Specifies whether the compiled script should be persisted.
    */
  var persistScript: Boolean = js.native
  
  /**
    * Source url to be set for the script.
    */
  var sourceURL: String = js.native
}
object CompileScriptParameterType {
  
  @scala.inline
  def apply(expression: String, persistScript: Boolean, sourceURL: String): CompileScriptParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], persistScript = persistScript.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileScriptParameterType]
  }
  
  @scala.inline
  implicit class CompileScriptParameterTypeOps[Self <: CompileScriptParameterType] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistScript(value: Boolean): Self = this.set("persistScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
  }
}
