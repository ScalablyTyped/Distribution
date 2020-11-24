package typings.phaser.Phaser.Scale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
