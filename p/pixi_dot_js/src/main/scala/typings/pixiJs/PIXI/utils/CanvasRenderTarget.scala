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
trait CanvasRenderTarget extends js.Object {
  /**
    * The Canvas object that belongs to this CanvasRenderTarget.
    *
    * @member {HTMLCanvasElement} PIXI.utils.CanvasRenderTarget#canvas
    */
  var canvas: HTMLCanvasElement
  /**
    * A CanvasRenderingContext2D object representing a two-dimensional rendering context.
    *
    * @member {CanvasRenderingContext2D} PIXI.utils.CanvasRenderTarget#context
    */
  var context: CanvasRenderingContext2D
  /**
    * The height of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var height: Double
  /**
    * The width of the canvas buffer in pixels.
    *
    * @member {number}
    */
  var width: Double
  /**
    * Destroys this canvas.
    *
    */
  def destroy(): Unit
  /**
    * Resizes the canvas to the specified width and height.
    *
    * @param {number} width - the new width of the canvas
    * @param {number} height - the new height of the canvas
    */
  def resize(width: Double, height: Double): Unit
}

object CanvasRenderTarget {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement,
    context: CanvasRenderingContext2D,
    destroy: () => Unit,
    height: Double,
    resize: (Double, Double) => Unit,
    width: Double
  ): CanvasRenderTarget = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderTarget]
  }
}

