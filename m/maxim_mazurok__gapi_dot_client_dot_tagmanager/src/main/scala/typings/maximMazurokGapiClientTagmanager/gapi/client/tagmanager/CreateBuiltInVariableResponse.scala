package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBuiltInVariableResponse extends js.Object {
  
  /** List of created built-in variables. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
}
object CreateBuiltInVariableResponse {
  
  @scala.inline
  def apply(): CreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuiltInVariableResponse]
  }
  
  @scala.inline
  implicit class CreateBuiltInVariableResponseOps[Self <: CreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
    
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
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = this.set("builtInVariable", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = this.set("builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInVariable: Self = this.set("builtInVariable", js.undefined)
  }
}
