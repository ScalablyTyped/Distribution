package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionMode extends StObject
@JSImport("@pixi-spine/base", "PositionMode")
@js.native
object PositionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionMode & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with PositionMode
  /* 0 */ val Fixed: typings.pixiSpineBase.mod.PositionMode.Fixed & Double = js.native
  
  @js.native
  sealed trait Percent
    extends StObject
       with PositionMode
  /* 1 */ val Percent: typings.pixiSpineBase.mod.PositionMode.Percent & Double = js.native
}
