package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexEffect extends StObject {
  
  def begin(skeleton: Skeleton): Unit
  
  def end(): Unit
  
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit
}
object VertexEffect {
  
  inline def apply(begin: Skeleton => Unit, end: () => Unit, transform: (Vector2, Vector2, Color, Color) => Unit): VertexEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), end = js.Any.fromFunction0(end), transform = js.Any.fromFunction4(transform))
    __obj.asInstanceOf[VertexEffect]
  }
  
  extension [Self <: VertexEffect](x: Self) {
    
    inline def setBegin(value: Skeleton => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setTransform(value: (Vector2, Vector2, Color, Color) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction4(value))
  }
}
