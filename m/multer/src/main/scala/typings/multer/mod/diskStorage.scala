package typings.multer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer", "diskStorage")
@js.native
object diskStorage extends js.Object {
  /**
    * Returns a `StorageEngine` implementation configured to store files on
    * the local file system.
    *
    * A string or function may be specified to determine the destination
    * directory, and a function to determine filenames. If no options are set,
    * files will be stored in the system's temporary directory with random 32
    * character filenames.
    */
  def apply(options: DiskStorageOptions): StorageEngine = js.native
}

