package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.IsManualRevalidate
import typings.next.anon.Path
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distSharedLibUtilsMod.NextApiRequest
import typings.next.distSharedLibUtilsMod.NextApiResponse
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerApiUtilsMod {
  
  @JSImport("next/dist/server/api-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/api-utils", "ApiError")
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
  
  @JSImport("next/dist/server/api-utils", "COOKIE_NAME_PRERENDER_BYPASS")
  @js.native
  val COOKIE_NAME_PRERENDER_BYPASS: /* "__prerender_bypass" */ String = js.native
  
  @JSImport("next/dist/server/api-utils", "COOKIE_NAME_PRERENDER_DATA")
  @js.native
  val COOKIE_NAME_PRERENDER_DATA: /* "__next_preview_data" */ String = js.native
  
  @JSImport("next/dist/server/api-utils", "PRERENDER_REVALIDATE_HEADER")
  @js.native
  val PRERENDER_REVALIDATE_HEADER: /* "x-prerender-revalidate" */ String = js.native
  
  @JSImport("next/dist/server/api-utils", "PRERENDER_REVALIDATE_ONLY_GENERATED_HEADER")
  @js.native
  val PRERENDER_REVALIDATE_ONLY_GENERATED_HEADER: /* "x-prerender-revalidate-if-generated" */ String = js.native
  
  @JSImport("next/dist/server/api-utils", "RESPONSE_LIMIT_DEFAULT")
  @js.native
  val RESPONSE_LIMIT_DEFAULT: Double = js.native
  
  @JSImport("next/dist/server/api-utils", "SYMBOL_CLEARED_COOKIES")
  @js.native
  val SYMBOL_CLEARED_COOKIES: js.Symbol = js.native
  
  @JSImport("next/dist/server/api-utils", "SYMBOL_PREVIEW_DATA")
  @js.native
  val SYMBOL_PREVIEW_DATA: js.Symbol = js.native
  
  inline def checkIsManualRevalidate(req: BaseNextRequest[Any], previewProps: ApiPreviewProps): IsManualRevalidate = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsManualRevalidate")(req.asInstanceOf[js.Any], previewProps.asInstanceOf[js.Any])).asInstanceOf[IsManualRevalidate]
  inline def checkIsManualRevalidate(req: IncomingMessage, previewProps: ApiPreviewProps): IsManualRevalidate = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsManualRevalidate")(req.asInstanceOf[js.Any], previewProps.asInstanceOf[js.Any])).asInstanceOf[IsManualRevalidate]
  
  inline def clearPreviewData[T](res: NextApiResponse[T]): NextApiResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPreviewData")(res.asInstanceOf[js.Any]).asInstanceOf[NextApiResponse[T]]
  inline def clearPreviewData[T](res: NextApiResponse[T], options: Path): NextApiResponse[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearPreviewData")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[T]]
  
  inline def getCookieParser(headers: StringDictionary[js.UndefOr[String | js.Array[String]]]): js.Function0[NextApiRequestCookies] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookieParser")(headers.asInstanceOf[js.Any]).asInstanceOf[js.Function0[NextApiRequestCookies]]
  
  inline def redirect(res: NextApiResponse[Any], statusOrUrl: String): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  inline def redirect(res: NextApiResponse[Any], statusOrUrl: String, url: String): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  inline def redirect(res: NextApiResponse[Any], statusOrUrl: Double): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  inline def redirect(res: NextApiResponse[Any], statusOrUrl: Double, url: String): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(res.asInstanceOf[js.Any], statusOrUrl.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  
  inline def sendError(res: NextApiResponse[Any], statusCode: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendStatusCode(res: NextApiResponse[Any], statusCode: Double): NextApiResponse[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendStatusCode")(res.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[NextApiResponse[Any]]
  
  inline def setLazyProp[T](hasReq: LazyProps, prop: String, getter: js.Function0[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLazyProp")(hasReq.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], getter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    
    var req: NextApiRequest
  }
  object LazyProps {
    
    inline def apply(req: NextApiRequest): LazyProps = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyProps]
    }
    
    extension [Self <: LazyProps](x: Self) {
      
      inline def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{[key: string] : string}> */
  trait NextApiRequestCookies extends StObject
  
  /* Inlined std.Partial<{[key: string] : string | std.Array<string>}> */
  trait NextApiRequestQuery extends StObject
}
