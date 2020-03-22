package typings.pixiJs.PIXI.utils

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a Canvas element of the given size to be used as a target for rendering to.
  *
  * @class
  * @memberof PIXI.utils
  */
@JSGlobal("PIXI.utils.CanvasRenderTarget")
@js.native
class CanvasRenderTarget protected () extends js.Object {
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, resolution: Double) = this()
  /**
    * The Canvas object that belongs to this CanvasRenderTarget.
    *
    * @member {HTMLCanvasElement} PIXI.utils.CanvasRenderTarget#canvas
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * A CanvasRenderingContext2D object representing a two-dimensional rendering context.
    *
    * @member {CanvasRenderingContext2D} PIXI.utils.CanvasRenderTarget#context
    */
  var context: CanvasRenderingContext2D = js.native
  /**
    * The height of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var height: Double = js.native
  /**
    * The width of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var width: Double = js.native
  /**
    * Destroys this canvas.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Resizes the canvas to the specified width and height.
    *
    * @param {number} width - the new width of the canvas
    * @param {number} height - the new height of the canvas
    */
  def resize(width: Double, height: Double): Unit = js.native
}

