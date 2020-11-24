package typings.nodeOpenload.mod

import typings.nodeOpenload.anon.Cstatus
import typings.nodeOpenload.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFolder extends js.Object {
  
  var files: js.Array[Cstatus] = js.native
  
  var folders: js.Array[Id] = js.native
}
object ListFolder {
  
  @scala.inline
  def apply(files: js.Array[Cstatus], folders: js.Array[Id]): ListFolder = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFolder]
  }
  
  @scala.inline
  implicit class ListFolderOps[Self <: ListFolder] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: Cstatus*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[Cstatus]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersVarargs(value: Id*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[Id]): Self = this.set("folders", value.asInstanceOf[js.Any])
  }
}
