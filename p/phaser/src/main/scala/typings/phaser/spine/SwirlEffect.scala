package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwirlEffect
  extends StObject
     with VertexEffect {
  
  var angle: Double
  
  var centerX: Double
  
  var centerY: Double
  
  var radius: Double
  
  /* private */ var worldX: Any
  
  /* private */ var worldY: Any
}
object SwirlEffect {
  
  inline def apply(
    angle: Double,
    begin: Skeleton => Unit,
    centerX: Double,
    centerY: Double,
    end: () => Unit,
    radius: Double,
    transform: (Vector2, Vector2, Color, Color) => Unit,
    worldX: Any,
    worldY: Any
  ): SwirlEffect = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], begin = js.Any.fromFunction1(begin), centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), radius = radius.asInstanceOf[js.Any], transform = js.Any.fromFunction4(transform), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwirlEffect]
  }
  
  extension [Self <: SwirlEffect](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setWorldX(value: Any): Self = StObject.set(x, "worldX", value.asInstanceOf[js.Any])
    
    inline def setWorldY(value: Any): Self = StObject.set(x, "worldY", value.asInstanceOf[js.Any])
  }
}
