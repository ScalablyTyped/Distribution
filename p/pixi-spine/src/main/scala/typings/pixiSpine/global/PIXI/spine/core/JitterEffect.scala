package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.JitterEffect")
@js.native
class JitterEffect protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.JitterEffect {
  def this(jitterX: Double, jitterY: Double) = this()
  
  /* CompleteClass */
  override def begin(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton): Unit = js.native
  
  /* CompleteClass */
  override def end(): Unit = js.native
  
  /* CompleteClass */
  var jitterX: Double = js.native
  
  /* CompleteClass */
  var jitterY: Double = js.native
  
  /* CompleteClass */
  override def transform(
    position: typings.pixiSpine.PIXI.spine.core.Vector2,
    uv: typings.pixiSpine.PIXI.spine.core.Vector2,
    light: typings.pixiSpine.PIXI.spine.core.Color,
    dark: typings.pixiSpine.PIXI.spine.core.Color
  ): Unit = js.native
}
