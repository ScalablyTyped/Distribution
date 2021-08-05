package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryWindowsUpdatePackageWindowsUpdateCategory extends StObject {
  
  /** The identifier of the windows update category. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the windows update category. */
  var name: js.UndefOr[String] = js.undefined
}
object InventoryWindowsUpdatePackageWindowsUpdateCategory {
  
  inline def apply(): InventoryWindowsUpdatePackageWindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsUpdatePackageWindowsUpdateCategory]
  }
  
  extension [Self <: InventoryWindowsUpdatePackageWindowsUpdateCategory](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
