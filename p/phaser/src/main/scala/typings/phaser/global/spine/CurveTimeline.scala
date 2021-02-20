package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends typings.phaser.spine.CurveTimeline {
  def this(frameCount: Double) = this()
}
object CurveTimeline {
  
  @JSGlobal("spine.CurveTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.BEZIER")
  @js.native
  def BEZIER: Double = js.native
  @scala.inline
  def BEZIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.BEZIER_SIZE")
  @js.native
  def BEZIER_SIZE: Double = js.native
  @scala.inline
  def BEZIER_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEZIER_SIZE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.LINEAR")
  @js.native
  def LINEAR: Double = js.native
  @scala.inline
  def LINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.CurveTimeline.STEPPED")
  @js.native
  def STEPPED: Double = js.native
  @scala.inline
  def STEPPED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEPPED")(x.asInstanceOf[js.Any])
}
