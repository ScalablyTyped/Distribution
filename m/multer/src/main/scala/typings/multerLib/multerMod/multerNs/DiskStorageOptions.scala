package typings
package multerLib.multerMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DiskStorageOptions extends js.Object {
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    java.lang.String | (js.Function3[
      /* req */ multerLib.multerMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[
        /* error */ nodeLib.Error | scala.Null, 
        /* destination */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ])
  ] = js.undefined
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ multerLib.multerMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ nodeLib.Error | scala.Null, /* filename */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

