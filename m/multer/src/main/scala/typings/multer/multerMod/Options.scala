package typings.multer.multerMod

import typings.multer.Anon_FieldNameSize
import typings.multer.multerMod._Global_.Express.Multer.File
import typings.multer.multerMod._Global_.Express.Request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[Anon_FieldNameSize] = js.undefined
  /** Keep the full path of files instead of just the base name (Default: false) */
  var preservePath: js.UndefOr[Boolean] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dest: String = null,
    fileFilter: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit]) => Unit = null,
    limits: Anon_FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined,
    storage: StorageEngine = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3(fileFilter))
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[Options]
  }
}

