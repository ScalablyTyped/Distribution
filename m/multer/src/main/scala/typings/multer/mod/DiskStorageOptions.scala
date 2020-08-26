package typings.multer.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.multer.mod.global.Express.Multer.File
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
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
  ] = js.native
}

object DiskStorageOptions {
  @scala.inline
  def apply(): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskStorageOptions]
  }
  @scala.inline
  implicit class DiskStorageOptionsOps[Self <: DiskStorageOptions] (val x: Self) extends AnyVal {
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
    def setDestinationFunction3(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit]) => Unit
    ): Self = this.set("destination", js.Any.fromFunction3(value))
    @scala.inline
    def setDestination(
      value: String | (js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
          Unit
        ])
    ): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setFilename(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit]) => Unit
    ): Self = this.set("filename", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
  
}

