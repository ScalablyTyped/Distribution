package typings.next

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextServerlessLoaderMod extends Shortcut {
  
  @JSImport("next/dist/build/webpack/loaders/next-serverless-loader", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.LoaderDefinitionFunction */ Any = js.native
  
  trait ServerlessLoaderQuery extends StObject {
    
    var absolute404Path: String
    
    var absoluteAppPath: String
    
    var absoluteDocumentPath: String
    
    var absoluteErrorPath: String
    
    var absolutePagePath: String
    
    var assetPrefix: String
    
    var basePath: String
    
    var buildId: String
    
    var canonicalBase: String
    
    var distDir: String
    
    var generateEtags: String
    
    var i18n: String
    
    var loadedEnvFiles: String
    
    var page: String
    
    var poweredByHeader: String
    
    var previewProps: String
    
    var runtimeConfig: String
  }
  object ServerlessLoaderQuery {
    
    inline def apply(
      absolute404Path: String,
      absoluteAppPath: String,
      absoluteDocumentPath: String,
      absoluteErrorPath: String,
      absolutePagePath: String,
      assetPrefix: String,
      basePath: String,
      buildId: String,
      canonicalBase: String,
      distDir: String,
      generateEtags: String,
      i18n: String,
      loadedEnvFiles: String,
      page: String,
      poweredByHeader: String,
      previewProps: String,
      runtimeConfig: String
    ): ServerlessLoaderQuery = {
      val __obj = js.Dynamic.literal(absolute404Path = absolute404Path.asInstanceOf[js.Any], absoluteAppPath = absoluteAppPath.asInstanceOf[js.Any], absoluteDocumentPath = absoluteDocumentPath.asInstanceOf[js.Any], absoluteErrorPath = absoluteErrorPath.asInstanceOf[js.Any], absolutePagePath = absolutePagePath.asInstanceOf[js.Any], assetPrefix = assetPrefix.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], loadedEnvFiles = loadedEnvFiles.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any], runtimeConfig = runtimeConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerlessLoaderQuery]
    }
    
    extension [Self <: ServerlessLoaderQuery](x: Self) {
      
      inline def setAbsolute404Path(value: String): Self = StObject.set(x, "absolute404Path", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteAppPath(value: String): Self = StObject.set(x, "absoluteAppPath", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteDocumentPath(value: String): Self = StObject.set(x, "absoluteDocumentPath", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteErrorPath(value: String): Self = StObject.set(x, "absoluteErrorPath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setGenerateEtags(value: String): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
      
      inline def setI18n(value: String): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setLoadedEnvFiles(value: String): Self = StObject.set(x, "loadedEnvFiles", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPoweredByHeader(value: String): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
      
      inline def setPreviewProps(value: String): Self = StObject.set(x, "previewProps", value.asInstanceOf[js.Any])
      
      inline def setRuntimeConfig(value: String): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.LoaderDefinitionFunction */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distBuildWebpackLoadersNextServerlessLoaderMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.LoaderDefinitionFunction */ Any = default
}
