package typings.next

import typings.next.nextStrings.app
import typings.next.nextStrings.pages
import typings.next.nextStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextEdgeSsrLoaderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-edge-ssr-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  
  trait EdgeSSRLoaderQuery extends StObject {
    
    var absolute500Path: String
    
    var absoluteAppPath: String
    
    var absoluteDocumentPath: String
    
    var absoluteErrorPath: String
    
    var absolutePagePath: String
    
    var appDirLoader: js.UndefOr[String] = js.undefined
    
    var buildId: String
    
    var dev: Boolean
    
    var hasFontLoaders: Boolean
    
    var isServerComponent: Boolean
    
    var page: String
    
    var pagesType: app | pages | root
    
    var sriEnabled: Boolean
    
    var stringifiedConfig: String
  }
  object EdgeSSRLoaderQuery {
    
    inline def apply(
      absolute500Path: String,
      absoluteAppPath: String,
      absoluteDocumentPath: String,
      absoluteErrorPath: String,
      absolutePagePath: String,
      buildId: String,
      dev: Boolean,
      hasFontLoaders: Boolean,
      isServerComponent: Boolean,
      page: String,
      pagesType: app | pages | root,
      sriEnabled: Boolean,
      stringifiedConfig: String
    ): EdgeSSRLoaderQuery = {
      val __obj = js.Dynamic.literal(absolute500Path = absolute500Path.asInstanceOf[js.Any], absoluteAppPath = absoluteAppPath.asInstanceOf[js.Any], absoluteDocumentPath = absoluteDocumentPath.asInstanceOf[js.Any], absoluteErrorPath = absoluteErrorPath.asInstanceOf[js.Any], absolutePagePath = absolutePagePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], hasFontLoaders = hasFontLoaders.asInstanceOf[js.Any], isServerComponent = isServerComponent.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pagesType = pagesType.asInstanceOf[js.Any], sriEnabled = sriEnabled.asInstanceOf[js.Any], stringifiedConfig = stringifiedConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeSSRLoaderQuery]
    }
    
    extension [Self <: EdgeSSRLoaderQuery](x: Self) {
      
      inline def setAbsolute500Path(value: String): Self = StObject.set(x, "absolute500Path", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteAppPath(value: String): Self = StObject.set(x, "absoluteAppPath", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteDocumentPath(value: String): Self = StObject.set(x, "absoluteDocumentPath", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteErrorPath(value: String): Self = StObject.set(x, "absoluteErrorPath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setAppDirLoader(value: String): Self = StObject.set(x, "appDirLoader", value.asInstanceOf[js.Any])
      
      inline def setAppDirLoaderUndefined: Self = StObject.set(x, "appDirLoader", js.undefined)
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setHasFontLoaders(value: Boolean): Self = StObject.set(x, "hasFontLoaders", value.asInstanceOf[js.Any])
      
      inline def setIsServerComponent(value: Boolean): Self = StObject.set(x, "isServerComponent", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPagesType(value: app | pages | root): Self = StObject.set(x, "pagesType", value.asInstanceOf[js.Any])
      
      inline def setSriEnabled(value: Boolean): Self = StObject.set(x, "sriEnabled", value.asInstanceOf[js.Any])
      
      inline def setStringifiedConfig(value: String): Self = StObject.set(x, "stringifiedConfig", value.asInstanceOf[js.Any])
    }
  }
}
