package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Err
import typings.next.libUtilsMod.NextApiRequest
import typings.next.libUtilsMod.NextApiResponse
import typings.next.nextBooleans.`false`
import typings.next.serverRouterMod.Params
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiUtilsMod {
  
  @JSImport("next/dist/next-server/server/api-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "ApiError")
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
  
  @JSImport("next/dist/next-server/server/api-utils", "SYMBOL_PREVIEW_DATA")
  @js.native
  val SYMBOL_PREVIEW_DATA: js.Symbol = js.native
  
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean,
    onError: js.Function1[/* hasErr */ Err, js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getCookieParser(req: IncomingMessage): js.Function0[NextApiRequestCookies] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookieParser")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestCookies]]
  
  inline def parseBody(req: NextApiRequest, limit: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def parseBody(req: NextApiRequest, limit: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def redirect(res: NextApiResponse[js.Any], statusOrUrl: String): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  inline def redirect(res: NextApiResponse[js.Any], statusOrUrl: String, url: String): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  inline def redirect(res: NextApiResponse[js.Any], statusOrUrl: Double): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  inline def redirect(res: NextApiResponse[js.Any], statusOrUrl: Double, url: String): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  
  inline def sendData(req: NextApiRequest, res: NextApiResponse[js.Any], body: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendError(res: NextApiResponse[js.Any], statusCode: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendJson(res: NextApiResponse[js.Any], jsonBody: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendJson")(res.asInstanceOf[js.Any], jsonBody.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendStatusCode(res: NextApiResponse[js.Any], statusCode: Double): NextApiResponse[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendStatusCode")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[js.Any]]
  
  inline def setLazyProp[T](hasReqParams: LazyProps, prop: String, getter: js.Function0[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLazyProp")(hasReqParams.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tryGetPreviewData(req: IncomingMessage, res: ServerResponse, options: ApiPreviewProps): js.Object | String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetPreviewData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object | String | `false`]
  
  trait ApiPreviewProps extends StObject {
    
    var previewModeEncryptionKey: String
    
    var previewModeId: String
    
    var previewModeSigningKey: String
  }
  object ApiPreviewProps {
    
    inline def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiPreviewProps = {
      val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiPreviewProps]
    }
    
    extension [Self <: ApiPreviewProps](x: Self) {
      
      inline def setPreviewModeEncryptionKey(value: String): Self = StObject.set(x, "previewModeEncryptionKey", value.asInstanceOf[js.Any])
      
      inline def setPreviewModeId(value: String): Self = StObject.set(x, "previewModeId", value.asInstanceOf[js.Any])
      
      inline def setPreviewModeSigningKey(value: String): Self = StObject.set(x, "previewModeSigningKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait LazyProps extends StObject {
    
    var params: js.UndefOr[Params | Boolean] = js.undefined
    
    var req: NextApiRequest
  }
  object LazyProps {
    
    inline def apply(req: NextApiRequest): LazyProps = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyProps]
    }
    
    extension [Self <: LazyProps](x: Self) {
      
      inline def setParams(value: Params | Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type NextApiRequestCookies = StringDictionary[String]
  
  type NextApiRequestQuery = StringDictionary[String | js.Array[String]]
}
