package typings.odata

import typings.odata.distTypesOdataQueryMod.OdataQuery
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOrequestMod {
  
  @JSImport("odata/dist/types/ORequest", "ORequest")
  @js.native
  open class ORequest protected () extends StObject {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
    
    def applyQuery(): Unit = js.native
    def applyQuery(query: OdataQuery): Unit = js.native
    
    var config: RequestInit = js.native
    
    def fetch: js.Promise[Response] = js.native
    
    var url: URL = js.native
  }
}
