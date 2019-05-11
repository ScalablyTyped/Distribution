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
  
  val LINEAR: LINEAR with java.lang.String = js.native
  val NEAREST: NEAREST with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.TexturesNs.FilterMode with java.lang.String] = js.native
}

