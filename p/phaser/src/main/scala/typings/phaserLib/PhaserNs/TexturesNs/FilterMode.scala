package typings
package phaserLib.PhaserNs.TexturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterMode extends js.Object

/**
  * Filter Types.
  */
@JSGlobal("Phaser.Textures.FilterMode")
@js.native
object FilterMode extends js.Object {
  /**
    * Linear filter type.
    */
  @js.native
  sealed trait LINEAR
    extends phaserLib.PhaserNs.TexturesNs.FilterMode
  
  /**
    * Nearest neighbor filter type.
    */
  @js.native
  sealed trait NEAREST
    extends phaserLib.PhaserNs.TexturesNs.FilterMode
  
  /* 0 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 1 */ val NEAREST: NEAREST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.TexturesNs.FilterMode with scala.Double] = js.native
}

