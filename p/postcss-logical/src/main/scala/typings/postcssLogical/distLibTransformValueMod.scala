package typings.postcssLogical

import typings.postcss.mod.Declaration
import typings.postcssLogical.distLibTypesMod.DirectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformValueMod {
  
  @JSImport("postcss-logical/dist/lib/transform-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformValue(config: DirectionConfig): js.Function1[/* declaration */ Declaration, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformValue")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, Boolean]]
}
