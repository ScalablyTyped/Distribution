package typings.phenomnomnominalTsquery

import typings.typescript.mod.ScriptKind
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAstMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAST(source: String): SourceFile = ^.asInstanceOf[js.Dynamic].applyDynamic("createAST")(source.asInstanceOf[js.Any]).asInstanceOf[SourceFile]
  inline def createAST(source: String, fileName: String): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createAST")(source.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  inline def createAST(source: String, fileName: String, scriptKind: ScriptKind): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createAST")(source.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  inline def createAST(source: String, fileName: Unit, scriptKind: ScriptKind): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createAST")(source.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
}
