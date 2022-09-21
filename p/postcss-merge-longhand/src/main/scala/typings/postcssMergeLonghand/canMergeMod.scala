package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canMergeMod {
  
  inline def apply(props: js.Array[Declaration]): Boolean = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(props: js.Array[Declaration], includeCustomProps: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], includeCustomProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("postcss-merge-longhand/types/lib/canMerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
