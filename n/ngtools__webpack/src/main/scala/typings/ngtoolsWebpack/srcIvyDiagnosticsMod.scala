package typings.ngtoolsWebpack

import typings.typescript.mod.Diagnostic
import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyDiagnosticsMod {
  
  @JSImport("@ngtools/webpack/src/ivy/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addError(compilation: Compilation, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addError")(compilation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addWarning(compilation: Compilation, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarning")(compilation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createDiagnosticsReporter(compilation: Compilation, formatter: js.Function1[/* diagnostic */ Diagnostic, String]): DiagnosticsReporter = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticsReporter")(compilation.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[DiagnosticsReporter]
  
  type DiagnosticsReporter = js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit]
}
