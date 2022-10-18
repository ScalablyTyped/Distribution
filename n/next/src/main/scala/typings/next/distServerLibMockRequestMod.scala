package typings.next

import typings.next.anon.Req
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibMockRequestMod {
  
  @JSImport("next/dist/server/lib/mock-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mockRequest(
    requestUrl: String,
    requestHeaders: Record[String, js.UndefOr[String | js.Array[String]]],
    requestMethod: String
  ): Req = (^.asInstanceOf[js.Dynamic].applyDynamic("mockRequest")(requestUrl.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], requestMethod.asInstanceOf[js.Any])).asInstanceOf[Req]
  inline def mockRequest(
    requestUrl: String,
    requestHeaders: Record[String, js.UndefOr[String | js.Array[String]]],
    requestMethod: String,
    requestConnection: Any
  ): Req = (^.asInstanceOf[js.Dynamic].applyDynamic("mockRequest")(requestUrl.asInstanceOf[js.Any], requestHeaders.asInstanceOf[js.Any], requestMethod.asInstanceOf[js.Any], requestConnection.asInstanceOf[js.Any])).asInstanceOf[Req]
}
