package typings.ngtoolsWebpack

import typings.std.Set
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elideImportsMod {
  
  @JSImport("@ngtools/webpack/src/transformers/elide_imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elideImports(
    sourceFile: SourceFile,
    removedNodes: js.Array[Node],
    getTypeChecker: js.Function0[TypeChecker],
    compilerOptions: CompilerOptions
  ): Set[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("elideImports")(sourceFile.asInstanceOf[js.Any], removedNodes.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[Set[Node]]
}
