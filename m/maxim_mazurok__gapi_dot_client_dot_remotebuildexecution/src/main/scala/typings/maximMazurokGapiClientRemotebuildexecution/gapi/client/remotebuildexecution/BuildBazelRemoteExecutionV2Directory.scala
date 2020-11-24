package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2Directory extends js.Object {
  
  /** The subdirectories in the directory. */
  var directories: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2DirectoryNode]] = js.native
  
  /** The files in the directory. */
  var files: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2FileNode]] = js.native
  
  /** The node properties of the Directory. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.native
  
  /** The symlinks in the directory. */
  var symlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2SymlinkNode]] = js.native
}
object BuildBazelRemoteExecutionV2Directory {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Directory]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2DirectoryOps[Self <: BuildBazelRemoteExecutionV2Directory] (val x: Self) extends AnyVal {
    
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
    def setDirectoriesVarargs(value: BuildBazelRemoteExecutionV2DirectoryNode*): Self = this.set("directories", js.Array(value :_*))
    
    @scala.inline
    def setDirectories(value: js.Array[BuildBazelRemoteExecutionV2DirectoryNode]): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: BuildBazelRemoteExecutionV2FileNode*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[BuildBazelRemoteExecutionV2FileNode]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = this.set("nodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
    
    @scala.inline
    def setSymlinksVarargs(value: BuildBazelRemoteExecutionV2SymlinkNode*): Self = this.set("symlinks", js.Array(value :_*))
    
    @scala.inline
    def setSymlinks(value: js.Array[BuildBazelRemoteExecutionV2SymlinkNode]): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
  }
}
