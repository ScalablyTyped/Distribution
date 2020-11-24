package typings.microsoftLiveConnect.anon

import typings.microsoftLiveConnect.Microsoft.Live.IFile
import typings.microsoftLiveConnect.Microsoft.Live.IFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files extends js.Object {
  
  /**
    * Information on files choden in the picker.
    */
  var files: js.UndefOr[js.Array[IFile]] = js.native
  
  /**
    * Information on folders chosen in the picker.
    */
  var folders: js.UndefOr[js.Array[IFolder]] = js.native
}
object Files {
  
  @scala.inline
  def apply(): Files = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: IFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[IFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: IFolder*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[IFolder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
  }
}
