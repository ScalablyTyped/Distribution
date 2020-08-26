package typings.odata

import typings.odata.odataConfigMod.OdataConfig
import typings.odata.odataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("odata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typings.odata.obatchMod.OBatch {
    def this(resources: js.Array[typings.odata.orequestMod.ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[typings.odata.orequestMod.ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[typings.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: js.UndefOr[scala.Nothing],
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typings.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typings.odata.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typings.odata.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typings.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typings.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typings.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL): typings.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: js.Any): typings.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: OdataConfig): typings.odata.ohandlerMod.OHandler = js.native
}

