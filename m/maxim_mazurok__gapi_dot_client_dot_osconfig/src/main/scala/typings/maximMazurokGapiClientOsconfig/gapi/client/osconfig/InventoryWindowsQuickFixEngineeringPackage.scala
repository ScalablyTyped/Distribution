package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryWindowsQuickFixEngineeringPackage extends StObject {
  
  /** A short textual description of the QFE update. */
  var caption: js.UndefOr[String] = js.undefined
  
  /** A textual description of the QFE update. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Unique identifier associated with a particular QFE update. */
  var hotFixId: js.UndefOr[String] = js.undefined
  
  /** Date that the QFE update was installed. Mapped from installed_on field. */
  var installTime: js.UndefOr[String] = js.undefined
}
object InventoryWindowsQuickFixEngineeringPackage {
  
  inline def apply(): InventoryWindowsQuickFixEngineeringPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsQuickFixEngineeringPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryWindowsQuickFixEngineeringPackage] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHotFixId(value: String): Self = StObject.set(x, "hotFixId", value.asInstanceOf[js.Any])
    
    inline def setHotFixIdUndefined: Self = StObject.set(x, "hotFixId", js.undefined)
    
    inline def setInstallTime(value: String): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    inline def setInstallTimeUndefined: Self = StObject.set(x, "installTime", js.undefined)
  }
}
