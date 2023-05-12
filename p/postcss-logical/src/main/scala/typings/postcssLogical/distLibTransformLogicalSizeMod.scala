package typings.postcssLogical

import typings.postcss.mod.Declaration
import typings.postcssLogical.distLibTypesMod.DirectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformLogicalSizeMod {
  
  @JSImport("postcss-logical/dist/lib/transform-logical-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformLogicalSize(directionConfig: DirectionConfig): js.Function1[/* declaration */ Declaration, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformLogicalSize")(directionConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, Boolean]]
}
