package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransformMode extends js.Object

@JSGlobal("spine.TransformMode")
@js.native
object TransformMode extends js.Object {
  @js.native
  sealed trait NoRotationOrReflection
    extends phaserLib.spineNs.TransformMode
  
  @js.native
  sealed trait NoScale
    extends phaserLib.spineNs.TransformMode
  
  @js.native
  sealed trait NoScaleOrReflection
    extends phaserLib.spineNs.TransformMode
  
  @js.native
  sealed trait Normal
    extends phaserLib.spineNs.TransformMode
  
  @js.native
  sealed trait OnlyTranslation
    extends phaserLib.spineNs.TransformMode
  
  /* 2 */ val NoRotationOrReflection: NoRotationOrReflection with scala.Double = js.native
  /* 3 */ val NoScale: NoScale with scala.Double = js.native
  /* 4 */ val NoScaleOrReflection: NoScaleOrReflection with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val OnlyTranslation: OnlyTranslation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.TransformMode with scala.Double] = js.native
}

