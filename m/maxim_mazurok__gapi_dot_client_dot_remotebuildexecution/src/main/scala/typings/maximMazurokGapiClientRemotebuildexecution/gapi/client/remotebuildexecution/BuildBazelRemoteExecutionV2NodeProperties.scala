package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2NodeProperties extends StObject {
  
  /** The file's last modification timestamp. */
  var mtime: js.UndefOr[String] = js.undefined
  
  /** A list of string-based NodeProperties. */
  var properties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.undefined
  
  /** The UNIX file mode, e.g., 0755. */
  var unixMode: js.UndefOr[Double] = js.undefined
}
object BuildBazelRemoteExecutionV2NodeProperties {
  
  inline def apply(): BuildBazelRemoteExecutionV2NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2NodeProperties]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2NodeProperties](x: Self) {
    
    inline def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setUnixMode(value: Double): Self = StObject.set(x, "unixMode", value.asInstanceOf[js.Any])
    
    inline def setUnixModeUndefined: Self = StObject.set(x, "unixMode", js.undefined)
  }
}
