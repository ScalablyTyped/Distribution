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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiUtilsMod {
  
  @JSImport("next/dist/next-server/server/api-utils", "ApiError")
  @js.native
  class ApiError protected () extends Error {
    def this(statusCode: Double, message: String) = this()
    
    val statusCode: Double = js.native
  }
  
  @JSImport("next/dist/next-server/server/api-utils", "SYMBOL_PREVIEW_DATA")
  @js.native
  val SYMBOL_PREVIEW_DATA: js.Symbol = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "apiResolver")
  @js.native
  def apiResolver(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean
  ): js.Promise[Unit] = js.native
  @JSImport("next/dist/next-server/server/api-utils", "apiResolver")
  @js.native
  def apiResolver(
    req: IncomingMessage,
    res: ServerResponse,
    query: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    propagateError: Boolean,
    onError: js.Function1[/* hasErr */ Err, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "getCookieParser")
  @js.native
  def getCookieParser(req: IncomingMessage): js.Function0[NextApiRequestCookies] = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "parseBody")
  @js.native
  def parseBody(req: NextApiRequest, limit: String): js.Promise[_] = js.native
  @JSImport("next/dist/next-server/server/api-utils", "parseBody")
  @js.native
  def parseBody(req: NextApiRequest, limit: Double): js.Promise[_] = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "redirect")
  @js.native
  def redirect(res: NextApiResponse[_], statusOrUrl: String): NextApiResponse[_] = js.native
  @JSImport("next/dist/next-server/server/api-utils", "redirect")
  @js.native
  def redirect(res: NextApiResponse[_], statusOrUrl: String, url: String): NextApiResponse[_] = js.native
  @JSImport("next/dist/next-server/server/api-utils", "redirect")
  @js.native
  def redirect(res: NextApiResponse[_], statusOrUrl: Double): NextApiResponse[_] = js.native
  @JSImport("next/dist/next-server/server/api-utils", "redirect")
  @js.native
  def redirect(res: NextApiResponse[_], statusOrUrl: Double, url: String): NextApiResponse[_] = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "sendData")
  @js.native
  def sendData(req: NextApiRequest, res: NextApiResponse[_], body: js.Any): Unit = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "sendError")
  @js.native
  def sendError(res: NextApiResponse[_], statusCode: Double, message: String): Unit = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "sendJson")
  @js.native
  def sendJson(res: NextApiResponse[_], jsonBody: js.Any): Unit = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "sendStatusCode")
  @js.native
  def sendStatusCode(res: NextApiResponse[_], statusCode: Double): NextApiResponse[_] = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "setLazyProp")
  @js.native
  def setLazyProp[T](hasReqParams: LazyProps, prop: String, getter: js.Function0[T]): Unit = js.native
  
  @JSImport("next/dist/next-server/server/api-utils", "tryGetPreviewData")
  @js.native
  def tryGetPreviewData(req: IncomingMessage, res: ServerResponse, options: ApiPreviewProps): js.Object | String | `false` = js.native
  
  @js.native
  trait ApiPreviewProps extends StObject {
    
    var previewModeEncryptionKey: String = js.native
    
    var previewModeId: String = js.native
    
    var previewModeSigningKey: String = js.native
  }
  object ApiPreviewProps {
    
    @scala.inline
    def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiPreviewProps = {
      val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiPreviewProps]
    }
    
    @scala.inline
    implicit class ApiPreviewPropsMutableBuilder[Self <: ApiPreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviewModeEncryptionKey(value: String): Self = StObject.set(x, "previewModeEncryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewModeId(value: String): Self = StObject.set(x, "previewModeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewModeSigningKey(value: String): Self = StObject.set(x, "previewModeSigningKey", value.asInstanceOf[js.Any])
    }
  }
  
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
