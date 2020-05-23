package typings.phaser.Phaser

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
  
}

