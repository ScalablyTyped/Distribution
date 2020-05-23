package typings.pixiJs.global.PIXI

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper for data so that it can be used and uploaded by WebGL
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Buffer")
@js.native
class Buffer protected ()
  extends typings.pixiJs.PIXI.Buffer {
  def this(data: ArrayBuffer) = this()
  def this(data: ArrayBufferView) = this()
  def this(data: SharedArrayBuffer) = this()
  def this(data: ArrayBufferView, _static: Boolean) = this()
  def this(data: ArrayBuffer, _static: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean) = this()
  def this(data: ArrayBufferView, _static: Boolean, index: Boolean) = this()
  def this(data: ArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: SharedArrayBuffer, _static: Boolean, index: Boolean) = this()
}

/* static members */
@JSGlobal("PIXI.Buffer")
@js.native
object Buffer extends js.Object {
  def from(data: js.Array[Double]): typings.pixiJs.PIXI.Buffer = js.native
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    *
    * @static
    * @param {ArrayBufferView | number[]} data the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @return {PIXI.Buffer} A new Buffer based on the data provided.
    */
  def from(data: ArrayBufferView): typings.pixiJs.PIXI.Buffer = js.native
}

