package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.SwirlEffect {
  def this(radius: Double) = this()
  
  /* CompleteClass */
  var angle: Double = js.native
  
  /* CompleteClass */
  override def begin(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton): Unit = js.native
  
  /* CompleteClass */
  var centerX: Double = js.native
  
  /* CompleteClass */
  var centerY: Double = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /* CompleteClass */
  override def transform(
    position: typings.pixiSpine.PIXI.spine.core.Vector2,
    uv: typings.pixiSpine.PIXI.spine.core.Vector2,
    light: typings.pixiSpine.PIXI.spine.core.Color,
    dark: typings.pixiSpine.PIXI.spine.core.Color
  ): Unit = js.native
  
  /* CompleteClass */
  var worldX: js.Any = js.native
  
  /* CompleteClass */
  var worldY: js.Any = js.native
}
object SwirlEffect {
  
  @JSGlobal("PIXI.spine.core.SwirlEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.SwirlEffect.interpolation")
  @js.native
  def interpolation: typings.pixiSpine.PIXI.spine.core.PowOut = js.native
  @scala.inline
  def interpolation_=(x: typings.pixiSpine.PIXI.spine.core.PowOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(x.asInstanceOf[js.Any])
}
