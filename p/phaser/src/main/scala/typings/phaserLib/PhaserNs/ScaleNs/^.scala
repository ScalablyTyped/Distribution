package typings
package phaserLib.PhaserNs.ScaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scale")
@js.native
object ^ extends js.Object {
  /**
    * The game canvas is centered both horizontally and vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_BOTH: phaserLib.integer = js.native
  /**
    * The game canvas is centered horizontally within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_HORIZONTALLY: phaserLib.integer = js.native
  /**
    * The game canvas is centered both vertically within the parent.
    * To do this, the parent has to have a bounds that can be calculated and not be empty.
    * 
    * Centering is achieved by setting the margin left and top properties of the
    * game canvas, and does not factor in any other CSS styles you may have applied.
    */
  val CENTER_VERTICALLY: phaserLib.integer = js.native
  /**
    * The width and height are automatically adjusted to make the size cover the entire target
    * area while keeping the aspect ratio. This may extend further out than the target size.
    */
  val ENVELOP: phaserLib.integer = js.native
  /**
    * The width and height are automatically adjusted to fit inside the given target area,
    * while keeping the aspect ratio. Depending on the aspect ratio there may be some space
    * inside the area which is not covered.
    */
  val FIT: phaserLib.integer = js.native
  /**
    * The width is automatically adjusted based on the height.
    */
  val HEIGHT_CONTROLS_WIDTH: phaserLib.integer = js.native
  /**
    * A landscape orientation.
    */
  val LANDSCAPE: java.lang.String = js.native
  /**
    * Calculate the zoom value based on the maximum multiplied game size that will
    * fit into the parent, or browser window if no parent is set.
    */
  val MAX_ZOOM: phaserLib.integer = js.native
  /**
    * No scaling happens at all. The canvas is set to the size given in the game config and Phaser doesn't change it
    * again from that point on. If you change the canvas size, either via CSS, or directly via code, then you need
    * to call the Scale Managers `resize` method to give the new dimensions, or input events will stop working.
    */
  val NONE: phaserLib.integer = js.native
  /**
    * The game canvas is not centered within the parent by Phaser.
    * You can still center it yourself via CSS.
    */
  val NO_CENTER: phaserLib.integer = js.native
  /**
    * The game canvas will not be zoomed by Phaser.
    */
  val NO_ZOOM: phaserLib.integer = js.native
  /**
    * A portrait orientation.
    */
  val PORTRAIT: java.lang.String = js.native
  /**
    * The Canvas is resized to fit all available _parent_ space, regardless of aspect ratio.
    */
  val RESIZE: phaserLib.integer = js.native
  /**
    * The height is automatically adjusted based on the width.
    */
  val WIDTH_CONTROLS_HEIGHT: phaserLib.integer = js.native
  /**
    * The game canvas will be 2x zoomed by Phaser.
    */
  val ZOOM_2X: phaserLib.integer = js.native
  /**
    * The game canvas will be 4x zoomed by Phaser.
    */
  val ZOOM_4X: phaserLib.integer = js.native
}

