package typings.msRest.mod

import typings.msRest.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryType
  extends StObject
     with BaseMapperType {
  
  var `type`: Value
}
object DictionaryType {
  
  inline def apply(name: MapperType, `type`: Value): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictionaryType] (val x: Self) extends AnyVal {
    
    inline def setType(value: Value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
