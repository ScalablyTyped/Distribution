package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "Interpolation")
@js.native
abstract class Interpolation () extends StObject {
  
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double = js.native
  
  /* protected */ def applyInternal(a: Double): Double = js.native
}
