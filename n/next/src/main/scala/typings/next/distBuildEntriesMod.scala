package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.AbsolutePagePath
import typings.next.anon.AppDir
import typings.next.anon.AppDirLoader
import typings.next.anon.AppPaths
import typings.next.anon.BuildId
import typings.next.anon.Client
import typings.next.anon.Import
import typings.next.anon.Layer
import typings.next.anon.OnClient
import typings.next.anon.PageExtensions
import typings.next.distCompiledWebpackWebpackMod.webpack.EntryObject
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.next.nextStrings.`experimental-serverless-trace`
import typings.next.nextStrings.server
import typings.next.nextStrings.serverless
import typings.nextEnv.anon.Contents
import typings.nextEnv.mod.LoadedEnvFiles
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildEntriesMod {
  
  @JSImport("next/dist/build/entries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEntrypoints(params: CreateEntrypointsParams): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntrypoints")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  
  inline def createPagesMapping(param0: PageExtensions): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPagesMapping")(param0.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def finalizeEntrypoint(param0: AppDir): ObjectValue[EntryObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizeEntrypoint")(param0.asInstanceOf[js.Any]).asInstanceOf[ObjectValue[EntryObject]]
  
  inline def getAppEntry(opts: AppPaths): Import = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppEntry")(opts.asInstanceOf[js.Any]).asInstanceOf[Import]
  
  inline def getClientEntry(opts: AbsolutePagePath): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientEntry")(opts.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  
  inline def getEdgeServerEntry(opts: AppDirLoader): String | Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdgeServerEntry")(opts.asInstanceOf[js.Any]).asInstanceOf[String | Layer]
  
  inline def getPageFromPath(pagePath: String, pageExtensions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageFromPath")(pagePath.asInstanceOf[js.Any], pageExtensions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getServerlessEntry(opts: BuildId): ObjectValue[EntryObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerlessEntry")(opts.asInstanceOf[js.Any]).asInstanceOf[ObjectValue[EntryObject]]
  
  inline def runDependingOnPageType[T](params: OnClient[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runDependingOnPageType")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait CreateEntrypointsParams extends StObject {
    
    var appDir: js.UndefOr[String] = js.undefined
    
    var appPaths: js.UndefOr[Record[String, String]] = js.undefined
    
    var buildId: String
    
    var config: NextConfigComplete
    
    var envFiles: LoadedEnvFiles
    
    var isDev: js.UndefOr[Boolean] = js.undefined
    
    var pageExtensions: js.Array[String]
    
    var pages: StringDictionary[String]
    
    var pagesDir: js.UndefOr[String] = js.undefined
    
    var previewMode: ApiPreviewProps
    
    var rootDir: String
    
    var rootPaths: js.UndefOr[Record[String, String]] = js.undefined
    
    var target: server | serverless | `experimental-serverless-trace`
  }
  object CreateEntrypointsParams {
    
    inline def apply(
      buildId: String,
      config: NextConfigComplete,
      envFiles: LoadedEnvFiles,
      pageExtensions: js.Array[String],
      pages: StringDictionary[String],
      previewMode: ApiPreviewProps,
      rootDir: String,
      target: server | serverless | `experimental-serverless-trace`
    ): CreateEntrypointsParams = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], envFiles = envFiles.asInstanceOf[js.Any], pageExtensions = pageExtensions.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previewMode = previewMode.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateEntrypointsParams]
    }
    
    extension [Self <: CreateEntrypointsParams](x: Self) {
      
      inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
      
      inline def setAppPaths(value: Record[String, String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
      
      inline def setAppPathsUndefined: Self = StObject.set(x, "appPaths", js.undefined)
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnvFiles(value: LoadedEnvFiles): Self = StObject.set(x, "envFiles", value.asInstanceOf[js.Any])
      
      inline def setEnvFilesVarargs(value: Contents*): Self = StObject.set(x, "envFiles", js.Array(value*))
      
      inline def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
      
      inline def setIsDevUndefined: Self = StObject.set(x, "isDev", js.undefined)
      
      inline def setPageExtensions(value: js.Array[String]): Self = StObject.set(x, "pageExtensions", value.asInstanceOf[js.Any])
      
      inline def setPageExtensionsVarargs(value: String*): Self = StObject.set(x, "pageExtensions", js.Array(value*))
      
      inline def setPages(value: StringDictionary[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
      
      inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
      
      inline def setPreviewMode(value: ApiPreviewProps): Self = StObject.set(x, "previewMode", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootPaths(value: Record[String, String]): Self = StObject.set(x, "rootPaths", value.asInstanceOf[js.Any])
      
      inline def setRootPathsUndefined: Self = StObject.set(x, "rootPaths", js.undefined)
      
      inline def setTarget(value: server | serverless | `experimental-serverless-trace`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {[key: string] : infer V} ? V : never
    }}}
    */
  @js.native
  trait ObjectValue[T] extends StObject
}
