package typings.pizzip.anon

import typings.node.Buffer
import typings.node.NodeJS.Platform
import typings.pizzip.mod.Compression
import typings.pizzip.pizzipStrings.DOS
import typings.pizzip.pizzipStrings.UNIX
import typings.pizzip.pizzipStrings.arraybuffer
import typings.pizzip.pizzipStrings.base64
import typings.pizzip.pizzipStrings.blob
import typings.pizzip.pizzipStrings.nodebuffer
import typings.pizzip.pizzipStrings.string
import typings.pizzip.pizzipStrings.uint8array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pizzip.pizzip.GenerateOptions & {  type  :'blob'} */
trait GenerateOptionstypeblob extends js.Object {
  /**
    * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.undefined
  /**
    * The comment to use for the zip file.
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
    * @default "STORE"
    */
  var compression: js.UndefOr[Compression] = js.undefined
  /**
    * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
    * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
    * (or any level between 1 (best speed) and 9 (best compression)).
    *
    * Note : if the entry is already compressed (coming from a compressed zip file),
    * calling `generate()` with a different compression level won't update the entry.
    * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
    */
  var compressionOptions: js.UndefOr[Level | Null] = js.undefined
  /**
    * the function to encode the file name / comment.
    * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
    * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
    * The function takes a string and returns a bytes array (Uint8Array or Array).
    */
  var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
  /**
    * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
    *
    * @default "application/zip"
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
    * When using `UNIX`, the attribute `unixPermissions` of each file is used.
    * If you set the platform value on nodejs, be sure to use `process.platform`.
    * `fs.stats` returns a non executable mode for folders on windows,
    * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
    * @default "DOS"
    */
  var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
  /**
    * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
    * be sure to check if the browser supports it (you can use PizZip.support)
    *
    * `base64` : the result will be a string, the binary in a base64 form.
    *
    * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
    *
    * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
    *
    * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
    *
    * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
    *
    * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
    *
    * @default "base64"
    */
  var `type`: js.UndefOr[(base64 | string | uint8array | arraybuffer | blob | nodebuffer) with blob] = js.undefined
}

object GenerateOptionstypeblob {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    compression: Compression = null,
    compressionOptions: js.UndefOr[Null | Level] = js.undefined,
    encodeFileName: /* name */ String => Buffer = null,
    mimeType: String = null,
    platform: DOS | UNIX | Platform = null,
    `type`: (base64 | string | uint8array | arraybuffer | blob | nodebuffer) with blob = null
  ): GenerateOptionstypeblob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(compressionOptions)) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    if (encodeFileName != null) __obj.updateDynamic("encodeFileName")(js.Any.fromFunction1(encodeFileName))
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptionstypeblob]
  }
}

