package typings.phaser.PhaserNs.ScaleNs

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
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The width and height are automatically adjusted to fit inside the given target area,
    * while keeping the aspect ratio. Depending on the aspect ratio there may be some space
    * inside the area which is not covered.
    */
  @js.native
  sealed trait FIT
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The width is automatically adjusted based on the height.
    */
  @js.native
  sealed trait HEIGHT_CONTROLS_WIDTH
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
    * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
    * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
    */
  @js.native
  sealed trait NONE
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The Canvas is resized to fit all available _parent_ space, regardless of aspect ratio.
    */
  @js.native
  sealed trait RESIZE
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /**
    * The height is automatically adjusted based on the width.
    */
  @js.native
  sealed trait WIDTH_CONTROLS_HEIGHT
    extends typings.phaser.PhaserNs.ScaleNs.ScaleModes
  
  /* 4 */ val ENVELOP: typings.phaser.PhaserNs.ScaleNs.ScaleModes.ENVELOP with Double = js.native
  /* 3 */ val FIT: typings.phaser.PhaserNs.ScaleNs.ScaleModes.FIT with Double = js.native
  /* 2 */ val HEIGHT_CONTROLS_WIDTH: typings.phaser.PhaserNs.ScaleNs.ScaleModes.HEIGHT_CONTROLS_WIDTH with Double = js.native
  /* 0 */ val NONE: typings.phaser.PhaserNs.ScaleNs.ScaleModes.NONE with Double = js.native
  /* 5 */ val RESIZE: typings.phaser.PhaserNs.ScaleNs.ScaleModes.RESIZE with Double = js.native
  /* 1 */ val WIDTH_CONTROLS_HEIGHT: typings.phaser.PhaserNs.ScaleNs.ScaleModes.WIDTH_CONTROLS_HEIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.phaser.PhaserNs.ScaleNs.ScaleModes with Double] = js.native
}

