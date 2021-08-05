package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2SymlinkNode extends StObject {
  
  /** The name of the symlink. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The node properties of the SymlinkNode. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.undefined
  
  /**
    * The target path of the symlink. The path separator is a forward slash `/`. The target path can be relative to the parent directory of the symlink or it can be an absolute path
    * starting with `/`. Support for absolute paths can be checked using the Capabilities API. The canonical form forbids the substrings `/./` and `//` in the target path. `..` components
    * are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2SymlinkNode {
  
  inline def apply(): BuildBazelRemoteExecutionV2SymlinkNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2SymlinkNode]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2SymlinkNode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "nodeProperties", js.Array(value :_*))
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
