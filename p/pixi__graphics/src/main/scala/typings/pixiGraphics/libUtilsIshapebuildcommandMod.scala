package typings.pixiGraphics

import typings.pixiGraphics.libGraphicsDataMod.GraphicsData
import typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsIshapebuildcommandMod {
  
  trait IShapeBuildCommand extends StObject {
    
    def build(graphicsData: GraphicsData): Unit
    
    def triangulate(graphicsData: GraphicsData, target: GraphicsGeometry): Unit
  }
  object IShapeBuildCommand {
    
    inline def apply(build: GraphicsData => Unit, triangulate: (GraphicsData, GraphicsGeometry) => Unit): IShapeBuildCommand = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), triangulate = js.Any.fromFunction2(triangulate))
      __obj.asInstanceOf[IShapeBuildCommand]
    }
    
    extension [Self <: IShapeBuildCommand](x: Self) {
      
      inline def setBuild(value: GraphicsData => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      inline def setTriangulate(value: (GraphicsData, GraphicsGeometry) => Unit): Self = StObject.set(x, "triangulate", js.Any.fromFunction2(value))
    }
  }
}
