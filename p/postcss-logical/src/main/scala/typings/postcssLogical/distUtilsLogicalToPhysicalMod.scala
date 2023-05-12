package typings.postcssLogical

import typings.postcssLogical.distLibTypesMod.DirectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLogicalToPhysicalMod {
  
  @JSImport("postcss-logical/dist/utils/logical-to-physical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logicalToPhysical(logical: String, config: DirectionConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalToPhysical")(logical.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
}
