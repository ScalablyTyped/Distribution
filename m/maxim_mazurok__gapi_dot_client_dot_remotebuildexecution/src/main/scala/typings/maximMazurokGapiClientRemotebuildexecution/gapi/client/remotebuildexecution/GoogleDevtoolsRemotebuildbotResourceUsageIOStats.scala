package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildbotResourceUsageIOStats extends StObject {
  
  var readBytesCount: js.UndefOr[String] = js.undefined
  
  var readCount: js.UndefOr[String] = js.undefined
  
  var readTimeMs: js.UndefOr[String] = js.undefined
  
  var writeBytesCount: js.UndefOr[String] = js.undefined
  
  var writeCount: js.UndefOr[String] = js.undefined
  
  var writeTimeMs: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildbotResourceUsageIOStats {
  
  inline def apply(): GoogleDevtoolsRemotebuildbotResourceUsageIOStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotResourceUsageIOStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemotebuildbotResourceUsageIOStats] (val x: Self) extends AnyVal {
    
    inline def setReadBytesCount(value: String): Self = StObject.set(x, "readBytesCount", value.asInstanceOf[js.Any])
    
    inline def setReadBytesCountUndefined: Self = StObject.set(x, "readBytesCount", js.undefined)
    
    inline def setReadCount(value: String): Self = StObject.set(x, "readCount", value.asInstanceOf[js.Any])
    
    inline def setReadCountUndefined: Self = StObject.set(x, "readCount", js.undefined)
    
    inline def setReadTimeMs(value: String): Self = StObject.set(x, "readTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReadTimeMsUndefined: Self = StObject.set(x, "readTimeMs", js.undefined)
    
    inline def setWriteBytesCount(value: String): Self = StObject.set(x, "writeBytesCount", value.asInstanceOf[js.Any])
    
    inline def setWriteBytesCountUndefined: Self = StObject.set(x, "writeBytesCount", js.undefined)
    
    inline def setWriteCount(value: String): Self = StObject.set(x, "writeCount", value.asInstanceOf[js.Any])
    
    inline def setWriteCountUndefined: Self = StObject.set(x, "writeCount", js.undefined)
    
    inline def setWriteTimeMs(value: String): Self = StObject.set(x, "writeTimeMs", value.asInstanceOf[js.Any])
    
    inline def setWriteTimeMsUndefined: Self = StObject.set(x, "writeTimeMs", js.undefined)
  }
}
