package typings.oJs

import typings.oJs.odataConfigMod.OdataConfig
import typings.oJs.odataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typings.oJs.obatchMod.OBatch {
    def this(resources: js.Array[typings.oJs.orequestMod.ORequest], config: OdataConfig) = this()
    def this(resources: js.Array[typings.oJs.orequestMod.ORequest], config: OdataConfig, query: OdataQuery) = this()
    def this(
      resources: js.Array[typings.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typings.oJs.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typings.oJs.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typings.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typings.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typings.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL): typings.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: js.Any): typings.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: URL, config: OdataConfig): typings.oJs.ohandlerMod.OHandler = js.native
}

