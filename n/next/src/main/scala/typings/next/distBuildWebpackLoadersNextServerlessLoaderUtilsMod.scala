package typings.next

import typings.next.anon.BasePath
import typings.next.anon.BeforeFiles
import typings.next.anon.DefaultRouteMatches
import typings.next.anon.Groups
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerConfigSharedMod.I18NConfig
import typings.next.distServerGetPageFilesMod.BuildManifest
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextServerlessLoaderUtilsMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-serverless-loader/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUtils(param0: BasePath): DefaultRouteMatches = ^.asInstanceOf[js.Dynamic].applyDynamic("getUtils")(param0.asInstanceOf[js.Any]).asInstanceOf[DefaultRouteMatches]
  
  inline def interpolateDynamicPath(
    pathname: String,
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateDynamicPath")(pathname.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def interpolateDynamicPath(
    pathname: String,
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    defaultRouteRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateDynamicPath")(pathname.asInstanceOf[js.Any], params.asInstanceOf[js.Any], defaultRouteRegex.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("next/dist/build/webpack/loaders/next-serverless-loader/utils", "vercelHeader")
  @js.native
  val vercelHeader: /* "x-vercel-id" */ String = js.native
  
  trait ServerlessHandlerCtx extends StObject {
    
    var appModule: js.UndefOr[Any] = js.undefined
    
    var assetPrefix: String
    
    var basePath: String
    
    var buildId: String
    
    var buildManifest: js.UndefOr[BuildManifest] = js.undefined
    
    var canonicalBase: String
    
    var distDir: String
    
    var documentModule: js.UndefOr[Any] = js.undefined
    
    var encodedPreviewProps: ApiPreviewProps
    
    var errorModule: js.UndefOr[Any] = js.undefined
    
    var escapedBuildId: String
    
    var generateEtags: Boolean
    
    var i18n: js.UndefOr[I18NConfig | Null] = js.undefined
    
    var notFoundModule: js.UndefOr[Any] = js.undefined
    
    var page: String
    
    var pageComponent: js.UndefOr[Any] = js.undefined
    
    var pageConfig: js.UndefOr[Any] = js.undefined
    
    var pageGetServerSideProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetServerSideProps */ Any
      ] = js.undefined
    
    var pageGetStaticPaths: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticPaths */ Any
      ] = js.undefined
    
    var pageGetStaticProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticProps */ Any
      ] = js.undefined
    
    var pageIsDynamic: Boolean
    
    var pageModule: Any
    
    var poweredByHeader: Boolean
    
    var reactLoadableManifest: js.UndefOr[Any] = js.undefined
    
    var rewrites: BeforeFiles
    
    var runtimeConfig: Any
  }
  object ServerlessHandlerCtx {
    
    inline def apply(
      assetPrefix: String,
      basePath: String,
      buildId: String,
      canonicalBase: String,
      distDir: String,
      encodedPreviewProps: ApiPreviewProps,
      escapedBuildId: String,
      generateEtags: Boolean,
      page: String,
      pageIsDynamic: Boolean,
      pageModule: Any,
      poweredByHeader: Boolean,
      rewrites: BeforeFiles,
      runtimeConfig: Any
    ): ServerlessHandlerCtx = {
      val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], encodedPreviewProps = encodedPreviewProps.asInstanceOf[js.Any], escapedBuildId = escapedBuildId.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageIsDynamic = pageIsDynamic.asInstanceOf[js.Any], pageModule = pageModule.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], runtimeConfig = runtimeConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerlessHandlerCtx]
    }
    
    extension [Self <: ServerlessHandlerCtx](x: Self) {
      
      inline def setAppModule(value: Any): Self = StObject.set(x, "appModule", value.asInstanceOf[js.Any])
      
      inline def setAppModuleUndefined: Self = StObject.set(x, "appModule", js.undefined)
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setBuildManifest(value: BuildManifest): Self = StObject.set(x, "buildManifest", value.asInstanceOf[js.Any])
      
      inline def setBuildManifestUndefined: Self = StObject.set(x, "buildManifest", js.undefined)
      
      inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setDocumentModule(value: Any): Self = StObject.set(x, "documentModule", value.asInstanceOf[js.Any])
      
      inline def setDocumentModuleUndefined: Self = StObject.set(x, "documentModule", js.undefined)
      
      inline def setEncodedPreviewProps(value: ApiPreviewProps): Self = StObject.set(x, "encodedPreviewProps", value.asInstanceOf[js.Any])
      
      inline def setErrorModule(value: Any): Self = StObject.set(x, "errorModule", value.asInstanceOf[js.Any])
      
      inline def setErrorModuleUndefined: Self = StObject.set(x, "errorModule", js.undefined)
      
      inline def setEscapedBuildId(value: String): Self = StObject.set(x, "escapedBuildId", value.asInstanceOf[js.Any])
      
      inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
      
      inline def setI18n(value: I18NConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nNull: Self = StObject.set(x, "i18n", null)
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setNotFoundModule(value: Any): Self = StObject.set(x, "notFoundModule", value.asInstanceOf[js.Any])
      
      inline def setNotFoundModuleUndefined: Self = StObject.set(x, "notFoundModule", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageComponent(value: Any): Self = StObject.set(x, "pageComponent", value.asInstanceOf[js.Any])
      
      inline def setPageComponentUndefined: Self = StObject.set(x, "pageComponent", js.undefined)
      
      inline def setPageConfig(value: Any): Self = StObject.set(x, "pageConfig", value.asInstanceOf[js.Any])
      
      inline def setPageConfigUndefined: Self = StObject.set(x, "pageConfig", js.undefined)
      
      inline def setPageGetServerSideProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetServerSideProps */ Any
      ): Self = StObject.set(x, "pageGetServerSideProps", value.asInstanceOf[js.Any])
      
      inline def setPageGetServerSidePropsUndefined: Self = StObject.set(x, "pageGetServerSideProps", js.undefined)
      
      inline def setPageGetStaticPaths(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticPaths */ Any
      ): Self = StObject.set(x, "pageGetStaticPaths", value.asInstanceOf[js.Any])
      
      inline def setPageGetStaticPathsUndefined: Self = StObject.set(x, "pageGetStaticPaths", js.undefined)
      
      inline def setPageGetStaticProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GetStaticProps */ Any
      ): Self = StObject.set(x, "pageGetStaticProps", value.asInstanceOf[js.Any])
      
      inline def setPageGetStaticPropsUndefined: Self = StObject.set(x, "pageGetStaticProps", js.undefined)
      
      inline def setPageIsDynamic(value: Boolean): Self = StObject.set(x, "pageIsDynamic", value.asInstanceOf[js.Any])
      
      inline def setPageModule(value: Any): Self = StObject.set(x, "pageModule", value.asInstanceOf[js.Any])
      
      inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifest(value: Any): Self = StObject.set(x, "reactLoadableManifest", value.asInstanceOf[js.Any])
      
      inline def setReactLoadableManifestUndefined: Self = StObject.set(x, "reactLoadableManifest", js.undefined)
      
      inline def setRewrites(value: BeforeFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: Any): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    }
  }
}
