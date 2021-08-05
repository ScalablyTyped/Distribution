package typings.oJs

import typings.oJs.odataConfigMod.OdataConfig
import typings.oJs.odataQueryMod.OdataQuery
import typings.oJs.orequestMod.ORequest
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object obatchMod {
  
  @JSImport("o.js/dist/types/OBatch", "OBatch")
  @js.native
  class OBatch protected () extends StObject {
    def this(resources: js.Array[ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: Unit, changeset: Boolean) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery, changeset: Boolean) = this()
    
    /* private */ var batchBody: js.Any = js.native
    
    /* private */ var batchConfig: js.Any = js.native
    
    /* private */ var batchUid: js.Any = js.native
    
    /* private */ var changeset: js.Any = js.native
    
    /**
      * If we determine a changset (POST, PUT, PATCH) we initalize a new
      * OBatch instance for it.
      */
    /* private */ var checkForChangset: js.Any = js.native
    
    def fetch(url: URL): js.Promise[js.Any] = js.native
    
    /* private */ var getBody: js.Any = js.native
    
    /* private */ var getChangeResources: js.Any = js.native
    
    /* private */ var getGETResources: js.Any = js.native
    
    /* private */ var getHeaders: js.Any = js.native
    
    /* private */ var getRequestURL: js.Any = js.native
    
    /* private */ var getUid: js.Any = js.native
    
    def parseResponse(responseData: String, contentTypeHeader: String): js.Any = js.native
  }
}
