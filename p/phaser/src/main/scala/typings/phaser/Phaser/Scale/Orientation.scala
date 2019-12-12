package typings.phaser.Phaser.Scale

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 0 */ @js.native
  object LANDSCAPE
    extends TopLevel[typings.phaser.Phaser.Scale.Orientation.LANDSCAPE with Double]
  
  /* 1 */ @js.native
  object PORTRAIT
    extends TopLevel[typings.phaser.Phaser.Scale.Orientation.PORTRAIT with Double]
  
}

