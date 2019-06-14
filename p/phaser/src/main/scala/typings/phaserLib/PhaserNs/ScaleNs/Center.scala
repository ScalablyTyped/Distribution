package typings
package phaserLib.PhaserNs.ScaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Center extends js.Object

/**
  * Phaser Scale Manager constants for centering the game canvas.
  */
@JSGlobal("Phaser.Scale.Center")
@js.native
object Center extends js.Object {
  /**
    * The game canvas is centered both horizontally and vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_BOTH
    extends phaserLib.PhaserNs.ScaleNs.Center
  
  /**
    * The game canvas is centered horizontally within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_HORIZONTALLY
    extends phaserLib.PhaserNs.ScaleNs.Center
  
  /**
    * The game canvas is centered both vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  @js.native
  sealed trait CENTER_VERTICALLY
    extends phaserLib.PhaserNs.ScaleNs.Center
  
  /**
    * The game canvas is not centered within the parent by Phaser.
    * You can still center it yourself via CSS.
    */
  @js.native
  sealed trait NO_CENTER
    extends phaserLib.PhaserNs.ScaleNs.Center
  
  /* 1 */ val CENTER_BOTH: CENTER_BOTH with scala.Double = js.native
  /* 2 */ val CENTER_HORIZONTALLY: CENTER_HORIZONTALLY with scala.Double = js.native
  /* 3 */ val CENTER_VERTICALLY: CENTER_VERTICALLY with scala.Double = js.native
  /* 0 */ val NO_CENTER: NO_CENTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.ScaleNs.Center with scala.Double] = js.native
}

