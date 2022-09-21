package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MixDirection extends StObject
@JSImport("@pixi-spine/base", "MixDirection")
@js.native
object MixDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixDirection & Double] = js.native
  
  @js.native
  sealed trait mixIn
    extends StObject
       with MixDirection
  /* 0 */ val mixIn: typings.pixiSpineBase.mod.MixDirection.mixIn & Double = js.native
  
  @js.native
  sealed trait mixOut
    extends StObject
       with MixDirection
  /* 1 */ val mixOut: typings.pixiSpineBase.mod.MixDirection.mixOut & Double = js.native
}
