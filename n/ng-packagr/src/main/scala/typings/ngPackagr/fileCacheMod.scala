package typings.ngPackagr

import typings.std.Map
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileCacheMod {
  
  @JSImport("ng-packagr/lib/file-system/file-cache", "FileCache")
  @js.native
  open class FileCache () extends StObject {
    
    /* private */ var cache: Any = js.native
    
    def clear(): Unit = js.native
    
    def delete(fileName: String): Boolean = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ CacheEntry, /* key */ String, /* map */ Map[String, CacheEntry], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ CacheEntry, /* key */ String, /* map */ Map[String, CacheEntry], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(fileName: String): js.UndefOr[CacheEntry] = js.native
    
    def getAngularDiagnostics(sourceFile: SourceFile): js.UndefOr[js.Array[Diagnostic]] = js.native
    
    def getOrCreate(fileName: String): CacheEntry = js.native
    
    def has(fileName: String): Boolean = js.native
    
    def normalizeKey(fileName: String): String = js.native
    
    def size(): Double = js.native
    
    def updateAngularDiagnostics(sourceFile: SourceFile, diagnostics: js.Array[Diagnostic]): Unit = js.native
  }
  
  trait CacheEntry extends StObject {
    
    var angularDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var declarationFileName: js.UndefOr[String] = js.undefined
    
    var exists: js.UndefOr[Boolean] = js.undefined
    
    var sourceFile: js.UndefOr[SourceFile] = js.undefined
  }
  object CacheEntry {
    
    inline def apply(): CacheEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheEntry]
    }
    
    extension [Self <: CacheEntry](x: Self) {
      
      inline def setAngularDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "angularDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setAngularDiagnosticsUndefined: Self = StObject.set(x, "angularDiagnostics", js.undefined)
      
      inline def setAngularDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "angularDiagnostics", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDeclarationFileName(value: String): Self = StObject.set(x, "declarationFileName", value.asInstanceOf[js.Any])
      
      inline def setDeclarationFileNameUndefined: Self = StObject.set(x, "declarationFileName", js.undefined)
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    }
  }
}
