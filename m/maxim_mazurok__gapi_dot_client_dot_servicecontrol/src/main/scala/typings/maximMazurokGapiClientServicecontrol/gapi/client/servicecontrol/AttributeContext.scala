package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeContext extends StObject {
  
  /** Represents an API operation that is involved to a network activity. */
  var api: js.UndefOr[Api] = js.native
  
  /** The destination of a network activity, such as accepting a TCP connection. In a multi hop network activity, the destination represents the receiver of the last hop. */
  var destination: js.UndefOr[Peer] = js.native
  
  /** Supports extensions for advanced use cases, such as logs and metrics. */
  var extensions: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.AttributeContext with TopLevel[js.Any]
    ]
  ] = js.native
  
  /**
    * The origin of a network activity. In a multi hop network activity, the origin represents the sender of the first hop. For the first hop, the `source` and the `origin` must have the
    * same content.
    */
  var origin: js.UndefOr[Peer] = js.native
  
  /** Represents a network request, such as an HTTP request. */
  var request: js.UndefOr[Request] = js.native
  
  /** Represents a target resource that is involved with a network activity. If multiple resources are involved with an activity, this must be the primary one. */
  var resource: js.UndefOr[Resource] = js.native
  
  /** Represents a network response, such as an HTTP response. */
  var response: js.UndefOr[Response] = js.native
  
  /** The source of a network activity, such as starting a TCP connection. In a multi hop network activity, the source represents the sender of the last hop. */
  var source: js.UndefOr[Peer] = js.native
}
object AttributeContext {
  
  @scala.inline
  def apply(): AttributeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeContext]
  }
  
  @scala.inline
  implicit class AttributeContextMutableBuilder[Self <: AttributeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setDestination(value: Peer): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setExtensions(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.AttributeContext with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.AttributeContext with TopLevel[js.Any])*
    ): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: Peer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSource(value: Peer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
