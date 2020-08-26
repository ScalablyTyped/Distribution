package typings.pizzip.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /**
    * set to true if the data is base64 encoded, false for binary.
    *
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * set to true if the read data should be checked against its CRC32.
    *
    * @default false
    */
  var checkCRC32: js.UndefOr[Boolean] = js.native
  /**
    * set to true to create folders in the file path automatically. Leaving it false will result in only virtual folders
    * (i.e. folders that merely represent part of the file path) being created.
    *
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.native
  /**
    * the function to decode the file name / comment. Decodes from UTF-8 by default.
    * A zip file has a flag to say if the filename and comment are encoded with UTF-8.
    * If it's not set, PizZip has no way to know the encoding used. It usually is the default encoding of the operating system.
    * The function takes the bytes array (Uint8Array or Array) and returns the decoded string.
    */
  var decodeFileName: js.UndefOr[js.Function1[/* bytes */ Uint8Array | js.Array[Double], String]] = js.native
  /**
    * set to true if (and only if) the input is a string and has already been prepared with a 0xFF mask.
    *
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
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
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    @scala.inline
    def setCheckCRC32(value: Boolean): Self = this.set("checkCRC32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckCRC32: Self = this.set("checkCRC32", js.undefined)
    @scala.inline
    def setCreateFolders(value: Boolean): Self = this.set("createFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateFolders: Self = this.set("createFolders", js.undefined)
    @scala.inline
    def setDecodeFileName(value: /* bytes */ Uint8Array | js.Array[Double] => String): Self = this.set("decodeFileName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecodeFileName: Self = this.set("decodeFileName", js.undefined)
    @scala.inline
    def setOptimizedBinaryString(value: Boolean): Self = this.set("optimizedBinaryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizedBinaryString: Self = this.set("optimizedBinaryString", js.undefined)
  }
  
}

