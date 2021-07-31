package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.JitterEffect")
@js.native
class JitterEffect protected ()
  extends StObject
     with typings.phaser.spine.JitterEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  
  /* CompleteClass */
  override def begin(skeleton: typings.phaser.spine.Skeleton): Unit = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  /* CompleteClass */
  var jitterX: Double = js.native
  
  /* CompleteClass */
  var jitterY: Double = js.native
  
  /* CompleteClass */
  override def transform(
    position: typings.phaser.spine.Vector2,
    uv: typings.phaser.spine.Vector2,
    light: typings.phaser.spine.Color,
    dark: typings.phaser.spine.Color
  ): Unit = js.native
}
