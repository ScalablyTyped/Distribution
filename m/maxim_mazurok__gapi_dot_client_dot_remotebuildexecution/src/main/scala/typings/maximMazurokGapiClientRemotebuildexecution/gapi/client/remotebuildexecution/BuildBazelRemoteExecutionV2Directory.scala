package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Directory extends StObject {
  
  /** The subdirectories in the directory. */
  var directories: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2DirectoryNode]] = js.undefined
  
  /** The files in the directory. */
  var files: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2FileNode]] = js.undefined
  
  var nodeProperties: js.UndefOr[BuildBazelRemoteExecutionV2NodeProperties] = js.undefined
  
  /** The symlinks in the directory. */
  var symlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2SymlinkNode]] = js.undefined
}
object BuildBazelRemoteExecutionV2Directory {
  
  inline def apply(): BuildBazelRemoteExecutionV2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Directory]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2Directory](x: Self) {
    
    inline def setDirectories(value: js.Array[BuildBazelRemoteExecutionV2DirectoryNode]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: BuildBazelRemoteExecutionV2DirectoryNode*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setFiles(value: js.Array[BuildBazelRemoteExecutionV2FileNode]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: BuildBazelRemoteExecutionV2FileNode*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNodeProperties(value: BuildBazelRemoteExecutionV2NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setSymlinks(value: js.Array[BuildBazelRemoteExecutionV2SymlinkNode]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setSymlinksVarargs(value: BuildBazelRemoteExecutionV2SymlinkNode*): Self = StObject.set(x, "symlinks", js.Array(value*))
  }
}
