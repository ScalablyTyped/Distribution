package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Directory extends StObject {
  
  /** The subdirectories in the directory. */
  var directories: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2DirectoryNode]] = js.undefined
  
  /** The files in the directory. */
  var files: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2FileNode]] = js.undefined
  
  /** The node properties of the Directory. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.undefined
  
  /** The symlinks in the directory. */
  var symlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2SymlinkNode]] = js.undefined
}
object BuildBazelRemoteExecutionV2Directory {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Directory]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2DirectoryMutableBuilder[Self <: BuildBazelRemoteExecutionV2Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: js.Array[BuildBazelRemoteExecutionV2DirectoryNode]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: BuildBazelRemoteExecutionV2DirectoryNode*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[BuildBazelRemoteExecutionV2FileNode]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: BuildBazelRemoteExecutionV2FileNode*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    @scala.inline
    def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "nodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setSymlinks(value: js.Array[BuildBazelRemoteExecutionV2SymlinkNode]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    @scala.inline
    def setSymlinksVarargs(value: BuildBazelRemoteExecutionV2SymlinkNode*): Self = StObject.set(x, "symlinks", js.Array(value :_*))
  }
}
