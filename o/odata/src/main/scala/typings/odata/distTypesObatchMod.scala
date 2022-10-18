package typings.odata

import typings.odata.distTypesOdataConfigMod.OdataConfig
import typings.odata.distTypesOdataQueryMod.OdataQuery
import typings.odata.distTypesOrequestMod.ORequest
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObatchMod {
  
  @JSImport("odata/dist/types/OBatch", "OBatch")
  @js.native
  open class OBatch protected () extends StObject {
    def this(resources: js.Array[ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: Unit, changeset: Boolean) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery, changeset: Boolean) = this()
    
    /* private */ var batchBody: Any = js.native
    
    /* private */ var batchConfig: Any = js.native
    
    /* private */ var batchUid: Any = js.native
    
    /* private */ var changeset: Any = js.native
    
    /**
      * If we determine a changset (POST, PUT, PATCH) we initalize a new
      * OBatch instance for it.
      */
    /* private */ var checkForChangset: Any = js.native
    
    def fetch(url: URL): js.Promise[Any] = js.native
    
    /* private */ var getBody: Any = js.native
    
    /* private */ var getChangeResources: Any = js.native
    
    /* private */ var getGETResources: Any = js.native
    
    /* private */ var getHeaders: Any = js.native
    
    /* private */ var getRequestURL: Any = js.native
    
    /* private */ var getUid: Any = js.native
    
    def parseResponse(responseData: String, contentTypeHeader: String): Any = js.native
  }
}
