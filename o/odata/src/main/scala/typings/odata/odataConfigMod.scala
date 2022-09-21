package typings.odata

import typings.odata.odataQueryMod.OdataQuery
import typings.odata.ohandlerMod.OHandler
import typings.std.Headers
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odataConfigMod {
  
  trait OdataBatchConfig extends StObject {
    
    var boundaryPrefix: js.UndefOr[String] = js.undefined
    
    var changsetBoundaryPrefix: js.UndefOr[String] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var useChangset: Boolean
    
    /**
      * When truthy, relative URL's will be used in batch elements
      */
    var useRelativeURLs: Boolean
  }
  object OdataBatchConfig {
    
    inline def apply(useChangset: Boolean, useRelativeURLs: Boolean): OdataBatchConfig = {
      val __obj = js.Dynamic.literal(useChangset = useChangset.asInstanceOf[js.Any], useRelativeURLs = useRelativeURLs.asInstanceOf[js.Any])
      __obj.asInstanceOf[OdataBatchConfig]
    }
    
    extension [Self <: OdataBatchConfig](x: Self) {
      
      inline def setBoundaryPrefix(value: String): Self = StObject.set(x, "boundaryPrefix", value.asInstanceOf[js.Any])
      
      inline def setBoundaryPrefixUndefined: Self = StObject.set(x, "boundaryPrefix", js.undefined)
      
      inline def setChangsetBoundaryPrefix(value: String): Self = StObject.set(x, "changsetBoundaryPrefix", value.asInstanceOf[js.Any])
      
      inline def setChangsetBoundaryPrefixUndefined: Self = StObject.set(x, "changsetBoundaryPrefix", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUseChangset(value: Boolean): Self = StObject.set(x, "useChangset", value.asInstanceOf[js.Any])
      
      inline def setUseRelativeURLs(value: Boolean): Self = StObject.set(x, "useRelativeURLs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OdataConfig
    extends StObject
       with RequestInit {
    
    /**
      * Batch configuration (experimental)
      */
    var batch: js.UndefOr[OdataBatchConfig] = js.native
    
    /**
      * Set to true to disable auto polyfilling
      */
    var disablePolyfill: js.UndefOr[Boolean] = js.native
    
    /**
      * The fragment to parse data from
      * Default is: value
      */
    var fragment: String = js.native
    
    /**
      * A function which is called when a request has a error
      */
    def onError(oHandler: OHandler, res: Response): Null = js.native
    
    /**
      * A function which is called when a request has finished
      */
    def onFinish(oHandler: OHandler): Null = js.native
    def onFinish(oHandler: OHandler, res: Response): Null = js.native
    
    /**
      * A function which is called on each start of a request
      */
    def onStart(oHandler: OHandler): Null = js.native
    
    /**
      * An default query
      */
    var query: js.UndefOr[URLSearchParams | OdataQuery] = js.native
    
    /**
      * The URL to request data from
      */
    var rootUrl: js.UndefOr[URL | String] = js.native
  }
}
