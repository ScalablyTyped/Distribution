package typings.next.anon

import typings.next.distServerAppRenderMod.RenderOpts
import typings.next.distServerLoadComponentsMod.LoadComponentsReturnType
import typings.next.distServerRenderResultMod.default
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRenderToHTML extends StObject {
  
  var appRenderToHTML: js.UndefOr[
    js.Function7[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse[IncomingMessage], 
      /* pathname */ String, 
      /* query */ NextParsedUrlQuery, 
      /* renderOpts */ RenderOpts, 
      /* isPagesDir */ Boolean, 
      /* isStaticGeneration */ js.UndefOr[Boolean], 
      js.Promise[default | Null]
    ]
  ] = js.undefined
  
  var extendRenderOpts: Partial[AmpOptimizerConfig] & PickdefaultOptionsrenderO
  
  def loadComponent(pathname: String): js.Promise[LoadComponentsReturnType | Null]
  
  var page: String
  
  var pagesRenderToHTML: js.UndefOr[
    js.Function5[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse[IncomingMessage], 
      /* pathname */ String, 
      /* query */ NextParsedUrlQuery, 
      /* renderOpts */ typings.next.distServerRenderMod.RenderOpts, 
      js.Promise[default | Null]
    ]
  ] = js.undefined
}
object AppRenderToHTML {
  
  inline def apply(
    extendRenderOpts: Partial[AmpOptimizerConfig] & PickdefaultOptionsrenderO,
    loadComponent: String => js.Promise[LoadComponentsReturnType | Null],
    page: String
  ): AppRenderToHTML = {
    val __obj = js.Dynamic.literal(extendRenderOpts = extendRenderOpts.asInstanceOf[js.Any], loadComponent = js.Any.fromFunction1(loadComponent), page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppRenderToHTML]
  }
  
  extension [Self <: AppRenderToHTML](x: Self) {
    
    inline def setAppRenderToHTML(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* pathname */ String, /* query */ NextParsedUrlQuery, /* renderOpts */ RenderOpts, /* isPagesDir */ Boolean, /* isStaticGeneration */ js.UndefOr[Boolean]) => js.Promise[default | Null]
    ): Self = StObject.set(x, "appRenderToHTML", js.Any.fromFunction7(value))
    
    inline def setAppRenderToHTMLUndefined: Self = StObject.set(x, "appRenderToHTML", js.undefined)
    
    inline def setExtendRenderOpts(value: Partial[AmpOptimizerConfig] & PickdefaultOptionsrenderO): Self = StObject.set(x, "extendRenderOpts", value.asInstanceOf[js.Any])
    
    inline def setLoadComponent(value: String => js.Promise[LoadComponentsReturnType | Null]): Self = StObject.set(x, "loadComponent", js.Any.fromFunction1(value))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPagesRenderToHTML(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* pathname */ String, /* query */ NextParsedUrlQuery, /* renderOpts */ typings.next.distServerRenderMod.RenderOpts) => js.Promise[default | Null]
    ): Self = StObject.set(x, "pagesRenderToHTML", js.Any.fromFunction5(value))
    
    inline def setPagesRenderToHTMLUndefined: Self = StObject.set(x, "pagesRenderToHTML", js.undefined)
  }
}
