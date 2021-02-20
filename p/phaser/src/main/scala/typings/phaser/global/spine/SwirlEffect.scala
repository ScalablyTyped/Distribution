package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SwirlEffect")
@js.native
class SwirlEffect protected ()
  extends typings.phaser.spine.SwirlEffect {
  def this(radius: Double) = this()
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
