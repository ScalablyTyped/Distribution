package typings.oJs

import typings.oJs.anon.PartialOdataConfig
import typings.oJs.odataConfigMod.OdataConfig
import typings.oJs.odataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("o.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("o.js", "OBatch")
  @js.native
  open class OBatch protected ()
    extends typings.oJs.obatchMod.OBatch {
    def this(resources: js.Array[typings.oJs.orequestMod.ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[typings.oJs.orequestMod.ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[typings.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: Unit,
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typings.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("o.js", "OHandler")
  @js.native
  open class OHandler protected ()
    extends typings.oJs.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("o.js", "ORequest")
  @js.native
  open class ORequest protected ()
    extends typings.oJs.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  inline def o(rootUrl: String): typings.oJs.ohandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.oJs.ohandlerMod.OHandler]
  inline def o(rootUrl: String, config: PartialOdataConfig): typings.oJs.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.oJs.ohandlerMod.OHandler]
  inline def o(rootUrl: URL): typings.oJs.ohandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typings.oJs.ohandlerMod.OHandler]
  inline def o(rootUrl: URL, config: PartialOdataConfig): typings.oJs.ohandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.oJs.ohandlerMod.OHandler]
}
