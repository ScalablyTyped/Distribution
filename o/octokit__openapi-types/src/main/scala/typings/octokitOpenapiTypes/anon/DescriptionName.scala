package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionName extends StObject {
  
  var color: js.UndefOr[FromString] = js.undefined
  
  var description: js.UndefOr[FromString] = js.undefined
  
  var name: js.UndefOr[FromString] = js.undefined
}
object DescriptionName {
  
  inline def apply(): DescriptionName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionName] (val x: Self) extends AnyVal {
    
    inline def setColor(value: FromString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDescription(value: FromString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
