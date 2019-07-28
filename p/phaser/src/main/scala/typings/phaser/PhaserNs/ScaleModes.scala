package typings.phaser.PhaserNs

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
  sealed trait DEFAULT extends ScaleModes
  
  /**
    * Linear Scale Mode.
    */
  @js.native
  sealed trait LINEAR extends ScaleModes
  
  /**
    * Nearest Scale Mode.
    */
  @js.native
  sealed trait NEAREST extends ScaleModes
  
  /* 0 */ val DEFAULT: typings.phaser.PhaserNs.ScaleModes.DEFAULT with Double = js.native
  /* 1 */ val LINEAR: typings.phaser.PhaserNs.ScaleModes.LINEAR with Double = js.native
  /* 2 */ val NEAREST: typings.phaser.PhaserNs.ScaleModes.NEAREST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleModes with Double] = js.native
}

