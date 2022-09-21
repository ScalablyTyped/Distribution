package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeValuesMod {
  
  inline def apply(rules: Declaration*): String = ^.asInstanceOf[js.Dynamic].apply(rules.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("postcss-merge-longhand/types/lib/mergeValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
