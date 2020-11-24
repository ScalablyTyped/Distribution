package typings.phaser.spine

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
  implicit class SwirlEffectOps[Self <: SwirlEffect] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldX(value: js.Any): Self = this.set("worldX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldY(value: js.Any): Self = this.set("worldY", value.asInstanceOf[js.Any])
  }
}
