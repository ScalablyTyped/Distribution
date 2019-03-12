package typings
package multerLib.multerMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ multerLib.multerMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ stdLib.Error | scala.Null, /* acceptFile */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[multerLib.Anon_FieldNameSize] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dest: java.lang.String = null,
    fileFilter: (/* req */ multerLib.multerMod.Global.ExpressNs.Request, /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, /* callback */ js.Function2[/* error */ stdLib.Error | scala.Null, /* acceptFile */ scala.Boolean, scala.Unit]) => scala.Unit = null,
    limits: multerLib.Anon_FieldNameSize = null,
    storage: StorageEngine = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3(fileFilter))
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[Options]
  }
}

