package typings.odata

import typings.odata.odataConfigMod.OdataConfig
import typings.odata.odataQueryMod.OdataQuery
import typings.odata.orequestMod.ORequest
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object obatchMod {
  
  @JSImport("odata/dist/types/OBatch", "OBatch")
  @js.native
  class OBatch protected () extends StObject {
    def this(resources: js.Array[ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[ORequest],
      config: OdataConfig,
      query: js.UndefOr[scala.Nothing],
      changeset: Boolean
    ) = this()
    def this(resources: js.Array[ORequest], config: OdataConfig, query: OdataQuery, changeset: Boolean) = this()
    
    var batchBody: js.Any = js.native
    
    var batchConfig: js.Any = js.native
    
    var batchUid: js.Any = js.native
    
    var changeset: js.Any = js.native
    
    /**
      * If we determine a changset (POST, PUT, PATCH) we initalize a new
      * OBatch instance for it.
      */
    var checkForChangset: js.Any = js.native
    
    def fetch(url: URL): js.Promise[_] = js.native
    
    var getBody: js.Any = js.native
    
    var getChangeResources: js.Any = js.native
    
    var getGETResources: js.Any = js.native
    
    var getHeaders: js.Any = js.native
    
    var getRequestURL: js.Any = js.native
    
    var getUid: js.Any = js.native
    
    def parseResponse(responseData: String, contentTypeHeader: String): js.Any = js.native
  }
}
