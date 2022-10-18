package typings.msRest.mod

import typings.msRest.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryType
  extends StObject
     with BaseMapperType {
  
  var `type`: Name
}
object DictionaryType {
  
  inline def apply(name: MapperType, `type`: Name): DictionaryType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryType]
  }
  
  extension [Self <: DictionaryType](x: Self) {
    
    inline def setType(value: Name): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
