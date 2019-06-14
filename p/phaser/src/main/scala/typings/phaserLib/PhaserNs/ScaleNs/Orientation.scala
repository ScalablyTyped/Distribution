package typings
package phaserLib.PhaserNs.ScaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Phaser Scale Manager constants for orientation.
  */
@JSGlobal("Phaser.Scale.Orientation")
@js.native
object Orientation extends js.Object {
  /**
    * A landscape orientation.
    */
  @js.native
  sealed trait LANDSCAPE
    extends phaserLib.PhaserNs.ScaleNs.Orientation
  
  /**
    * A portrait orientation.
    */
  @js.native
  sealed trait PORTRAIT
    extends phaserLib.PhaserNs.ScaleNs.Orientation
  
  /* 0 */ val LANDSCAPE: LANDSCAPE with scala.Double = js.native
  /* 1 */ val PORTRAIT: PORTRAIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.ScaleNs.Orientation with scala.Double] = js.native
}

