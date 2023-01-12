package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryZypperPatch extends StObject {
  
  /** The category of the patch. */
  var category: js.UndefOr[String] = js.undefined
  
  /** The name of the patch. */
  var patchName: js.UndefOr[String] = js.undefined
  
  /** The severity specified for this patch */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Any summary information provided about this patch. */
  var summary: js.UndefOr[String] = js.undefined
}
object InventoryZypperPatch {
  
  inline def apply(): InventoryZypperPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryZypperPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryZypperPatch] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPatchName(value: String): Self = StObject.set(x, "patchName", value.asInstanceOf[js.Any])
    
    inline def setPatchNameUndefined: Self = StObject.set(x, "patchName", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
