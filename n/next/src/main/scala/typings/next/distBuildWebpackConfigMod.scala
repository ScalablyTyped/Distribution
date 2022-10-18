package typings.next

import typings.next.anon.CompilerType
import typings.next.anon.Dev
import typings.next.anon.EdgeRuntime
import typings.next.anon.IsEsm
import typings.next.anon.LocalRes
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigMod {
  
  @JSImport("next/dist/build/webpack-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    dir: String,
    hasBuildIdConfigCompilerTypeDevEntrypointsHasReactRootIsDevFallbackPagesDirReactProductionProfilingRewritesRunWebpackSpanTargetAppDirMiddlewareMatchers: CompilerType
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], hasBuildIdConfigCompilerTypeDevEntrypointsHasReactRootIsDevFallbackPagesDirReactProductionProfilingRewritesRunWebpackSpanTargetAppDirMiddlewareMatchers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  
  object NODE_BASE_ESM_RESOLVE_OPTIONS {
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.alias")
    @js.native
    def alias: Boolean = js.native
    inline def alias_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alias")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.conditionNames")
    @js.native
    def conditionNames: js.Array[String] = js.native
    inline def conditionNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("conditionNames")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.dependencyType")
    @js.native
    def dependencyType: String = js.native
    inline def dependencyType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencyType")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.descriptionFiles")
    @js.native
    def descriptionFiles: js.Array[String] = js.native
    inline def descriptionFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.enforceExtensions")
    @js.native
    def enforceExtensions: Boolean = js.native
    inline def enforceExtensions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enforceExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.exportsFields")
    @js.native
    def exportsFields: js.Array[String] = js.native
    inline def exportsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.extensions")
    @js.native
    def extensions: js.Array[String] = js.native
    inline def extensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.fallback")
    @js.native
    def fallback: Boolean = js.native
    inline def fallback_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallback")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.fullySpecified")
    @js.native
    def fullySpecified: Boolean = js.native
    inline def fullySpecified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullySpecified")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.importsFields")
    @js.native
    def importsFields: js.Array[String] = js.native
    inline def importsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.mainFields")
    @js.native
    def mainFields: js.Array[String] = js.native
    inline def mainFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.mainFiles")
    @js.native
    def mainFiles: js.Array[String] = js.native
    inline def mainFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.preferAbsolute")
    @js.native
    def preferAbsolute: Boolean = js.native
    inline def preferAbsolute_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferAbsolute")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.preferRelative")
    @js.native
    def preferRelative: Boolean = js.native
    inline def preferRelative_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferRelative")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.restrictions")
    @js.native
    def restrictions: js.Array[scala.Nothing] = js.native
    inline def restrictions_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.roots")
    @js.native
    def roots: js.Array[scala.Nothing] = js.native
    inline def roots_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roots")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_ESM_RESOLVE_OPTIONS.symlinks")
    @js.native
    def symlinks: Boolean = js.native
    inline def symlinks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(x.asInstanceOf[js.Any])
  }
  
  object NODE_BASE_RESOLVE_OPTIONS {
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.alias")
    @js.native
    def alias: Boolean = js.native
    inline def alias_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alias")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.conditionNames")
    @js.native
    def conditionNames: js.Array[String] = js.native
    inline def conditionNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("conditionNames")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.dependencyType")
    @js.native
    def dependencyType: String = js.native
    inline def dependencyType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencyType")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.descriptionFiles")
    @js.native
    def descriptionFiles: js.Array[String] = js.native
    inline def descriptionFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.enforceExtensions")
    @js.native
    def enforceExtensions: Boolean = js.native
    inline def enforceExtensions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enforceExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.exportsFields")
    @js.native
    def exportsFields: js.Array[String] = js.native
    inline def exportsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.extensions")
    @js.native
    def extensions: js.Array[String] = js.native
    inline def extensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.fallback")
    @js.native
    def fallback: Boolean = js.native
    inline def fallback_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallback")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.fullySpecified")
    @js.native
    def fullySpecified: Boolean = js.native
    inline def fullySpecified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullySpecified")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.importsFields")
    @js.native
    def importsFields: js.Array[String] = js.native
    inline def importsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.mainFields")
    @js.native
    def mainFields: js.Array[String] = js.native
    inline def mainFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.mainFiles")
    @js.native
    def mainFiles: js.Array[String] = js.native
    inline def mainFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.preferAbsolute")
    @js.native
    def preferAbsolute: Boolean = js.native
    inline def preferAbsolute_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferAbsolute")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.preferRelative")
    @js.native
    def preferRelative: Boolean = js.native
    inline def preferRelative_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferRelative")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.restrictions")
    @js.native
    def restrictions: js.Array[scala.Nothing] = js.native
    inline def restrictions_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.roots")
    @js.native
    def roots: js.Array[scala.Nothing] = js.native
    inline def roots_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roots")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_BASE_RESOLVE_OPTIONS.symlinks")
    @js.native
    def symlinks: Boolean = js.native
    inline def symlinks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(x.asInstanceOf[js.Any])
  }
  
  object NODE_ESM_RESOLVE_OPTIONS {
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.alias")
    @js.native
    def alias: Boolean = js.native
    inline def alias_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alias")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.conditionNames")
    @js.native
    def conditionNames: js.Array[String] = js.native
    inline def conditionNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("conditionNames")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.dependencyType")
    @js.native
    def dependencyType: String = js.native
    inline def dependencyType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencyType")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.descriptionFiles")
    @js.native
    def descriptionFiles: js.Array[String] = js.native
    inline def descriptionFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.enforceExtensions")
    @js.native
    def enforceExtensions: Boolean = js.native
    inline def enforceExtensions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enforceExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.exportsFields")
    @js.native
    def exportsFields: js.Array[String] = js.native
    inline def exportsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.extensions")
    @js.native
    def extensions: js.Array[String] = js.native
    inline def extensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.fallback")
    @js.native
    def fallback: Boolean = js.native
    inline def fallback_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallback")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.fullySpecified")
    @js.native
    def fullySpecified: Boolean = js.native
    inline def fullySpecified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullySpecified")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.importsFields")
    @js.native
    def importsFields: js.Array[String] = js.native
    inline def importsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.mainFields")
    @js.native
    def mainFields: js.Array[String] = js.native
    inline def mainFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.mainFiles")
    @js.native
    def mainFiles: js.Array[String] = js.native
    inline def mainFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.preferAbsolute")
    @js.native
    def preferAbsolute: Boolean = js.native
    inline def preferAbsolute_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferAbsolute")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.preferRelative")
    @js.native
    def preferRelative: Boolean = js.native
    inline def preferRelative_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferRelative")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.restrictions")
    @js.native
    def restrictions: js.Array[scala.Nothing] = js.native
    inline def restrictions_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.roots")
    @js.native
    def roots: js.Array[scala.Nothing] = js.native
    inline def roots_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roots")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_ESM_RESOLVE_OPTIONS.symlinks")
    @js.native
    def symlinks: Boolean = js.native
    inline def symlinks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(x.asInstanceOf[js.Any])
  }
  
  object NODE_RESOLVE_OPTIONS {
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.conditionNames")
    @js.native
    def conditionNames: js.Array[String] = js.native
    inline def conditionNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("conditionNames")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.dependencyType")
    @js.native
    def dependencyType: String = js.native
    inline def dependencyType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencyType")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.descriptionFiles")
    @js.native
    def descriptionFiles: js.Array[String] = js.native
    inline def descriptionFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.enforceExtensions")
    @js.native
    def enforceExtensions: Boolean = js.native
    inline def enforceExtensions_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enforceExtensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.exportsFields")
    @js.native
    def exportsFields: js.Array[String] = js.native
    inline def exportsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.extensions")
    @js.native
    def extensions: js.Array[String] = js.native
    inline def extensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.fallback")
    @js.native
    def fallback: Boolean = js.native
    inline def fallback_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallback")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.fullySpecified")
    @js.native
    def fullySpecified: Boolean = js.native
    inline def fullySpecified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullySpecified")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.importsFields")
    @js.native
    def importsFields: js.Array[String] = js.native
    inline def importsFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importsFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.mainFields")
    @js.native
    def mainFields: js.Array[String] = js.native
    inline def mainFields_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.mainFiles")
    @js.native
    def mainFiles: js.Array[String] = js.native
    inline def mainFiles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.preferAbsolute")
    @js.native
    def preferAbsolute: Boolean = js.native
    inline def preferAbsolute_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferAbsolute")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.preferRelative")
    @js.native
    def preferRelative: Boolean = js.native
    inline def preferRelative_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferRelative")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.restrictions")
    @js.native
    def restrictions: js.Array[scala.Nothing] = js.native
    inline def restrictions_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.roots")
    @js.native
    def roots: js.Array[scala.Nothing] = js.native
    inline def roots_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roots")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/webpack-config", "NODE_RESOLVE_OPTIONS.symlinks")
    @js.native
    def symlinks: Boolean = js.native
    inline def symlinks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(x.asInstanceOf[js.Any])
  }
  
  inline def attachReactRefresh(
    webpackConfig: Configuration,
    targetLoader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.RuleSetUseItem */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachReactRefresh")(webpackConfig.asInstanceOf[js.Any], targetLoader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefineEnv(hasDevConfigDistDirIsClientHasRewritesHasReactRootIsNodeServerIsEdgeServerMiddlewareMatchers: Dev): EdgeRuntime = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefineEnv")(hasDevConfigDistDirIsClientHasRewritesHasReactRootIsNodeServerIsEdgeServerMiddlewareMatchers.asInstanceOf[js.Any]).asInstanceOf[EdgeRuntime]
  
  @JSImport("next/dist/build/webpack-config", "nextImageLoaderRegex")
  @js.native
  val nextImageLoaderRegex: js.RegExp = js.native
  
  inline def resolveExternal(
    appDir: String,
    esmExternalsConfig: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['esmExternals'] */ js.Any,
    context: String,
    request: String,
    isEsmRequested: Boolean,
    getResolve: js.Function1[
      /* options */ Any, 
      js.Function2[
        /* resolveContext */ String, 
        /* resolveRequest */ String, 
        js.Promise[js.Tuple2[String | Null, Boolean]]
      ]
    ],
    isLocalCallback: js.UndefOr[js.Function1[/* res */ String, Any]],
    baseResolveCheck: js.UndefOr[Boolean],
    esmResolveOptions: js.UndefOr[Any],
    nodeResolveOptions: js.UndefOr[Any],
    baseEsmResolveOptions: js.UndefOr[Any],
    baseResolveOptions: js.UndefOr[Any]
  ): js.Promise[IsEsm | LocalRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveExternal")(appDir.asInstanceOf[js.Any], esmExternalsConfig.asInstanceOf[js.Any], context.asInstanceOf[js.Any], request.asInstanceOf[js.Any], isEsmRequested.asInstanceOf[js.Any], getResolve.asInstanceOf[js.Any], isLocalCallback.asInstanceOf[js.Any], baseResolveCheck.asInstanceOf[js.Any], esmResolveOptions.asInstanceOf[js.Any], nodeResolveOptions.asInstanceOf[js.Any], baseEsmResolveOptions.asInstanceOf[js.Any], baseResolveOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IsEsm | LocalRes]]
}
