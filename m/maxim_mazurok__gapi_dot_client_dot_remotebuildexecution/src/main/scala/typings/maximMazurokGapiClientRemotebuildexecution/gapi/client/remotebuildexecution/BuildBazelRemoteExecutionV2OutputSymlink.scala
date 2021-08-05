package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2OutputSymlink extends StObject {
  
  /** The supported node properties of the OutputSymlink, if requested by the Action. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.undefined
  
  /**
    * The full path of the symlink relative to the working directory, including the filename. The path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin
    * with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The target path of the symlink. The path separator is a forward slash `/`. The target path can be relative to the parent directory of the symlink or it can be an absolute path
    * starting with `/`. Support for absolute paths can be checked using the Capabilities API. The canonical form forbids the substrings `/./` and `//` in the target path. `..` components
    * are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2OutputSymlink {
  
  inline def apply(): BuildBazelRemoteExecutionV2OutputSymlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2OutputSymlink]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2OutputSymlink](x: Self) {
    
    inline def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "nodeProperties", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
