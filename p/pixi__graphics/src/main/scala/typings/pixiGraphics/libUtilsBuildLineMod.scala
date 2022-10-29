package typings.pixiGraphics

import typings.pixiGraphics.libGraphicsDataMod.GraphicsData
import typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsBuildLineMod {
  
  @JSImport("@pixi/graphics/lib/utils/buildLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildLine(graphicsData: GraphicsData, graphicsGeometry: GraphicsGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLine")(graphicsData.asInstanceOf[js.Any], graphicsGeometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
