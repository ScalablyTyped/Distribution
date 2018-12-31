package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecOptions extends js.Object {
  /**
    * It ties msgpack's bin format with ArrayBuffer object, instead of Buffer object.
    * @default false
    */
  var binarraybuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It decodes msgpack's int64/uint64 formats with int64-buffer object.
    * int64-buffer is a cutom integer type with 64 bits of precision instead
    * of the built-in IEEE-754 53 bits. See https://github.com/kawanet/int64-buffer
    * @default false
    */
  var int64: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It includes the preset extensions for JavaScript native objects.
    * @see https://github.com/kawanet/msgpack-lite#extension-types
    * @default false
    */
  var preset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It runs a validation of the value before writing it into buffer.
    * This is the default behavior for some old browsers which do not support ArrayBuffer object.
    * @default varies
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It returns Uint8Array object when encoding, instead of Buffer object.
    * @default false
    */
  var uint8array: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It uses the global JavaScript Map type, if available, to unpack MessagePack map elements.
    * @default false
    */
  var usemap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It uses raw formats instead of bin and str.
    * Set true for compatibility with msgpack's old spec.
    * @see https://github.com/kawanet/msgpack-lite#compatibility-mode
    * @default false
    */
  var useraw: js.UndefOr[scala.Boolean] = js.undefined
}

