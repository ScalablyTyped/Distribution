package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2Tree extends StObject {
  
  /**
    * All the child directories: the directories referred to by the root and, recursively, all its children. In order to reconstruct the directory tree, the client must take the digests
    * of each of the child directories and then build up a tree starting from the `root`.
    */
  var children: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Directory]] = js.native
  
  /** The root directory in the tree. */
  var root: js.UndefOr[BuildBazelRemoteExecutionV2Directory] = js.native
}
object BuildBazelRemoteExecutionV2Tree {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Tree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Tree]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2TreeMutableBuilder[Self <: BuildBazelRemoteExecutionV2Tree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[BuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: BuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: BuildBazelRemoteExecutionV2Directory): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
