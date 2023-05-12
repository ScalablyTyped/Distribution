package typings.postcssLogical

import typings.postcssLogical.distLibTypesMod.Axes
import typings.postcssLogical.distLibTypesMod.DirectionFlow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsDirectionFlowToAxesMod {
  
  @JSImport("postcss-logical/dist/utils/direction-flow-to-axes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def directionFlowToAxes(directionFlow: DirectionFlow): js.Tuple2[Axes, Axes] = ^.asInstanceOf[js.Dynamic].applyDynamic("directionFlowToAxes")(directionFlow.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Axes, Axes]]
}
