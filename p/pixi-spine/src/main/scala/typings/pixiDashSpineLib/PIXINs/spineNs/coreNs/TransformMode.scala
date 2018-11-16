package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransformMode extends js.Object

@JSGlobal("PIXI.spine.core.TransformMode")
@js.native
object TransformMode extends js.Object {
  @js.native
  sealed trait NoRotationOrReflection
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode
  
  @js.native
  sealed trait NoScale
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode
  
  @js.native
  sealed trait NoScaleOrReflection
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode
  
  @js.native
  sealed trait Normal
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode
  
  @js.native
  sealed trait OnlyTranslation
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode
  
  /* 2 */ val NoRotationOrReflection: NoRotationOrReflection with scala.Double = js.native
  /* 3 */ val NoScale: NoScale with scala.Double = js.native
  /* 4 */ val NoScaleOrReflection: NoScaleOrReflection with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val OnlyTranslation: OnlyTranslation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.TransformMode with scala.Double] = js.native
}

