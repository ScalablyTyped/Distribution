package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.BodyParser
import typings.next.anon.Locale
import typings.next.libUtilsMod.NextComponentType
import typings.next.libUtilsMod.NextPageContext
import typings.next.nextBooleans.`false`
import typings.next.nextMod.NextServerConstructor
import typings.next.nextNumbers.`301`
import typings.next.nextNumbers.`302`
import typings.next.nextNumbers.`303`
import typings.next.nextNumbers.`307`
import typings.next.nextNumbers.`308`
import typings.next.nextStrings.blocking
import typings.next.nextStrings.hybrid
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: NextServerConstructor): typings.next.nextServerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[typings.next.nextServerMod.default]
  
  type GetServerSideProps[P /* <: StringDictionary[js.Any] */, Q /* <: ParsedUrlQuery */] = js.Function1[
    /* context */ GetServerSidePropsContext[Q], 
    js.Promise[GetServerSidePropsResult[P]]
  ]
  
  trait GetServerSidePropsContext[Q /* <: ParsedUrlQuery */] extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[Q] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[js.Any] = js.undefined
    
    var query: ParsedUrlQuery
    
    var req: IncomingMessage
    
    var res: ServerResponse
    
    var resolvedUrl: String
  }
  object GetServerSidePropsContext {
    
    inline def apply[Q /* <: ParsedUrlQuery */](query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse, resolvedUrl: String): GetServerSidePropsContext[Q] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], resolvedUrl = resolvedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerSidePropsContext[Q]]
    }
    
    extension [Self <: GetServerSidePropsContext[?], Q /* <: ParsedUrlQuery */](x: Self & GetServerSidePropsContext[Q]) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      inline def setParams(value: Q): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewData(value: js.Any): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      inline def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResolvedUrl(value: String): Self = StObject.set(x, "resolvedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.PropsP[P]
    - typings.next.anon.RedirectRedirect
    - typings.next.anon.NotFound
  */
  trait GetServerSidePropsResult[P] extends StObject
  object GetServerSidePropsResult {
    
    inline def NotFound(): typings.next.anon.NotFound = {
      val __obj = js.Dynamic.literal(notFound = true)
      __obj.asInstanceOf[typings.next.anon.NotFound]
    }
    
    inline def PropsP[P](props: P): typings.next.anon.PropsP[P] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.PropsP[P]]
    }
    
    inline def RedirectRedirect(redirect: Redirect): typings.next.anon.RedirectRedirect = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.RedirectRedirect]
    }
  }
  
  type GetStaticPaths[P /* <: ParsedUrlQuery */] = js.Function1[/* context */ GetStaticPathsContext, js.Promise[GetStaticPathsResult[P]]]
  
  trait GetStaticPathsContext extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetStaticPathsContext {
    
    inline def apply(): GetStaticPathsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStaticPathsContext]
    }
    
    extension [Self <: GetStaticPathsContext](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    }
  }
  
  trait GetStaticPathsResult[P /* <: ParsedUrlQuery */] extends StObject {
    
    var fallback: Boolean | blocking
    
    var paths: js.Array[String | Locale[P]]
  }
  object GetStaticPathsResult {
    
    inline def apply[P /* <: ParsedUrlQuery */](fallback: Boolean | blocking, paths: js.Array[String | Locale[P]]): GetStaticPathsResult[P] = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStaticPathsResult[P]]
    }
    
    extension [Self <: GetStaticPathsResult[?], P /* <: ParsedUrlQuery */](x: Self & GetStaticPathsResult[P]) {
      
      inline def setFallback(value: Boolean | blocking): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String | Locale[P]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: (String | Locale[P])*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  type GetStaticProps[P /* <: StringDictionary[js.Any] */, Q /* <: ParsedUrlQuery */] = js.Function1[/* context */ GetStaticPropsContext[Q], js.Promise[GetStaticPropsResult[P]]]
  
  trait GetStaticPropsContext[Q /* <: ParsedUrlQuery */] extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[Q] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[js.Any] = js.undefined
  }
  object GetStaticPropsContext {
    
    inline def apply[Q /* <: ParsedUrlQuery */](): GetStaticPropsContext[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStaticPropsContext[Q]]
    }
    
    extension [Self <: GetStaticPropsContext[?], Q /* <: ParsedUrlQuery */](x: Self & GetStaticPropsContext[Q]) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      inline def setParams(value: Q): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewData(value: js.Any): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      inline def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.Props[P]
    - typings.next.anon.Redirect
    - typings.next.anon.NotFound
  */
  trait GetStaticPropsResult[P] extends StObject
  object GetStaticPropsResult {
    
    inline def NotFound(): typings.next.anon.NotFound = {
      val __obj = js.Dynamic.literal(notFound = true)
      __obj.asInstanceOf[typings.next.anon.NotFound]
    }
    
    inline def Props[P](props: P): typings.next.anon.Props[P] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Props[P]]
    }
    
    inline def Redirect(redirect: typings.next.mod.Redirect): typings.next.anon.Redirect = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Redirect]
    }
  }
  
  type InferGetServerSidePropsType[T] = js.Any
  
  type InferGetStaticPropsType[T] = js.Any
  
  type NextPage[P, IP] = NextComponentType[NextPageContext, IP, P]
  
  trait PageConfig extends StObject {
    
    var amp: js.UndefOr[Boolean | hybrid] = js.undefined
    
    var api: js.UndefOr[BodyParser] = js.undefined
    
    var env: js.UndefOr[js.Array[String]] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object PageConfig {
    
    inline def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    extension [Self <: PageConfig](x: Self) {
      
      inline def setAmp(value: Boolean | hybrid): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      inline def setApi(value: BodyParser): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
      
      inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.Destination
    - typings.next.anon.BasePathDestination
  */
  trait Redirect extends StObject
  object Redirect {
    
    inline def BasePathDestination(destination: String, permanent: Boolean): typings.next.anon.BasePathDestination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.BasePathDestination]
    }
    
    inline def Destination(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): typings.next.anon.Destination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Destination]
    }
  }
  
  // Extend the React types with missing properties
  /* augmented module */
  object reactAugmentingMod {
    
    // <html amp=""> support
    trait HtmlHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var amp: js.UndefOr[String] = js.undefined
    }
    object HtmlHTMLAttributes {
      
      inline def apply[T](): HtmlHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlHTMLAttributes[T]]
      }
      
      extension [Self <: HtmlHTMLAttributes[?], T](x: Self & HtmlHTMLAttributes[T]) {
        
        inline def setAmp(value: String): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
        
        inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      }
    }
    
    // <link nonce=""> support
    trait LinkHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var nonce: js.UndefOr[String] = js.undefined
    }
    object LinkHTMLAttributes {
      
      inline def apply[T](): LinkHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkHTMLAttributes[T]]
      }
      
      extension [Self <: LinkHTMLAttributes[?], T](x: Self & LinkHTMLAttributes[T]) {
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      }
    }
    
    // <style jsx> and <style jsx global> support for styled-jsx
    trait StyleHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var global: js.UndefOr[Boolean] = js.undefined
      
      var jsx: js.UndefOr[Boolean] = js.undefined
    }
    object StyleHTMLAttributes {
      
      inline def apply[T](): StyleHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StyleHTMLAttributes[T]]
      }
      
      extension [Self <: StyleHTMLAttributes[?], T](x: Self & StyleHTMLAttributes[T]) {
        
        inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
        
        inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
        
        inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
        
        inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      }
    }
  }
}
