package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryWindowsUpdatePackageWindowsUpdateCategory extends StObject {
  
  /** The identifier of the windows update category. */
  var id: js.UndefOr[String] = js.native
  
  /** The name of the windows update category. */
  var name: js.UndefOr[String] = js.native
}
object InventoryWindowsUpdatePackageWindowsUpdateCategory {
  
  @scala.inline
  def apply(): InventoryWindowsUpdatePackageWindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsUpdatePackageWindowsUpdateCategory]
  }
  
  @scala.inline
  implicit class InventoryWindowsUpdatePackageWindowsUpdateCategoryMutableBuilder[Self <: InventoryWindowsUpdatePackageWindowsUpdateCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
