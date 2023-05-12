package typings.ngtoolsWebpack

import typings.ngtoolsWebpack.ngtoolsWebpackStrings.style
import typings.ngtoolsWebpack.ngtoolsWebpackStrings.template
import typings.std.Set
import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcResourceLoaderMod {
  
  @JSImport("@ngtools/webpack/src/resource_loader", "WebpackResourceLoader")
  @js.native
  open class WebpackResourceLoader protected () extends StObject {
    def this(shouldCache: Boolean) = this()
    
    /* private */ var _compile: Any = js.native
    
    /* private */ var _evaluate: Any = js.native
    
    /* private */ var _fileDependencies: Any = js.native
    
    /* private */ var _parentCompilation: Any = js.native
    
    /* private */ var _reverseDependencies: Any = js.native
    
    /* private */ var assetCache: Any = js.native
    
    def clearParentCompilation(): Unit = js.native
    
    /* private */ var fileCache: Any = js.native
    
    def get(filePath: String): js.Promise[String] = js.native
    
    def getAffectedResources(file: String): js.Array[scala.Nothing] | Set[String] = js.native
    
    def getModifiedResourceFiles(): Set[String] = js.native
    
    def getResourceDependencies(filePath: String): js.Array[scala.Nothing] | Set[String] = js.native
    
    /* private */ val inlineDataLoaderPath: Any = js.native
    
    /* private */ var modifiedResources: Any = js.native
    
    /* private */ var outputPathCounter: Any = js.native
    
    def process(data: String, fileExtension: String, resourceType: template | style): js.Promise[String] = js.native
    def process(data: String, fileExtension: String, resourceType: template | style, containingFile: String): js.Promise[String] = js.native
    def process(data: String, fileExtension: Unit, resourceType: template | style): js.Promise[String] = js.native
    def process(data: String, fileExtension: Unit, resourceType: template | style, containingFile: String): js.Promise[String] = js.native
    
    def setAffectedResources(file: String, resources: js.Iterable[String]): Unit = js.native
    
    def update(parentCompilation: Compilation): Unit = js.native
    def update(parentCompilation: Compilation, changedFiles: js.Iterable[String]): Unit = js.native
  }
}
