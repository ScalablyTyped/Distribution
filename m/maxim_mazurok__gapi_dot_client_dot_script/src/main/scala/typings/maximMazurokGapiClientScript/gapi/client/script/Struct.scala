package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Struct extends js.Object {
  
  /** Unordered map of dynamically typed values. */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value}
    */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Struct with TopLevel[js.Any]
  ] = js.native
}
object Struct {
  
  @scala.inline
  def apply(): Struct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Struct]
  }
  
  @scala.inline
  implicit class StructOps[Self <: Struct] (val x: Self) extends AnyVal {
    
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
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value}
      */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Struct with TopLevel[js.Any]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
