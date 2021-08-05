package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.PowOut")
@js.native
class PowOut protected ()
  extends StObject
     with typings.phaser.spine.PowOut {
  def this(power: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(start: Double, end: Double, a: Double): Double = js.native
  
  /* protected */ /* CompleteClass */
  override def applyInternal(a: Double): Double = js.native
  
  /* protected */ /* CompleteClass */
  var power: Double = js.native
}
