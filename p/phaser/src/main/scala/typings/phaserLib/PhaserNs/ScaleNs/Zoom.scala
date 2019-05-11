package typings
package phaserLib.PhaserNs.ScaleNs

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
  sealed trait MAX_ZOOM
    extends phaserLib.PhaserNs.ScaleNs.Zoom
  
  /**
    * The game canvas will not be zoomed by Phaser.
    */
  @js.native
  sealed trait NO_ZOOM
    extends phaserLib.PhaserNs.ScaleNs.Zoom
  
  /**
    * The game canvas will be 2x zoomed by Phaser.
    */
  @js.native
  sealed trait ZOOM_2X
    extends phaserLib.PhaserNs.ScaleNs.Zoom
  
  /**
    * The game canvas will be 4x zoomed by Phaser.
    */
  @js.native
  sealed trait ZOOM_4X
    extends phaserLib.PhaserNs.ScaleNs.Zoom
  
  val MAX_ZOOM: MAX_ZOOM with java.lang.String = js.native
  val NO_ZOOM: NO_ZOOM with java.lang.String = js.native
  val ZOOM_2X: ZOOM_2X with java.lang.String = js.native
  val ZOOM_4X: ZOOM_4X with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.ScaleNs.Zoom with java.lang.String] = js.native
}

