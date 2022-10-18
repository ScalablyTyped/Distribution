package typings.odata

import typings.odata.distTypesOdataConfigMod.OdataConfig
import typings.odata.distTypesOdataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesODotnodeMod {
  
  @JSImport("odata/dist/types/o.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("odata/dist/types/o.node", "OBatch")
  @js.native
  open class OBatch protected ()
    extends typings.odata.distTypesObatchMod.OBatch {
    def this(resources: js.Array[typings.odata.distTypesOrequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typings.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typings.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: Unit,
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typings.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("odata/dist/types/o.node", "OHandler")
  @js.native
  open class OHandler protected ()
    extends typings.odata.distTypesOhandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("odata/dist/types/o.node", "ORequest")
  @js.native
  open class ORequest protected ()
    extends typings.odata.distTypesOrequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  inline def o(rootUrl: String): typings.odata.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: String, config: Any): typings.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: String, config: OdataConfig): typings.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL): typings.odata.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL, config: Any): typings.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL, config: OdataConfig): typings.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.odata.distTypesOhandlerMod.OHandler]
}
