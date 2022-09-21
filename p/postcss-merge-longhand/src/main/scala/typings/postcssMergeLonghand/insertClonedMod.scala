package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import typings.postcss.mod.Rule_
import typings.postcssMergeLonghand.anon.PartialDeclarationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertClonedMod {
  
  inline def apply(rule: Rule_, decl: Declaration): Declaration = (^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any], decl.asInstanceOf[js.Any])).asInstanceOf[Declaration]
  inline def apply(rule: Rule_, decl: Declaration, props: PartialDeclarationProps): Declaration = (^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Declaration]
  
  @JSImport("postcss-merge-longhand/types/lib/insertCloned", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
