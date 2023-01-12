package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeBagJson extends StObject {
  
  var bagAttributes: js.UndefOr[js.Array[AttributeJson]] = js.undefined
  
  var bagId: String
  
  var bagValue: BagTypeJson
}
object SafeBagJson {
  
  inline def apply(bagId: String, bagValue: BagTypeJson): SafeBagJson = {
    val __obj = js.Dynamic.literal(bagId = bagId.asInstanceOf[js.Any], bagValue = bagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeBagJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeBagJson] (val x: Self) extends AnyVal {
    
    inline def setBagAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "bagAttributes", value.asInstanceOf[js.Any])
    
    inline def setBagAttributesUndefined: Self = StObject.set(x, "bagAttributes", js.undefined)
    
    inline def setBagAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "bagAttributes", js.Array(value*))
    
    inline def setBagId(value: String): Self = StObject.set(x, "bagId", value.asInstanceOf[js.Any])
    
    inline def setBagValue(value: BagTypeJson): Self = StObject.set(x, "bagValue", value.asInstanceOf[js.Any])
  }
}
