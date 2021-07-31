package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends StObject
     with typings.phaser.spine.SwirlEffect {
  def this(radius: Double) = this()
  
  /* CompleteClass */
  var angle: Double = js.native
  
  /* CompleteClass */
  override def begin(skeleton: typings.phaser.spine.Skeleton): Unit = js.native
  
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
    position: typings.phaser.spine.Vector2,
    uv: typings.phaser.spine.Vector2,
    light: typings.phaser.spine.Color,
    dark: typings.phaser.spine.Color
  ): Unit = js.native
  
  /* CompleteClass */
  var worldX: js.Any = js.native
  
  /* CompleteClass */
  var worldY: js.Any = js.native
}
object SwirlEffect {
  
  @JSGlobal("spine.SwirlEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.SwirlEffect.interpolation")
  @js.native
  def interpolation: typings.phaser.spine.PowOut = js.native
  @scala.inline
  def interpolation_=(x: typings.phaser.spine.PowOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(x.asInstanceOf[js.Any])
}
