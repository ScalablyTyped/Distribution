package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.PowOut
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "SwirlEffect")
@js.native
open class SwirlEffect protected ()
  extends StObject
     with VertexEffect {
  def this(radius: Double) = this()
  
  var angle: Double = js.native
  
  /* CompleteClass */
  override def begin(skeleton: Skeleton): Unit = js.native
  
  var centerX: Double = js.native
  
  var centerY: Double = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  var radius: Double = js.native
  
  /* CompleteClass */
  override def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit = js.native
  
  /* private */ var worldX: Any = js.native
  
  /* private */ var worldY: Any = js.native
}
/* static members */
object SwirlEffect {
  
  @JSImport("@pixi-spine/runtime-3.8", "SwirlEffect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "SwirlEffect.interpolation")
  @js.native
  def interpolation: PowOut = js.native
  inline def interpolation_=(x: PowOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(x.asInstanceOf[js.Any])
}
