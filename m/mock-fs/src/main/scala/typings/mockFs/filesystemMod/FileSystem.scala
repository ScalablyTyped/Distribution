package typings.mockFs.filesystemMod

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
  def getItem(filepath: String): typings.mockFs.itemMod.^
  /** Get the root directory. */
  def getRoot(): typings.mockFs.directoryMod.^
}

object FileSystem {
  @scala.inline
  def apply(getItem: String => typings.mockFs.itemMod.^, getRoot: () => typings.mockFs.directoryMod.^): FileSystem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[FileSystem]
  }
}

