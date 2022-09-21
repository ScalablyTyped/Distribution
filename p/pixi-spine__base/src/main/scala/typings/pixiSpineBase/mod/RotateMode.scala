package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RotateMode extends StObject
@JSImport("@pixi-spine/base", "RotateMode")
@js.native
object RotateMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RotateMode & Double] = js.native
  
  @js.native
  sealed trait Chain
    extends StObject
       with RotateMode
  /* 1 */ val Chain: typings.pixiSpineBase.mod.RotateMode.Chain & Double = js.native
  
  @js.native
  sealed trait ChainScale
    extends StObject
       with RotateMode
  /* 2 */ val ChainScale: typings.pixiSpineBase.mod.RotateMode.ChainScale & Double = js.native
  
  @js.native
  sealed trait Tangent
    extends StObject
       with RotateMode
  /* 0 */ val Tangent: typings.pixiSpineBase.mod.RotateMode.Tangent & Double = js.native
}
