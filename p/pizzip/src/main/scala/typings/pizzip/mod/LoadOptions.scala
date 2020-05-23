package typings.pizzip.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /**
    * set to true if the data is base64 encoded, false for binary.
    *
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.undefined
  /**
    * set to true if the read data should be checked against its CRC32.
    *
    * @default false
    */
  var checkCRC32: js.UndefOr[Boolean] = js.undefined
  /**
    * set to true to create folders in the file path automatically. Leaving it false will result in only virtual folders
    * (i.e. folders that merely represent part of the file path) being created.
    *
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.undefined
  /**
    * the function to decode the file name / comment. Decodes from UTF-8 by default.
    * A zip file has a flag to say if the filename and comment are encoded with UTF-8.
    * If it's not set, PizZip has no way to know the encoding used. It usually is the default encoding of the operating system.
    * The function takes the bytes array (Uint8Array or Array) and returns the decoded string.
    */
  var decodeFileName: js.UndefOr[js.Function1[/* bytes */ Uint8Array | js.Array[Double], String]] = js.undefined
  /**
    * set to true if (and only if) the input is a string and has already been prepared with a 0xFF mask.
    *
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    checkCRC32: js.UndefOr[Boolean] = js.undefined,
    createFolders: js.UndefOr[Boolean] = js.undefined,
    decodeFileName: /* bytes */ Uint8Array | js.Array[Double] => String = null,
    optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCRC32)) __obj.updateDynamic("checkCRC32")(checkCRC32.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders.get.asInstanceOf[js.Any])
    if (decodeFileName != null) __obj.updateDynamic("decodeFileName")(js.Any.fromFunction1(decodeFileName))
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
}

