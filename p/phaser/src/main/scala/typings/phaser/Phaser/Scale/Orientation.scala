package typings.phaser.Phaser.Scale

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
  sealed trait LANDSCAPE extends Orientation
  
  /**
    * A portrait orientation.
    */
  @js.native
  sealed trait PORTRAIT extends Orientation
  
  /* 0 */ val LANDSCAPE: typings.phaser.Phaser.Scale.Orientation.LANDSCAPE with Double = js.native
  /* 1 */ val PORTRAIT: typings.phaser.Phaser.Scale.Orientation.PORTRAIT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

