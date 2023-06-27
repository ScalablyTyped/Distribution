package typings.postcssLogical

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformOffsetMod {
  
  @JSImport("postcss-logical/dist/lib/transform-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformOffset(prop: String): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformOffset")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  
  inline def transformOffsetShorthand(side: js.Tuple2[String, String]): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformOffsetShorthand")(side.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
}
