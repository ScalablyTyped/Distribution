package typings.odata

import typings.odata.odataConfigMod.OdataConfig
import typings.odata.odataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oNodeMod {
  
  @JSImport("odata/dist/types/o.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("odata/dist/types/o.node", "OBatch")
  @js.native
  class OBatch protected ()
    extends typings.odata.obatchMod.OBatch {
    def this(resources: js.Array[typings.odata.orequestMod.ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[typings.odata.orequestMod.ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[typings.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: Unit,
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typings.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("odata/dist/types/o.node", "OHandler")
  @js.native
  class OHandler protected ()
    extends typings.odata.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("odata/dist/types/o.node", "ORequest")
  @js.native
  class ORequest protected ()
    extends typings.odata.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  inline def o(rootUrl: String): typings.odata.ohandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.odata.ohandlerMod.OHandler]
  inline def o(rootUrl: String, config: js.Any): typings.odata.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.ohandlerMod.OHandler]
  inline def o(rootUrl: String, config: OdataConfig): typings.odata.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.ohandlerMod.OHandler]
  inline def o(rootUrl: URL): typings.odata.ohandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.odata.ohandlerMod.OHandler]
  inline def o(rootUrl: URL, config: js.Any): typings.odata.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.ohandlerMod.OHandler]
  inline def o(rootUrl: URL, config: OdataConfig): typings.odata.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.ohandlerMod.OHandler]
}
