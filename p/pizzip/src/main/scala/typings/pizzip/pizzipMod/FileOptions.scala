package typings.pizzip.pizzipMod

import typings.pizzip.Anon_1
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  /**
    * set to `true` if the data is base64 encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option.
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.undefined
  /**
    * set to `true` if the data should be treated as raw content, `false` if this is a text. If base64 is used, this defaults to `true`,
    * if the data is not a string, this will be set to `true`.
    * @default false
    */
  var binary: js.UndefOr[Boolean] = js.undefined
  /**
    * The comment for this file.
    * the zip format has no flag or field to give the encoding of this field and PizZip will use UTF-8.
    * With non ASCII characters you might get encoding issues if the file archiver doesn't use UTF-8 to decode the comment.
    * If not set, PizZip will use the field comment on its options.
    * @default null
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  /**
    * If set, specifies compression method to use for this specific file. If not, the default file compression will be used (no compression)
    * @default "STORE"
    */
  var compression: js.UndefOr[Compression] = js.undefined
  /**
    * With `STORE` (no compression), this parameter is ignored.
    * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}` (or any level between 1 (best speed) and 9 (best compression)).
    */
  var compressionOptions: js.UndefOr[Anon_1 | Null] = js.undefined
  /**
    * Set to true if folders in the file path should be automatically created,
    * otherwise there will only be virtual folders that represent the path to the file.
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.undefined
  /**
    * the last modification date. defaults to the current date
    */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * Set to true if this is a directory and content should be ignored.
    * If true or if a permission says it's a folder, this entry be flagged as a folder and the content will be ignored.
    * @default false
    */
  var dir: js.UndefOr[Boolean] = js.undefined
  /**
    * The DOS  permissions of the file, if any.
    * @default null
    */
  var dosPermissions: js.UndefOr[Double | Null] = js.undefined
  /**
    * Set to true if (and only if) the input is a "binary string" and has already been prepared with a 0xFF mask.
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc.
    * On nodejs you can use the `mode` attribute of nodejs' fs.Stats.
    * @default null
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    binary: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    compression: Compression = null,
    compressionOptions: Anon_1 = null,
    createFolders: js.UndefOr[Boolean] = js.undefined,
    date: Date = null,
    dir: js.UndefOr[Boolean] = js.undefined,
    dosPermissions: Int | Double = null,
    optimizedBinaryString: js.UndefOr[Boolean] = js.undefined,
    unixPermissions: Double | String = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions)
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir)
    if (dosPermissions != null) __obj.updateDynamic("dosPermissions")(dosPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString)
    if (unixPermissions != null) __obj.updateDynamic("unixPermissions")(unixPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

