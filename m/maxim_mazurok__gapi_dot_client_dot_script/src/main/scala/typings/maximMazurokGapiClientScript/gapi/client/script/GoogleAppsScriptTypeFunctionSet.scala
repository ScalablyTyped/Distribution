package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeFunctionSet extends js.Object {
  
  /** A list of functions composing the set. */
  var values: js.UndefOr[js.Array[GoogleAppsScriptTypeFunction]] = js.native
}
object GoogleAppsScriptTypeFunctionSet {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeFunctionSet]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeFunctionSetOps[Self <: GoogleAppsScriptTypeFunctionSet] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: GoogleAppsScriptTypeFunction*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[GoogleAppsScriptTypeFunction]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
