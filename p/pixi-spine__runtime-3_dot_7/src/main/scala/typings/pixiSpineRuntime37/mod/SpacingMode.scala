package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpacingMode extends StObject
@JSImport("@pixi-spine/runtime-3.7", "SpacingMode")
@js.native
object SpacingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpacingMode & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with SpacingMode
  /* 1 */ val Fixed: typings.pixiSpineRuntime37.mod.SpacingMode.Fixed & Double = js.native
  
  @js.native
  sealed trait Length
    extends StObject
       with SpacingMode
  /* 0 */ val Length: typings.pixiSpineRuntime37.mod.SpacingMode.Length & Double = js.native
  
  @js.native
  sealed trait Percent
    extends StObject
       with SpacingMode
  /* 2 */ val Percent: typings.pixiSpineRuntime37.mod.SpacingMode.Percent & Double = js.native
}
