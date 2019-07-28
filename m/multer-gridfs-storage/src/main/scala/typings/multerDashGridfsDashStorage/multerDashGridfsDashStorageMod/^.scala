package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typings.express.expressMod.Request
import typings.multer.multerMod.Global.ExpressNs.MulterNs.File
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
class ^ protected () extends MulterGridfsStorage {
  def this(configuration: DbStorageOptions) = this()
  def this(configuration: UrlStorageOptions) = this()
  /* CompleteClass */
  override def _handleFile(
    req: Request,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[Partial[File]], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def _removeFile(req: Request, file: File, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: Cache = js.native
}

