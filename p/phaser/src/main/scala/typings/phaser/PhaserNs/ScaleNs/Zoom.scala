package typings.phaser.PhaserNs.ScaleNs

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
  
  /* 3 */ val MAX_ZOOM: typings.phaser.PhaserNs.ScaleNs.Zoom.MAX_ZOOM with Double = js.native
  /* 0 */ val NO_ZOOM: typings.phaser.PhaserNs.ScaleNs.Zoom.NO_ZOOM with Double = js.native
  /* 1 */ val ZOOM_2X: typings.phaser.PhaserNs.ScaleNs.Zoom.ZOOM_2X with Double = js.native
  /* 2 */ val ZOOM_4X: typings.phaser.PhaserNs.ScaleNs.Zoom.ZOOM_4X with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Zoom with Double] = js.native
}

