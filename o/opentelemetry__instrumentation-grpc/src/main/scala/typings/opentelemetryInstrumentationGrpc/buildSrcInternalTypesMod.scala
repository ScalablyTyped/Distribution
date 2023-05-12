package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryInstrumentationGrpc.anon.CaptureRequestMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInternalTypesMod {
  
  trait metadataCaptureType extends StObject {
    
    var client: CaptureRequestMetadata
    
    var server: CaptureRequestMetadata
  }
  object metadataCaptureType {
    
    inline def apply(client: CaptureRequestMetadata, server: CaptureRequestMetadata): metadataCaptureType = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[metadataCaptureType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: metadataCaptureType] (val x: Self) extends AnyVal {
      
      inline def setClient(value: CaptureRequestMetadata): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: CaptureRequestMetadata): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
