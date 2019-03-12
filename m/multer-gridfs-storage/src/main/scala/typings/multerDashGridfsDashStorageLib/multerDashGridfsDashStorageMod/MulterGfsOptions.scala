package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulterGfsOptions extends js.Object {
  var file: js.UndefOr[
    js.Function2[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File, 
      _
    ]
  ] = js.undefined
}

object MulterGfsOptions {
  @scala.inline
  def apply(
    file: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File) => _ = null
  ): MulterGfsOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[MulterGfsOptions]
  }
}

