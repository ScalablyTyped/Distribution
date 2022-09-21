package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "JitterEffect")
@js.native
open class JitterEffect protected ()
  extends StObject
     with VertexEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  
  /* CompleteClass */
  override def begin(skeleton: Skeleton): Unit = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  var jitterX: Double = js.native
  
  var jitterY: Double = js.native
  
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit = js.native
}
