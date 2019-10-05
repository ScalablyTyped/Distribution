package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Global.Express.Request
import typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod.Global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulterGfsOptions extends js.Object {
  var file: js.UndefOr[js.Function2[/* req */ Request, /* file */ File, _]] = js.undefined
}

object MulterGfsOptions {
  @scala.inline
  def apply(file: (/* req */ Request, /* file */ File) => _ = null): MulterGfsOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[MulterGfsOptions]
  }
}

