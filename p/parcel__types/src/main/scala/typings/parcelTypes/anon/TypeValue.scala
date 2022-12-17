package typings.parcelTypes.anon

import typings.parcelTypes.mod.BundleGroup
import typings.parcelTypes.parcelTypesStrings.bundle_group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue extends StObject {
  
  var `type`: bundle_group
  
  var value: BundleGroup
}
object TypeValue {
  
  inline def apply(value: BundleGroup): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_group")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: bundle_group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: BundleGroup): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
