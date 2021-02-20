package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JitterEffect extends VertexEffect {
  
  var jitterX: Double = js.native
  
  var jitterY: Double = js.native
}
object JitterEffect {
  
  @scala.inline
  def apply(
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
  implicit class JitterEffectMutableBuilder[Self <: JitterEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJitterX(value: Double): Self = StObject.set(x, "jitterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterY(value: Double): Self = StObject.set(x, "jitterY", value.asInstanceOf[js.Any])
  }
}
