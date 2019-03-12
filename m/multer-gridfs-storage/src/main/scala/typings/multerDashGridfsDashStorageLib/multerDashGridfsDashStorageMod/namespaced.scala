package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
class namespaced protected () extends MulterGridfsStorage {
  def this(configuration: multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs.DbStorageOptions) = this()
  def this(configuration: multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs.UrlStorageOptions) = this()
  /* CompleteClass */
  override def _handleFile(
    req: expressLib.expressMod.eNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[stdLib.Partial[multerLib.multerMod.Global.ExpressNs.MulterNs.File]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def _removeFile(
    req: expressLib.expressMod.eNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var cache: multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Cache = js.native
}

