package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationInput extends StObject {
  
  var address: js.UndefOr[Numeric] = js.undefined
  
  var id: js.UndefOr[Numeric] = js.undefined
  
  var isFolded: js.UndefOr[Boolean] = js.undefined
  
  var line: js.UndefOr[js.Array[LineInput]] = js.undefined
  
  var mappingId: js.UndefOr[Numeric] = js.undefined
}
object LocationInput {
  
  inline def apply(): LocationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationInput] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Numeric): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setId(value: Numeric): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFolded(value: Boolean): Self = StObject.set(x, "isFolded", value.asInstanceOf[js.Any])
    
    inline def setIsFoldedUndefined: Self = StObject.set(x, "isFolded", js.undefined)
    
    inline def setLine(value: js.Array[LineInput]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLineVarargs(value: LineInput*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setMappingId(value: Numeric): Self = StObject.set(x, "mappingId", value.asInstanceOf[js.Any])
    
    inline def setMappingIdUndefined: Self = StObject.set(x, "mappingId", js.undefined)
  }
}
