package typings.postcssLogical

import typings.postcss.mod.Declaration
import typings.postcss.mod.Postcss
import typings.postcssLogical.distLibTypesMod.TransformFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformTransitionMod {
  
  @JSImport("postcss-logical/dist/lib/transform-transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformTransition(declaration: Declaration, postcss: Postcss, transforms: Record[String, TransformFunction | Null]): js.Array[Declaration] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformTransition")(declaration.asInstanceOf[js.Any], postcss.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[js.Array[Declaration]]
}
