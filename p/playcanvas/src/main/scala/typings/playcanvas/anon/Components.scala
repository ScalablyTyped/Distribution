package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  var components: Double
  
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  var semantic: String
  
  var `type`: Double
}
object Components {
  
  inline def apply(components: Double, semantic: String, `type`: Double): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
