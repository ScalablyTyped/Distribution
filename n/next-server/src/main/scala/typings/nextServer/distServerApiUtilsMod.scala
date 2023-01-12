package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.distLibUtilsMod.NextApiRequest
import typings.nextServer.distLibUtilsMod.NextApiResponse
import typings.nextServer.distServerRouterMod.Params
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerApiUtilsMod {
  
  @JSImport("next-server/dist/server/api-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-server/dist/server/api-utils", "ApiError")
  @js.native
  open class ApiError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  inline def apiResolver(req: NextApiRequest, res: NextApiResponse[Any], params: Any, resolverModule: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], params.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getCookieParser(req: IncomingMessage): js.Function0[NextApiRequestCookies] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookieParser")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestCookies]]
  
  inline def getQueryParser(param0: IncomingMessage): js.Function0[NextApiRequestQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParser")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestQuery]]
  
  inline def parseBody(req: NextApiRequest, limit: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def parseBody(req: NextApiRequest, limit: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def sendData(res: NextApiResponse[Any], body: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendData")(res.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendError(res: NextApiResponse[Any], statusCode: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendJson(res: NextApiResponse[Any], jsonBody: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendJson")(res.asInstanceOf[js.Any], jsonBody.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendStatusCode(res: NextApiResponse[Any], statusCode: Double): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendStatusCode")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  
  inline def setLazyProp[T](param0: LazyProps, prop: String, getter: js.Function0[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLazyProp")(param0.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LazyProps extends StObject {
    
    var params: js.UndefOr[Params | Boolean] = js.undefined
    
    var req: NextApiRequest
  }
  object LazyProps {
    
    inline def apply(req: NextApiRequest): LazyProps = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LazyProps] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Params | Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type NextApiRequestCookies = StringDictionary[String]
  
  type NextApiRequestQuery = StringDictionary[String | js.Array[String]]
}
