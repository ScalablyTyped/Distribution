package typings.next

import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.typesMod.PreviewData
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerApiUtilsNodeMod {
  
  @JSImport("next/dist/server/api-utils/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    query: Any,
    resolverModule: Any,
    apiContext: ApiContext,
    propagateError: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    query: Any,
    resolverModule: Any,
    apiContext: ApiContext,
    propagateError: Boolean,
    dev: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    query: Any,
    resolverModule: Any,
    apiContext: ApiContext,
    propagateError: Boolean,
    dev: Boolean,
    page: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apiResolver(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    query: Any,
    resolverModule: Any,
    apiContext: ApiContext,
    propagateError: Boolean,
    dev: Unit,
    page: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("apiResolver")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolverModule.asInstanceOf[js.Any], apiContext.asInstanceOf[js.Any], propagateError.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def parseBody(req: IncomingMessage, limit: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def parseBody(req: IncomingMessage, limit: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBody")(req.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def tryGetPreviewData(req: BaseNextRequest[Any], res: BaseNextResponse[Any], options: ApiPreviewProps): PreviewData = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetPreviewData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreviewData]
  inline def tryGetPreviewData(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], options: ApiPreviewProps): PreviewData = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetPreviewData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreviewData]
  inline def tryGetPreviewData(req: IncomingMessage, res: BaseNextResponse[Any], options: ApiPreviewProps): PreviewData = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetPreviewData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreviewData]
  inline def tryGetPreviewData(req: IncomingMessage, res: ServerResponse[IncomingMessage], options: ApiPreviewProps): PreviewData = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetPreviewData")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreviewData]
  
  trait ApiContext
    extends StObject
       with ApiPreviewProps {
    
    var revalidate: js.UndefOr[
        js.Function2[
          /* _req */ IncomingMessage, 
          /* _res */ ServerResponse[IncomingMessage], 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    var trustHostHeader: js.UndefOr[Boolean] = js.undefined
  }
  object ApiContext {
    
    inline def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiContext = {
      val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiContext]
    }
    
    extension [Self <: ApiContext](x: Self) {
      
      inline def setRevalidate(value: (/* _req */ IncomingMessage, /* _res */ ServerResponse[IncomingMessage]) => js.Promise[Any]): Self = StObject.set(x, "revalidate", js.Any.fromFunction2(value))
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
      
      inline def setTrustHostHeader(value: Boolean): Self = StObject.set(x, "trustHostHeader", value.asInstanceOf[js.Any])
      
      inline def setTrustHostHeaderUndefined: Self = StObject.set(x, "trustHostHeader", js.undefined)
    }
  }
}
