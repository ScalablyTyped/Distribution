package typings.pizzip.mod

import typings.pizzip.anon.Level
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  /**
    * set to `true` if the data is base64 encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option.
    * @default false
    */
  var base64: js.UndefOr[Boolean] = js.native
  /**
    * set to `true` if the data should be treated as raw content, `false` if this is a text. If base64 is used, this defaults to `true`,
    * if the data is not a string, this will be set to `true`.
    * @default false
    */
  var binary: js.UndefOr[Boolean] = js.native
  /**
    * The comment for this file.
    * the zip format has no flag or field to give the encoding of this field and PizZip will use UTF-8.
    * With non ASCII characters you might get encoding issues if the file archiver doesn't use UTF-8 to decode the comment.
    * If not set, PizZip will use the field comment on its options.
    * @default null
    */
  var comment: js.UndefOr[String | Null] = js.native
  /**
    * If set, specifies compression method to use for this specific file. If not, the default file compression will be used (no compression)
    * @default "STORE"
    */
  var compression: js.UndefOr[Compression] = js.native
  /**
    * With `STORE` (no compression), this parameter is ignored.
    * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}` (or any level between 1 (best speed) and 9 (best compression)).
    */
  var compressionOptions: js.UndefOr[Level | Null] = js.native
  /**
    * Set to true if folders in the file path should be automatically created,
    * otherwise there will only be virtual folders that represent the path to the file.
    * @default false
    */
  var createFolders: js.UndefOr[Boolean] = js.native
  /**
    * the last modification date. defaults to the current date
    */
  var date: js.UndefOr[Date] = js.native
  /**
    * Set to true if this is a directory and content should be ignored.
    * If true or if a permission says it's a folder, this entry be flagged as a folder and the content will be ignored.
    * @default false
    */
  var dir: js.UndefOr[Boolean] = js.native
  /**
    * The DOS  permissions of the file, if any.
    * @default null
    */
  var dosPermissions: js.UndefOr[Double | Null] = js.native
  /**
    * Set to true if (and only if) the input is a "binary string" and has already been prepared with a 0xFF mask.
    * @default false
    */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc.
    * On nodejs you can use the `mode` attribute of nodejs' fs.Stats.
    * @default null
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    @scala.inline
    def setCompression(value: Compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCompressionOptions(value: Level): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionOptions: Self = this.set("compressionOptions", js.undefined)
    @scala.inline
    def setCompressionOptionsNull: Self = this.set("compressionOptions", null)
    @scala.inline
    def setCreateFolders(value: Boolean): Self = this.set("createFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateFolders: Self = this.set("createFolders", js.undefined)
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDir(value: Boolean): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDosPermissions(value: Double): Self = this.set("dosPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDosPermissions: Self = this.set("dosPermissions", js.undefined)
    @scala.inline
    def setDosPermissionsNull: Self = this.set("dosPermissions", null)
    @scala.inline
    def setOptimizedBinaryString(value: Boolean): Self = this.set("optimizedBinaryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizedBinaryString: Self = this.set("optimizedBinaryString", js.undefined)
    @scala.inline
    def setUnixPermissions(value: Double | String): Self = this.set("unixPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnixPermissions: Self = this.set("unixPermissions", js.undefined)
    @scala.inline
    def setUnixPermissionsNull: Self = this.set("unixPermissions", null)
  }
  
}

