package typings.pixiJs.PIXI

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flexible wrapper around `ArrayBuffer` that also provides
  * typed array views on demand.
  *
  * @class
  * @memberof PIXI
  */
trait ViewableBuffer extends js.Object {
  /**
    * View on the raw binary data as a `Float32Array`.
    *
    * @member {Float32Array} PIXI.ViewableBuffer#float32View
    */
  var float32View: Float32Array
  /**
    * View on the raw binary data as a `Int16Array`.
    *
    * @member {Int16Array}
    */
  var int16View: Int16Array
  /**
    * View on the raw binary data as a `Int32Array`.
    *
    * @member {Int32Array}
    */
  var int32View: Int32Array
  /**
    * View on the raw binary data as a `Int8Array`.
    *
    * @member {Int8Array}
    */
  var int8View: Int8Array
  /**
    * Underlying `ArrayBuffer` that holds all the data
    * and is of capacity `size`.
    *
    * @member {ArrayBuffer} PIXI.ViewableBuffer#rawBinaryData
    */
  var rawBinaryData: ArrayBuffer
  /**
    * View on the raw binary data as a `Uint16Array`.
    *
    * @member {Uint16Array}
    */
  var uint16View: Uint16Array
  /**
    * View on the raw binary data as a `Uint32Array`.
    *
    * @member {Uint32Array} PIXI.ViewableBuffer#uint32View
    */
  var uint32View: Uint32Array
  /**
    * View on the raw binary data as a `Uint8Array`.
    *
    * @member {Uint8Array}
    */
  var uint8View: Uint8Array
  /**
    * Destroys all buffer references. Do not use after calling
    * this.
    */
  def destroy(): Unit
  /**
    * Returns the view of the given type.
    *
    * @param {string} type - One of `int8`, `uint8`, `int16`,
    *    `uint16`, `int32`, `uint32`, and `float32`.
    * @return {object} typed array of given type
    */
  def view(`type`: String): js.Any
}

object ViewableBuffer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    float32View: Float32Array,
    int16View: Int16Array,
    int32View: Int32Array,
    int8View: Int8Array,
    rawBinaryData: ArrayBuffer,
    uint16View: Uint16Array,
    uint32View: Uint32Array,
    uint8View: Uint8Array,
    view: String => js.Any
  ): ViewableBuffer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), float32View = float32View.asInstanceOf[js.Any], int16View = int16View.asInstanceOf[js.Any], int32View = int32View.asInstanceOf[js.Any], int8View = int8View.asInstanceOf[js.Any], rawBinaryData = rawBinaryData.asInstanceOf[js.Any], uint16View = uint16View.asInstanceOf[js.Any], uint32View = uint32View.asInstanceOf[js.Any], uint8View = uint8View.asInstanceOf[js.Any], view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[ViewableBuffer]
  }
}

