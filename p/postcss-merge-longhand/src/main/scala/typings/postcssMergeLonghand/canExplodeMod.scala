package typings.postcssMergeLonghand

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canExplodeMod {
  
  inline def apply(prop: Declaration): Boolean = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(prop: Declaration, includeCustomProps: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any], includeCustomProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("postcss-merge-longhand/types/lib/canExplode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
