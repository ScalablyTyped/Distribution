package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: js.UndefOr[Boolean] = js.undefined
  
  var rotation: js.UndefOr[Boolean] = js.undefined
  
  var tint: js.UndefOr[Boolean] = js.undefined
  
  var uvs: js.UndefOr[Boolean] = js.undefined
  
  var vertices: js.UndefOr[Boolean] = js.undefined
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setTint(value: Boolean): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    
    inline def setUvs(value: Boolean): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    inline def setVertices(value: Boolean): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
  }
}
