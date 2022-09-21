package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJsonDefinitionGeneric[T] extends StObject {
  
  var content: T
  
  var name: T
  
  var `type`: T
}
object GeoJsonDefinitionGeneric {
  
  inline def apply[T](content: T, name: T, `type`: T): GeoJsonDefinitionGeneric[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJsonDefinitionGeneric[T]]
  }
  
  extension [Self <: GeoJsonDefinitionGeneric[?], T](x: Self & GeoJsonDefinitionGeneric[T]) {
    
    inline def setContent(value: T): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
