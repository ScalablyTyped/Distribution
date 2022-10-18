package typings.parcelTypes.anon

import typings.parcelTypes.mod.BundleGraphTraversable
import typings.parcelTypes.mod.BundleTraversable
import typings.parcelTypes.parcelTypesStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue
  extends StObject
     with BundleGraphTraversable
     with BundleTraversable {
  
  val `type`: asset
  
  var value: typings.parcelTypes.mod.Asset
}
object TypeValue {
  
  inline def apply(value: typings.parcelTypes.mod.Asset): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
