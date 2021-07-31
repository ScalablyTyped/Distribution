package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Struct extends StObject {
  
  /** Unordered map of dynamically typed values. */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value}
    */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Struct & TopLevel[js.Any]
  ] = js.undefined
}
object Struct {
  
  @scala.inline
  def apply(): Struct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Struct]
  }
  
  @scala.inline
  implicit class StructMutableBuilder[Self <: Struct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value}
      */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Struct & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
