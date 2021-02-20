package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends StObject {
  
  var position: js.UndefOr[Boolean] = js.native
  
  var rotation: js.UndefOr[Boolean] = js.native
  
  var tint: js.UndefOr[Boolean] = js.native
  
  var uvs: js.UndefOr[Boolean] = js.native
  
  var vertices: js.UndefOr[Boolean] = js.native
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setTint(value: Boolean): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    
    @scala.inline
    def setUvs(value: Boolean): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    @scala.inline
    def setVertices(value: Boolean): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
  }
}
