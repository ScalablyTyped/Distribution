package typings.mockFs.filesystemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryOptions extends js.Object {
  
  /**
    * The last directory access time. Defaults to `new Date()`.
    */
  var atime: js.UndefOr[Date] = js.native
  
  /**
    * The time of directory creation. Defaults to `new Date()`.
    */
  var birthtime: js.UndefOr[Date] = js.native
  
  /**
    * The last directory change time. Defaults to `new Date()`. Updated
    * when owner or permissions change.
    */
  var ctime: js.UndefOr[Date] = js.native
  
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.native
  
  /**
    * Directory contents. Members will generate additional files,
    * directories, or symlinks.
    */
  var items: js.UndefOr[DirectoryItems] = js.native
  
  /** Directory mode (permission and sticky bits). Defaults to `0777`. */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * The last directory modification time. Defaults to `new Date()`.
    * Updated when an item is added, removed, or renamed.
    */
  var mtime: js.UndefOr[Date] = js.native
  
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.native
}
object DirectoryOptions {
  
  @scala.inline
  def apply(): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptions]
  }
  
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
    
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
    def setAtime(value: Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    
    @scala.inline
    def setBirthtime(value: Date): Self = this.set("birthtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthtime: Self = this.set("birthtime", js.undefined)
    
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtime: Self = this.set("ctime", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setItems(value: DirectoryItems): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
