package typings.parcelTypes.anon

import typings.parcelTypes.parcelTypesStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var `type`: asset
  
  var value: typings.parcelTypes.mod.Asset
}
object Value {
  
  inline def apply(value: typings.parcelTypes.mod.Asset): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
