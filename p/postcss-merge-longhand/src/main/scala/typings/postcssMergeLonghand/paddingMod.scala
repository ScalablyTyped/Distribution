package typings.postcssMergeLonghand

import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingMod {
  
  @JSImport("postcss-merge-longhand/types/lib/decl/padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def explode(rule: Rule_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("explode")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def merge(rule: Rule_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
