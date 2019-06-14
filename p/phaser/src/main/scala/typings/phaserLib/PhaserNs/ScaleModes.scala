package typings
package phaserLib.PhaserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleModes extends js.Object

/**
  * Phaser Scale Modes.
  */
@JSGlobal("Phaser.ScaleModes")
@js.native
object ScaleModes extends js.Object {
  /**
    * Default Scale Mode (Linear).
    */
  @js.native
  sealed trait DEFAULT
    extends phaserLib.PhaserNs.ScaleModes
  
  /**
    * Linear Scale Mode.
    */
  @js.native
  sealed trait LINEAR
    extends phaserLib.PhaserNs.ScaleModes
  
  /**
    * Nearest Scale Mode.
    */
  @js.native
  sealed trait NEAREST
    extends phaserLib.PhaserNs.ScaleModes
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 2 */ val NEAREST: NEAREST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.ScaleModes with scala.Double] = js.native
}

