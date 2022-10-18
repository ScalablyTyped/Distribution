package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibHasAllPropsMod {
  
  inline def apply(rule: js.Array[Declaration], props: String*): Boolean = ^.asInstanceOf[js.Dynamic].apply(scala.List(rule.asInstanceOf[js.Any]).`++`(props.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  @JSImport("postcss-merge-longhand/types/lib/hasAllProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
