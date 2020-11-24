package typings.oJs

import typings.oJs.odataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("o.js/dist/types/ORequest", JSImport.Namespace)
@js.native
object orequestMod extends js.Object {
  
  @js.native
  class ORequest protected () extends js.Object {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
    
    def applyQuery(): Unit = js.native
    def applyQuery(query: OdataQuery): Unit = js.native
    
    var config: RequestInit = js.native
    
    def fetch: js.Promise[Response] = js.native
    
    var url: URL = js.native
  }
}
