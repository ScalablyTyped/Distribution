package typings.pixiSpine.PIXI.spine.core

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
  implicit class JitterEffectOps[Self <: JitterEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJitterX(value: Double): Self = this.set("jitterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterY(value: Double): Self = this.set("jitterY", value.asInstanceOf[js.Any])
  }
}
