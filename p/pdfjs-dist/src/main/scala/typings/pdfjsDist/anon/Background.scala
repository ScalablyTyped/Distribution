package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: js.UndefOr[Null] = js.undefined
  
  var transform: Any
  
  var transparency: js.UndefOr[Boolean] = js.undefined
  
  var viewport: Any
}
object Background {
  
  inline def apply(transform: Any, viewport: Any): Background = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Boolean): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
