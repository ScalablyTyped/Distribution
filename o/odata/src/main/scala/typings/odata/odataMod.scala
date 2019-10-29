package typings.odata

import typings.odata.distTypesOdataConfigMod.OdataConfig
import typings.odata.distTypesOdataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("odata", JSImport.Namespace)
@js.native
object odataMod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typings.odata.distTypesOBatchMod.OBatch {
    def this(resources: js.Array[typings.odata.distTypesORequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typings.odata.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typings.odata.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typings.odata.distTypesOHandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typings.odata.distTypesORequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typings.odata.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typings.odata.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typings.odata.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL): typings.odata.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: js.Any): typings.odata.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: OdataConfig): typings.odata.distTypesOHandlerMod.OHandler = js.native
}

