package typings.phaser.PhaserNs.TexturesNs

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
  sealed trait LINEAR extends FilterMode
  
  /**
    * Nearest neighbor filter type.
    */
  @js.native
  sealed trait NEAREST extends FilterMode
  
  /* 0 */ val LINEAR: typings.phaser.PhaserNs.TexturesNs.FilterMode.LINEAR with Double = js.native
  /* 1 */ val NEAREST: typings.phaser.PhaserNs.TexturesNs.FilterMode.NEAREST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterMode with Double] = js.native
}

