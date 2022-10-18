package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaults extends StObject {
  
  var billable_owner: js.UndefOr[Avatarurl] = js.undefined
  
  var defaults: js.UndefOr[DevcontainerpathLocation] = js.undefined
}
object Defaults {
  
  inline def apply(): Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults]
  }
  
  extension [Self <: Defaults](x: Self) {
    
    inline def setBillable_owner(value: Avatarurl): Self = StObject.set(x, "billable_owner", value.asInstanceOf[js.Any])
    
    inline def setBillable_ownerUndefined: Self = StObject.set(x, "billable_owner", js.undefined)
    
    inline def setDefaults(value: DevcontainerpathLocation): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
