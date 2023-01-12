package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JitterEffect
  extends StObject
     with VertexEffect {
  
  var jitterX: Double
  
  var jitterY: Double
}
object JitterEffect {
  
  inline def apply(
    begin: Skeleton => Unit,
    end: () => Unit,
    jitterX: Double,
    jitterY: Double,
    transform: (Vector2, Vector2, Color, Color) => Unit
  ): JitterEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), jitterX = jitterX.asInstanceOf[js.Any], jitterY = jitterY.asInstanceOf[js.Any], transform = js.Any.fromFunction4(transform))
    __obj.asInstanceOf[JitterEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JitterEffect] (val x: Self) extends AnyVal {
    
    inline def setJitterX(value: Double): Self = StObject.set(x, "jitterX", value.asInstanceOf[js.Any])
    
    inline def setJitterY(value: Double): Self = StObject.set(x, "jitterY", value.asInstanceOf[js.Any])
  }
}
