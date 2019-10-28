package typings.oDotJs

import typings.oDotJs.distTypesOdataConfigMod.OdataConfig
import typings.oDotJs.distTypesOdataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js", JSImport.Namespace)
@js.native
object oDotJsMod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typings.oDotJs.distTypesOBatchMod.OBatch {
    def this(resources: js.Array[typings.oDotJs.distTypesORequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typings.oDotJs.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typings.oDotJs.distTypesORequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typings.oDotJs.distTypesOHandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typings.oDotJs.distTypesORequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: js.Any): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: OdataConfig): typings.oDotJs.distTypesOHandlerMod.OHandler = js.native
}

