package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDefinitionGeneric[T] extends StObject {
  
  var name: T
  
  var scaling: js.UndefOr[T] = js.undefined
  
  var url: T
}
object ImageDefinitionGeneric {
  
  inline def apply[T](name: T, url: T): ImageDefinitionGeneric[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDefinitionGeneric[T]]
  }
  
  extension [Self <: ImageDefinitionGeneric[?], T](x: Self & ImageDefinitionGeneric[T]) {
    
    inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScaling(value: T): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setUrl(value: T): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
