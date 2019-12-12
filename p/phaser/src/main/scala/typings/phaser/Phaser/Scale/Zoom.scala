package typings.phaser.Phaser.Scale

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Zoom extends js.Object

/**
  * Phaser Scale Manager constants for zoom modes.
  */
@JSGlobal("Phaser.Scale.Zoom")
@js.native
object Zoom extends js.Object {
  /**
    * Calculate the zoom value based on the maximum multiplied game size that will
    * fit into the parent, or browser window if no parent is set.
    */
  @js.native
  sealed trait MAX_ZOOM extends Zoom
  
  /**
    * The game canvas will not be zoomed by Phaser.
    */
  @js.native
  sealed trait NO_ZOOM extends Zoom
  
  /**
    * The game canvas will be 2x zoomed by Phaser.
    */
  @js.native
  sealed trait ZOOM_2X extends Zoom
  
  /**
    * The game canvas will be 4x zoomed by Phaser.
    */
  @js.native
  sealed trait ZOOM_4X extends Zoom
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Zoom with Double] = js.native
  /* 3 */ @js.native
  object MAX_ZOOM
    extends TopLevel[typings.phaser.Phaser.Scale.Zoom.MAX_ZOOM with Double]
  
  /* 0 */ @js.native
  object NO_ZOOM
    extends TopLevel[typings.phaser.Phaser.Scale.Zoom.NO_ZOOM with Double]
  
  /* 1 */ @js.native
  object ZOOM_2X
    extends TopLevel[typings.phaser.Phaser.Scale.Zoom.ZOOM_2X with Double]
  
  /* 2 */ @js.native
  object ZOOM_4X
    extends TopLevel[typings.phaser.Phaser.Scale.Zoom.ZOOM_4X with Double]
  
}

