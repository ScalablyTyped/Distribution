package typings.phenomnomnominalTsquery

import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxKindMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/syntax-kind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def syntaxKindName(kind: SyntaxKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxKindName")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
}
