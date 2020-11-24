package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexEffect extends js.Object {
  
  def begin(skeleton: Skeleton): Unit = js.native
  
  def end(): Unit = js.native
  
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit = js.native
}
object VertexEffect {
  
  @scala.inline
  def apply(begin: Skeleton => Unit, end: () => Unit, transform: (Vector2, Vector2, Color, Color) => Unit): VertexEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), transform = js.Any.fromFunction4(transform))
    __obj.asInstanceOf[VertexEffect]
  }
  
  @scala.inline
  implicit class VertexEffectOps[Self <: VertexEffect] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: Skeleton => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransform(value: (Vector2, Vector2, Color, Color) => Unit): Self = this.set("transform", js.Any.fromFunction4(value))
  }
}
