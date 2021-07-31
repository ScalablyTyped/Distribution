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
  
  @scala.inline
  def apply(components: Double, semantic: String, `type`: Double): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  @scala.inline
  implicit class ComponentsMutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setSemantic(value: String): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
