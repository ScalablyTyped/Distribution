package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.libUtilsMod.NextApiRequest
import typings.nextServer.libUtilsMod.NextApiResponse
import typings.nextServer.serverRouterMod.Params
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiUtilsMod {
  
  @JSImport("next-server/dist/server/api-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-server/dist/server/api-utils", "ApiError")
  @js.native
  class ApiError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double, message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  @scala.inline
  def apiResolver(req: NextApiRequest, res: NextApiResponse[js.Any], params: js.Any, resolverModule: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], params.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getCookieParser(req: IncomingMessage): js.Function0[NextApiRequestCookies] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookieParser")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestCookies]]
  
  @scala.inline
  def getQueryParser(hasUrl: IncomingMessage): js.Function0[NextApiRequestQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParser")(hasUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestQuery]]
  
  @scala.inline
  def parseBody(req: NextApiRequest, limit: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def parseBody(req: NextApiRequest, limit: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def sendData(res: NextApiResponse[js.Any], body: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendData")(res.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sendError(res: NextApiResponse[js.Any], statusCode: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sendJson(res: NextApiResponse[js.Any], jsonBody: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendJson")(res.asInstanceOf[js.Any], jsonBody.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sendStatusCode(res: NextApiResponse[js.Any], statusCode: Double): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendStatusCode")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  
  @scala.inline
  def setLazyProp[T](hasReqParams: LazyProps, prop: String, getter: js.Function0[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLazyProp")(hasReqParams.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LazyProps extends StObject {
    
    var params: js.UndefOr[Params | Boolean] = js.undefined
    
    var req: NextApiRequest
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
