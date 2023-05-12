package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  computeDependencies :boolean,   computeSha1 :boolean,   enableSymlinks :boolean,   extensions :std.ReadonlyArray<string>,   forceNodeFilesystemAPI :boolean,   ignorePattern :std.RegExp,   mocksPattern :std.RegExp | null,   platforms :std.ReadonlyArray<string>,   retainAllFiles :boolean,   rootDir :string,   roots :std.ReadonlyArray<string>,   skipPackageJson :boolean,   dependencyExtractor :string | null,   hasteImplModulePath :string | null,   cacheBreaker :string}> */
trait BuildParameters extends StObject {
  
  val cacheBreaker: String
  
  val computeDependencies: Boolean
  
  val computeSha1: Boolean
  
  val dependencyExtractor: js.UndefOr[String | Null] = js.undefined
  
  val enableSymlinks: Boolean
  
  val extensions: js.Array[String]
  
  val forceNodeFilesystemAPI: Boolean
  
  val hasteImplModulePath: js.UndefOr[String | Null] = js.undefined
  
  val ignorePattern: js.RegExp
  
  val mocksPattern: js.UndefOr[js.RegExp | Null] = js.undefined
  
  val platforms: js.Array[String]
  
  val retainAllFiles: Boolean
  
  val rootDir: String
  
  val roots: js.Array[String]
  
  val skipPackageJson: Boolean
}
object BuildParameters {
  
  inline def apply(
    cacheBreaker: String,
    computeDependencies: Boolean,
    computeSha1: Boolean,
    enableSymlinks: Boolean,
    extensions: js.Array[String],
    forceNodeFilesystemAPI: Boolean,
    ignorePattern: js.RegExp,
    platforms: js.Array[String],
    retainAllFiles: Boolean,
    rootDir: String,
    roots: js.Array[String],
    skipPackageJson: Boolean
  ): BuildParameters = {
    val __obj = js.Dynamic.literal(cacheBreaker = cacheBreaker.asInstanceOf[js.Any], computeDependencies = computeDependencies.asInstanceOf[js.Any], computeSha1 = computeSha1.asInstanceOf[js.Any], enableSymlinks = enableSymlinks.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], forceNodeFilesystemAPI = forceNodeFilesystemAPI.asInstanceOf[js.Any], ignorePattern = ignorePattern.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], skipPackageJson = skipPackageJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildParameters] (val x: Self) extends AnyVal {
    
    inline def setCacheBreaker(value: String): Self = StObject.set(x, "cacheBreaker", value.asInstanceOf[js.Any])
    
    inline def setComputeDependencies(value: Boolean): Self = StObject.set(x, "computeDependencies", value.asInstanceOf[js.Any])
    
    inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorNull: Self = StObject.set(x, "dependencyExtractor", null)
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setEnableSymlinks(value: Boolean): Self = StObject.set(x, "enableSymlinks", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setForceNodeFilesystemAPI(value: Boolean): Self = StObject.set(x, "forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePathNull: Self = StObject.set(x, "hasteImplModulePath", null)
    
    inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
    
    inline def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
    
    inline def setMocksPattern(value: js.RegExp): Self = StObject.set(x, "mocksPattern", value.asInstanceOf[js.Any])
    
    inline def setMocksPatternNull: Self = StObject.set(x, "mocksPattern", null)
    
    inline def setMocksPatternUndefined: Self = StObject.set(x, "mocksPattern", js.undefined)
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setRetainAllFiles(value: Boolean): Self = StObject.set(x, "retainAllFiles", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
  }
}
