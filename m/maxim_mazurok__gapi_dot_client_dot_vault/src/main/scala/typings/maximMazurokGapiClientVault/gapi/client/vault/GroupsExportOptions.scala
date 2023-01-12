package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsExportOptions extends StObject {
  
  /** The file format for exported messages. */
  var exportFormat: js.UndefOr[String] = js.undefined
}
object GroupsExportOptions {
  
  inline def apply(): GroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupsExportOptions] (val x: Self) extends AnyVal {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
