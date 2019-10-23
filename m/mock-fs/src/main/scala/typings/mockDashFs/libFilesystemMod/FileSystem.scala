package typings.mockDashFs.libFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * Get a file system item.
    *
    * @param filepath Path to item.
    * @return The item (or null if not found).
    */
  def getItem(filepath: String): typings.mockDashFs.libItemMod.^
  /** Get the root directory. */
  def getRoot(): typings.mockDashFs.libDirectoryMod.^
}

object FileSystem {
  @scala.inline
  def apply(
    getItem: String => typings.mockDashFs.libItemMod.^,
    getRoot: () => typings.mockDashFs.libDirectoryMod.^
  ): FileSystem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
  
    __obj.asInstanceOf[FileSystem]
  }
}

