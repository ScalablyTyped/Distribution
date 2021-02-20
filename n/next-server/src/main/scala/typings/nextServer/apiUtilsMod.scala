package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.libUtilsMod.NextApiRequest
import typings.nextServer.libUtilsMod.NextApiResponse
import typings.nextServer.serverRouterMod.Params
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiUtilsMod {
  
  @JSImport("next-server/dist/server/api-utils", "ApiError")
  @js.native
  class ApiError protected () extends Error {
    def this(statusCode: Double, message: String) = this()
    
    val statusCode: Double = js.native
  }
  
  @JSImport("next-server/dist/server/api-utils", "apiResolver")
  @js.native
  def apiResolver(req: NextApiRequest, res: NextApiResponse[_], params: js.Any, resolverModule: js.Any): js.Promise[Unit] = js.native
  
  @JSImport("next-server/dist/server/api-utils", "getCookieParser")
  @js.native
  def getCookieParser(req: IncomingMessage): js.Function0[NextApiRequestCookies] = js.native
  
  @JSImport("next-server/dist/server/api-utils", "getQueryParser")
  @js.native
  def getQueryParser(hasUrl: IncomingMessage): js.Function0[NextApiRequestQuery] = js.native
  
  @JSImport("next-server/dist/server/api-utils", "parseBody")
  @js.native
  def parseBody(req: NextApiRequest, limit: String): js.Promise[_] = js.native
  @JSImport("next-server/dist/server/api-utils", "parseBody")
  @js.native
  def parseBody(req: NextApiRequest, limit: Double): js.Promise[_] = js.native
  
  @JSImport("next-server/dist/server/api-utils", "sendData")
  @js.native
  def sendData(res: NextApiResponse[_], body: js.Any): Unit = js.native
  
  @JSImport("next-server/dist/server/api-utils", "sendError")
  @js.native
  def sendError(res: NextApiResponse[_], statusCode: Double, message: String): Unit = js.native
  
  @JSImport("next-server/dist/server/api-utils", "sendJson")
  @js.native
  def sendJson(res: NextApiResponse[_], jsonBody: js.Any): Unit = js.native
  
  @JSImport("next-server/dist/server/api-utils", "sendStatusCode")
  @js.native
  def sendStatusCode(res: NextApiResponse[_], statusCode: Double): NextApiResponse[_] = js.native
  
  @JSImport("next-server/dist/server/api-utils", "setLazyProp")
  @js.native
  def setLazyProp[T](hasReqParams: LazyProps, prop: String, getter: js.Function0[T]): Unit = js.native
  
  @js.native
  trait LazyProps extends StObject {
    
    var params: js.UndefOr[Params | Boolean] = js.native
    
    var req: NextApiRequest = js.native
  }
  object LazyProps {
    
    @scala.inline
    def apply(req: NextApiRequest): LazyProps = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyProps]
    }
    
    @scala.inline
    implicit class LazyPropsMutableBuilder[Self <: LazyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: Params | Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type NextApiRequestCookies = StringDictionary[String]
  
  type NextApiRequestQuery = StringDictionary[String | js.Array[String]]
}
