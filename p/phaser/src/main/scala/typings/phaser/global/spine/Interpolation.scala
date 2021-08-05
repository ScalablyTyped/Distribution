package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Interpolation")
@js.native
abstract class Interpolation ()
  extends StObject
     with typings.phaser.spine.Interpolation {
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(start: Double, end: Double, a: Double): Double = js.native
  
  /* protected */ /* CompleteClass */
  override def applyInternal(a: Double): Double = js.native
}
