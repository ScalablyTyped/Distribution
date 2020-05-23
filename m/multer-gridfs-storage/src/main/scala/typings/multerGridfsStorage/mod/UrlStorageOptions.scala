package typings.multerGridfsStorage.mod

import typings.multerGridfsStorage.mod.global.Express.Multer.File
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlStorageOptions extends MulterGfsOptions {
  var cache: js.UndefOr[Boolean | String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object UrlStorageOptions {
  @scala.inline
  def apply(
    url: String,
    cache: Boolean | String = null,
    file: (/* req */ Request, /* file */ File) => _ = null,
    options: js.Any = null
  ): UrlStorageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlStorageOptions]
  }
}

