package typings.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends js.Object {
  
  /**
    * Get a file system item.
    *
    * @param filepath Path to item.
    * @return The item (or null if not found).
    */
  def getItem(filepath: String): typings.mockFs.itemMod.^ = js.native
  
  /** Get the root directory. */
  def getRoot(): typings.mockFs.directoryMod.^ = js.native
}
object FileSystem {
  
  @scala.inline
  def apply(getItem: String => typings.mockFs.itemMod.^, getRoot: () => typings.mockFs.directoryMod.^): FileSystem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[FileSystem]
  }
  
  @scala.inline
  implicit class FileSystemOps[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetItem(value: String => typings.mockFs.itemMod.^): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRoot(value: () => typings.mockFs.directoryMod.^): Self = this.set("getRoot", js.Any.fromFunction0(value))
  }
}
