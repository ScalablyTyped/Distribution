package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Tree extends StObject {
  
  /**
    * All the child directories: the directories referred to by the root and, recursively, all its children. In order to reconstruct the directory tree, the client must take the digests
    * of each of the child directories and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Directory]] = js.undefined
  
  /** The root directory in the tree. */
  var root: js.UndefOr[BuildBazelRemoteExecutionV2Directory] = js.undefined
}
object BuildBazelRemoteExecutionV2Tree {
  
  inline def apply(): BuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Tree]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2Tree](x: Self) {
    
    inline def setChildren(value: js.Array[BuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: BuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setRoot(value: BuildBazelRemoteExecutionV2Directory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
