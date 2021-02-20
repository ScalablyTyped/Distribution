package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwirlEffect extends VertexEffect {
  
  var angle: Double = js.native
  
  var centerX: Double = js.native
  
  var centerY: Double = js.native
  
  var radius: Double = js.native
  
  var worldX: js.Any = js.native
  
  var worldY: js.Any = js.native
}
object SwirlEffect {
  
  @scala.inline
  def apply(
    angle: Double,
    begin: Skeleton => Unit,
    centerX: Double,
    centerY: Double,
    end: () => Unit,
    radius: Double,
    transform: (Vector2, Vector2, Color, Color) => Unit,
    worldX: js.Any,
    worldY: js.Any
  ): SwirlEffect = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], begin = js.Any.fromFunction1(begin), centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), radius = radius.asInstanceOf[js.Any], transform = js.Any.fromFunction4(transform), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwirlEffect]
  }
  
  @scala.inline
  implicit class SwirlEffectMutableBuilder[Self <: SwirlEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldX(value: js.Any): Self = StObject.set(x, "worldX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldY(value: js.Any): Self = StObject.set(x, "worldY", value.asInstanceOf[js.Any])
  }
}
