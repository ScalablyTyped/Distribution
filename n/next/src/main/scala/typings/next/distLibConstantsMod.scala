package typings.next

import typings.next.anon.ConfigRecommended
import typings.next.anon.Recommended
import typings.next.anon.Title
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConstantsMod {
  
  @JSImport("next/dist/lib/constants", "API_ROUTE")
  @js.native
  val API_ROUTE: js.RegExp = js.native
  
  @JSImport("next/dist/lib/constants", "APP_DIR_ALIAS")
  @js.native
  val APP_DIR_ALIAS: /* "private-next-app-dir" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "DOT_NEXT_ALIAS")
  @js.native
  val DOT_NEXT_ALIAS: /* "private-dot-next" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "ESLINT_DEFAULT_DIRS")
  @js.native
  val ESLINT_DEFAULT_DIRS: js.Array[String] = js.native
  
  @JSImport("next/dist/lib/constants", "ESLINT_PROMPT_VALUES")
  @js.native
  val ESLINT_PROMPT_VALUES: js.Array[Recommended | Title | ConfigRecommended] = js.native
  
  @JSImport("next/dist/lib/constants", "GSP_NO_RETURNED_VALUE")
  @js.native
  val GSP_NO_RETURNED_VALUE: /* "Your `getStaticProps` function did not return an object. Did you forget to add a `return`?" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "GSSP_COMPONENT_MEMBER_ERROR")
  @js.native
  val GSSP_COMPONENT_MEMBER_ERROR: /* "can not be attached to a page's component and must be exported from the page. See more info here: https://nextjs.org/docs/messages/gssp-component-member" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "GSSP_NO_RETURNED_VALUE")
  @js.native
  val GSSP_NO_RETURNED_VALUE: /* "Your `getServerSideProps` function did not return an object. Did you forget to add a `return`?" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "MIDDLEWARE_FILENAME")
  @js.native
  val MIDDLEWARE_FILENAME: /* "middleware" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "MIDDLEWARE_LOCATION_REGEXP")
  @js.native
  val MIDDLEWARE_LOCATION_REGEXP: String = js.native
  
  @JSImport("next/dist/lib/constants", "NON_STANDARD_NODE_ENV")
  @js.native
  val NON_STANDARD_NODE_ENV: /* "You are using a non-standard \"NODE_ENV\" value in your environment. This creates inconsistencies in the project and is strongly advised against. Read more: https://nextjs.org/docs/messages/non-standard-node-env" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "PAGES_DIR_ALIAS")
  @js.native
  val PAGES_DIR_ALIAS: /* "private-next-pages" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "PUBLIC_DIR_MIDDLEWARE_CONFLICT")
  @js.native
  val PUBLIC_DIR_MIDDLEWARE_CONFLICT: /* "You can not have a '_next' folder inside of your public folder. This conflicts with the internal '/_next' route. https://nextjs.org/docs/messages/public-next-folder-conflict" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "ROOT_DIR_ALIAS")
  @js.native
  val ROOT_DIR_ALIAS: /* "private-next-root-dir" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "RSC_MOD_REF_PROXY_ALIAS")
  @js.native
  val RSC_MOD_REF_PROXY_ALIAS: /* "private-next-rsc-mod-ref-proxy" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "SERVER_PROPS_EXPORT_ERROR")
  @js.native
  val SERVER_PROPS_EXPORT_ERROR: /* "pages with `getServerSideProps` can not be exported. See more info here: https://nextjs.org/docs/messages/gssp-export" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "SERVER_PROPS_GET_INIT_PROPS_CONFLICT")
  @js.native
  val SERVER_PROPS_GET_INIT_PROPS_CONFLICT: /* "You can not use getInitialProps with getServerSideProps. Please remove getInitialProps." */ String = js.native
  
  @JSImport("next/dist/lib/constants", "SERVER_PROPS_SSG_CONFLICT")
  @js.native
  val SERVER_PROPS_SSG_CONFLICT: /* "You can not use getStaticProps or getStaticPaths with getServerSideProps. To use SSG, please remove getServerSideProps" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "SERVER_RUNTIME")
  @js.native
  val SERVER_RUNTIME: Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
  ] = js.native
  
  @JSImport("next/dist/lib/constants", "SSG_FALLBACK_EXPORT_ERROR")
  @js.native
  val SSG_FALLBACK_EXPORT_ERROR: /* "Pages with `fallback` enabled in `getStaticPaths` can not be exported. See more info here: https://nextjs.org/docs/messages/ssg-fallback-true-export" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "SSG_GET_INITIAL_PROPS_CONFLICT")
  @js.native
  val SSG_GET_INITIAL_PROPS_CONFLICT: /* "You can not use getInitialProps with getStaticProps. To use SSG, please remove your getInitialProps" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "STATIC_STATUS_PAGE_GET_INITIAL_PROPS_ERROR")
  @js.native
  val STATIC_STATUS_PAGE_GET_INITIAL_PROPS_ERROR: /* "can not have getInitialProps/getServerSideProps, https://nextjs.org/docs/messages/404-get-initial-props" */ String = js.native
  
  @JSImport("next/dist/lib/constants", "UNSTABLE_REVALIDATE_RENAME_ERROR")
  @js.native
  val UNSTABLE_REVALIDATE_RENAME_ERROR: String = js.native
  
  object WEBPACK_LAYERS {
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.api")
    @js.native
    def api: String = js.native
    inline def api_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("api")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.client")
    @js.native
    def client: String = js.native
    inline def client_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("client")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.edgeAsset")
    @js.native
    def edgeAsset: String = js.native
    inline def edgeAsset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edgeAsset")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.middleware")
    @js.native
    def middleware: String = js.native
    inline def middleware_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middleware")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.rscShared")
    @js.native
    def rscShared: String = js.native
    inline def rscShared_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rscShared")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/lib/constants", "WEBPACK_LAYERS.server")
    @js.native
    def server: String = js.native
    inline def server_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("server")(x.asInstanceOf[js.Any])
  }
}
