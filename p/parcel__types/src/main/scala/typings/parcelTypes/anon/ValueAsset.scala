package typings.parcelTypes.anon

import typings.parcelTypes.parcelTypesStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAsset extends StObject {
  
  var `type`: asset
  
  var value: typings.parcelTypes.mod.Asset
}
object ValueAsset {
  
  inline def apply(value: typings.parcelTypes.mod.Asset): ValueAsset = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[ValueAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueAsset] (val x: Self) extends AnyVal {
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
