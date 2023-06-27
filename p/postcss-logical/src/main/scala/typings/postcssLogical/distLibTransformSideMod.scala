package typings.postcssLogical

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformSideMod {
  
  @JSImport("postcss-logical/dist/lib/transform-side", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformSide(prop: String, side: String): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSide")(prop.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
  
  inline def transformSideShorthand(prop: String, side: js.Tuple2[String, String]): js.Function1[/* declaration */ Declaration, js.Array[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSideShorthand")(prop.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* declaration */ Declaration, js.Array[Declaration]]]
}
