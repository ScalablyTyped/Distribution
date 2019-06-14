package typings
package phaserLib.PhaserNs.ScaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleModes extends js.Object

/**
  * Phaser Scale Manager constants for the different scale modes available.
  */
@JSGlobal("Phaser.Scale.ScaleModes")
@js.native
object ScaleModes extends js.Object {
  /**
    * The width and height are automatically adjusted to make the size cover the entire target
    * area while keeping the aspect ratio. This may extend further out than the target size.
    */
  @js.native
  sealed trait ENVELOP
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The width and height are automatically adjusted to fit inside the given target area,
    * while keeping the aspect ratio. Depending on the aspect ratio there may be some space
    * inside the area which is not covered.
    */
  @js.native
  sealed trait FIT
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The width is automatically adjusted based on the height.
    */
  @js.native
  sealed trait HEIGHT_CONTROLS_WIDTH
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
    * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
    * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
    */
  @js.native
  sealed trait NONE
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The Canvas is resized to fit all available _parent_ space, regardless of aspect ratio.
    */
  @js.native
  sealed trait RESIZE
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The height is automatically adjusted based on the width.
    */
  @js.native
  sealed trait WIDTH_CONTROLS_HEIGHT
    extends phaserLib.PhaserNs.ScaleNs.ScaleModes
  
  /* 4 */ val ENVELOP: ENVELOP with scala.Double = js.native
  /* 3 */ val FIT: FIT with scala.Double = js.native
  /* 2 */ val HEIGHT_CONTROLS_WIDTH: HEIGHT_CONTROLS_WIDTH with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 5 */ val RESIZE: RESIZE with scala.Double = js.native
  /* 1 */ val WIDTH_CONTROLS_HEIGHT: WIDTH_CONTROLS_HEIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.ScaleNs.ScaleModes with scala.Double] = js.native
}

