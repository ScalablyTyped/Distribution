package typings.multer.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.multer.mod.global.Express.Multer.File
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStorageOptions extends js.Object {
  /**
    * A string or function that determines the destination path for uploaded
    * files. If a string is passed and the directory does not exist, Multer
    * attempts to create it recursively. If neither a string or a function
    * is passed, the destination defaults to `os.tmpdir()`.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the destination path.
    */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.undefined
  /**
    * A function that determines the name of the uploaded file. If nothing
    * is passed, Multer will generate a 32 character pseudorandom hex string
    * with no extension.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the name of the uploaded file.
    */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit], 
      Unit
    ]
  ] = js.undefined
}

object DiskStorageOptions {
  @scala.inline
  def apply(
    destination: String | (js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
      Unit
    ]) = null,
    filename: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit]) => Unit = null
  ): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(js.Any.fromFunction3(filename))
    __obj.asInstanceOf[DiskStorageOptions]
  }
}

