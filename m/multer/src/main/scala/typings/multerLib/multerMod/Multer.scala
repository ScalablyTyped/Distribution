package typings
package multerLib.multerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multer extends js.Object {
  def apply(): multerLib.multerMod.multerNs.Instance = js.native
  def apply(options: multerLib.multerMod.multerNs.Options): multerLib.multerMod.multerNs.Instance = js.native
  /* The disk storage engine gives you full control on storing files to disk. */
  def diskStorage(options: multerLib.multerMod.multerNs.DiskStorageOptions): multerLib.multerMod.multerNs.StorageEngine = js.native
  /* The memory storage engine stores the files in memory as Buffer objects. */
  def memoryStorage(): multerLib.multerMod.multerNs.StorageEngine = js.native
}

