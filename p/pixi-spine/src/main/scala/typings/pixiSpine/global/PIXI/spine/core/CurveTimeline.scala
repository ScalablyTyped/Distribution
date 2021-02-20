package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends typings.pixiSpine.PIXI.spine.core.CurveTimeline {
  def this(frameCount: Double) = this()
}
object CurveTimeline {
  
  @JSGlobal("PIXI.spine.core.CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  @scala.inline
  def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  @scala.inline
  def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  @scala.inline
  def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  @scala.inline
  def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
