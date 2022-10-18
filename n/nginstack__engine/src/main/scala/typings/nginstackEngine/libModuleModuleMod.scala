package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleModuleMod {
  
  inline def apply(id: Any, parent: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/module/Module", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Module {
    def this(id: Any, parent: Any) = this()
  }
  @JSImport("@nginstack/engine/lib/module/Module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/module/Module", "ENGINE_MODULES_PREFIX")
  @js.native
  def ENGINE_MODULES_PREFIX: String = js.native
  inline def ENGINE_MODULES_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENGINE_MODULES_PREFIX")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/module/Module", "Regex_")
  @js.native
  def Regex: Any = js.native
  
  inline def Regex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Regex_")(x.asInstanceOf[js.Any])
  
  inline def addToCache(path: String, module: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(path.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/module/Module", "cache_")
  @js.native
  def cache: Any = js.native
  
  inline def cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache_")(x.asInstanceOf[js.Any])
  
  inline def clearCache(opt_fileName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(opt_fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/module/Module", "extensionIds_")
  @js.native
  def extensionIds: js.Array[String] = js.native
  
  inline def extensionIds_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionIds_")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/module/Module", "extensions")
  @js.native
  def extensions: Any = js.native
  inline def extensions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def extractDirName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractDirName_")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractFileExt(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFileExt_")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractFileName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFileName_")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExists(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists_")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@nginstack/engine/lib/module/Module", "global_")
  @js.native
  def global: Any = js.native
  
  inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global_")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/module/Module", "isAbsolutePathRegex_")
  @js.native
  def isAbsolutePathRegex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Regex */ Any = js.native
  
  inline def isAbsolutePathRegex_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Regex */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAbsolutePathRegex_")(x.asInstanceOf[js.Any])
  
  inline def isDirectory(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory_")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keyToPath(key: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToPath_")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def load(request: String, parent: Module): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load_")(request.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/module/Module", "packageMainCache_")
  @js.native
  def packageMainCache: Any = js.native
  
  inline def packageMainCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packageMainCache_")(x.asInstanceOf[js.Any])
  
  inline def readFileContent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileContent_")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeFromCache(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resolveFileName(request: String, parent: Module): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFileName_")(request.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolvePath(basePath: String, relativePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath_")(basePath.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def runInThisContext(content: Any, module: Any, require: Any, fileName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext_")(content.asInstanceOf[js.Any], module.asInstanceOf[js.Any], require.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def runOnFileSystem(filePath: String, method: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runOnFileSystem_")(filePath.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/module/Module", "searchPackagesInRootDirectory")
  @js.native
  def searchPackagesInRootDirectory: Boolean = js.native
  inline def searchPackagesInRootDirectory_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchPackagesInRootDirectory")(x.asInstanceOf[js.Any])
  
  inline def tryExtensions(path: String, extensions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tryExtensions_")(path.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tryFile(requestPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tryFile_")(requestPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tryPackage(requestPath: String, extensions: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tryPackage_")(requestPath.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def tryReadPackageMain(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryReadPackageMain_")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def useCurrentContextAsMainModule(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCurrentContextAsMainModule")().asInstanceOf[Unit]
  
  @js.native
  trait Module extends StObject {
    
    var children: js.Array[Any] = js.native
    
    /* protected */ def compileSource_(content: String, fileName: String): Unit = js.native
    
    /* protected */ def compile_(fileName: String): Unit = js.native
    
    var filename: String = js.native
    
    var id: Any = js.native
    
    def load(path: String): Unit = js.native
    
    var loaded: Boolean = js.native
    
    var parent: Any = js.native
    
    var paths: js.Array[Any] = js.native
    
    def require(path: String): Any = js.native
    def require(path: Double): Any = js.native
    
    /* private */ var resolveFileNameCache_ : Any = js.native
  }
  
  trait ModuleFileSystem extends StObject {
    
    def exists(arg0: String): Boolean
    
    def isDirectory(arg0: String): Boolean
    
    def readFileContent(arg0: String): String
  }
  object ModuleFileSystem {
    
    inline def apply(exists: String => Boolean, isDirectory: String => Boolean, readFileContent: String => String): ModuleFileSystem = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), isDirectory = js.Any.fromFunction1(isDirectory), readFileContent = js.Any.fromFunction1(readFileContent))
      __obj.asInstanceOf[ModuleFileSystem]
    }
    
    extension [Self <: ModuleFileSystem](x: Self) {
      
      inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setIsDirectory(value: String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setReadFileContent(value: String => String): Self = StObject.set(x, "readFileContent", js.Any.fromFunction1(value))
    }
  }
}
