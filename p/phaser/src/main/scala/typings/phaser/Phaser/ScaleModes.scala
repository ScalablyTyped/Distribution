package typings.phaser.Phaser

import org.scalablytyped.runtime.TopLevel
import typings.phaser.Phaser.ScaleModes.DEFAULT
import typings.phaser.Phaser.ScaleModes.LINEAR
import typings.phaser.Phaser.ScaleModes.NEAREST
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleModes with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 1 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  /* 2 */ @js.native
  object NEAREST extends TopLevel[NEAREST with Double]
  
}

