package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeContext extends StObject {
  
  /** Represents an API operation that is involved to a network activity. */
  var api: js.UndefOr[Api] = js.undefined
  
  /** The destination of a network activity, such as accepting a TCP connection. In a multi hop network activity, the destination represents the receiver of the last hop. */
  var destination: js.UndefOr[Peer] = js.undefined
  
  /** Supports extensions for advanced use cases, such as logs and metrics. */
  var extensions: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
  
  /**
    * The origin of a network activity. In a multi hop network activity, the origin represents the sender of the first hop. For the first hop, the `source` and the `origin` must have the
    * same content.
    */
  var origin: js.UndefOr[Peer] = js.undefined
  
  /** Represents a network request, such as an HTTP request. */
  var request: js.UndefOr[Request] = js.undefined
  
  /** Represents a target resource that is involved with a network activity. If multiple resources are involved with an activity, this must be the primary one. */
  var resource: js.UndefOr[Resource] = js.undefined
  
  /** Represents a network response, such as an HTTP response. */
  var response: js.UndefOr[Response] = js.undefined
  
  /** The source of a network activity, such as starting a TCP connection. In a multi hop network activity, the source represents the sender of the last hop. */
  var source: js.UndefOr[Peer] = js.undefined
}
object AttributeContext {
  
  inline def apply(): AttributeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeContext]
  }
  
  extension [Self <: AttributeContext](x: Self) {
    
    inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setDestination(value: Peer): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setExtensions(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setOrigin(value: Peer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSource(value: Peer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
