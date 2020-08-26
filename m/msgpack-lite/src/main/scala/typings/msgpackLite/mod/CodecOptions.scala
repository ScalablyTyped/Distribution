package typings.msgpackLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodecOptions extends js.Object {
  /**
    * It ties msgpack's bin format with ArrayBuffer object, instead of Buffer object.
    * @default false
    */
  var binarraybuffer: js.UndefOr[Boolean] = js.native
  /**
    * It decodes msgpack's int64/uint64 formats with int64-buffer object.
    * int64-buffer is a cutom integer type with 64 bits of precision instead
    * of the built-in IEEE-754 53 bits. See https://github.com/kawanet/int64-buffer
    * @default false
    */
  var int64: js.UndefOr[Boolean] = js.native
  /**
    * It includes the preset extensions for JavaScript native objects.
    * @see https://github.com/kawanet/msgpack-lite#extension-types
    * @default false
    */
  var preset: js.UndefOr[Boolean] = js.native
  /**
    * It runs a validation of the value before writing it into buffer.
    * This is the default behavior for some old browsers which do not support ArrayBuffer object.
    * @default varies
    */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * It returns Uint8Array object when encoding, instead of Buffer object.
    * @default false
    */
  var uint8array: js.UndefOr[Boolean] = js.native
  /**
    * It uses the global JavaScript Map type, if available, to unpack MessagePack map elements.
    * @default false
    */
  var usemap: js.UndefOr[Boolean] = js.native
  /**
    * It uses raw formats instead of bin and str.
    * Set true for compatibility with msgpack's old spec.
    * @see https://github.com/kawanet/msgpack-lite#compatibility-mode
    * @default false
    */
  var useraw: js.UndefOr[Boolean] = js.native
}

object CodecOptions {
  @scala.inline
  def apply(): CodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodecOptions]
  }
  @scala.inline
  implicit class CodecOptionsOps[Self <: CodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinarraybuffer(value: Boolean): Self = this.set("binarraybuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinarraybuffer: Self = this.set("binarraybuffer", js.undefined)
    @scala.inline
    def setInt64(value: Boolean): Self = this.set("int64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64: Self = this.set("int64", js.undefined)
    @scala.inline
    def setPreset(value: Boolean): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setUint8array(value: Boolean): Self = this.set("uint8array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUint8array: Self = this.set("uint8array", js.undefined)
    @scala.inline
    def setUsemap(value: Boolean): Self = this.set("usemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsemap: Self = this.set("usemap", js.undefined)
    @scala.inline
    def setUseraw(value: Boolean): Self = this.set("useraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseraw: Self = this.set("useraw", js.undefined)
  }
  
}

