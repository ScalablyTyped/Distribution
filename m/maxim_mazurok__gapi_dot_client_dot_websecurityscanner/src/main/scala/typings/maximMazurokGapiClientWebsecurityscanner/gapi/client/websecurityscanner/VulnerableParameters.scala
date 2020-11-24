package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VulnerableParameters extends js.Object {
  
  /** The vulnerable parameter names. */
  var parameterNames: js.UndefOr[js.Array[String]] = js.native
}
object VulnerableParameters {
  
  @scala.inline
  def apply(): VulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerableParameters]
  }
  
  @scala.inline
  implicit class VulnerableParametersOps[Self <: VulnerableParameters] (val x: Self) extends AnyVal {
    
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
    def setParameterNamesVarargs(value: String*): Self = this.set("parameterNames", js.Array(value :_*))
    
    @scala.inline
    def setParameterNames(value: js.Array[String]): Self = this.set("parameterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterNames: Self = this.set("parameterNames", js.undefined)
  }
}
