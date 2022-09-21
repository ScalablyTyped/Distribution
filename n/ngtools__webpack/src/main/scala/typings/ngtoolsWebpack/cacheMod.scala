package typings.ngtoolsWebpack

import typings.std.Map
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("@ngtools/webpack/src/ivy/cache", "SourceFileCache")
  @js.native
  open class SourceFileCache ()
    extends StObject
       with Map[String, SourceFile] {
    
    /* private */ val angularDiagnostics: Any = js.native
    
    def getAngularDiagnostics(sourceFile: SourceFile): js.UndefOr[js.Array[Diagnostic]] = js.native
    
    def invalidate(file: String): Unit = js.native
    
    def updateAngularDiagnostics(sourceFile: SourceFile, diagnostics: js.Array[Diagnostic]): Unit = js.native
  }
}
