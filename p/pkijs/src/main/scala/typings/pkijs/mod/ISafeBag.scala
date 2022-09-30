package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISafeBag[T /* <: BagType */] extends StObject {
  
  var bagAttributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var bagId: String
  
  var bagValue: T
}
object ISafeBag {
  
  inline def apply[T /* <: BagType */](bagId: String, bagValue: T): ISafeBag[T] = {
    val __obj = js.Dynamic.literal(bagId = bagId.asInstanceOf[js.Any], bagValue = bagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISafeBag[T]]
  }
  
  extension [Self <: ISafeBag[?], T /* <: BagType */](x: Self & ISafeBag[T]) {
    
    inline def setBagAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "bagAttributes", value.asInstanceOf[js.Any])
    
    inline def setBagAttributesUndefined: Self = StObject.set(x, "bagAttributes", js.undefined)
    
    inline def setBagAttributesVarargs(value: Attribute*): Self = StObject.set(x, "bagAttributes", js.Array(value*))
    
    inline def setBagId(value: String): Self = StObject.set(x, "bagId", value.asInstanceOf[js.Any])
    
    inline def setBagValue(value: T): Self = StObject.set(x, "bagValue", value.asInstanceOf[js.Any])
  }
}
