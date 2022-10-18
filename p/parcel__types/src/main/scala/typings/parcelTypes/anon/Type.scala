package typings.parcelTypes.anon

import typings.parcelTypes.mod.BundleGroup
import typings.parcelTypes.parcelTypesStrings.bundle_group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: bundle_group
  
  var value: BundleGroup
}
object Type {
  
  inline def apply(value: BundleGroup): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_group")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: bundle_group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: BundleGroup): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
