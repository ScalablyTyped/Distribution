package typings.multer.mod

import typings.multer.mod._Global_.Express.Multer.File
import typings.multer.mod._Global_.Express.Request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStorageOptions extends js.Object {
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.undefined
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ Request, 
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
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
      Unit
    ]) = null,
    filename: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit]) => Unit = null
  ): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(js.Any.fromFunction3(filename))
    __obj.asInstanceOf[DiskStorageOptions]
  }
}

