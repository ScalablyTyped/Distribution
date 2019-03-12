package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlStorageOptions
  extends multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGfsOptions {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object UrlStorageOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    cache: scala.Boolean | java.lang.String = null,
    file: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File) => _ = null,
    options: js.Any = null
  ): UrlStorageOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[UrlStorageOptions]
  }
}

