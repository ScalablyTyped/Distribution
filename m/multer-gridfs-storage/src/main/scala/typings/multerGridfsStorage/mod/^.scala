package typings.multerGridfsStorage.mod

import typings.multerGridfsStorage.anon.Filename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
class ^ protected () extends MulterGridfsStorage {
  def this(configuration: DbStorageOptions) = this()
  def this(configuration: UrlStorageOptions) = this()
}

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: Cache = js.native
  def generateBytes(): js.Promise[Filename] = js.native
}

