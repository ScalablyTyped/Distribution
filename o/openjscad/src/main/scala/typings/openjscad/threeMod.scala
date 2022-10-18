package typings.openjscad

import typings.openjscad.anon.BoundLen
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeMod {
  
  object CSG {
    
    @JSImport("three", "CSG")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCSG(csg: typings.openjscad.CSG, defaultColor: Any): BoundLen = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCSG")(csg.asInstanceOf[js.Any], defaultColor.asInstanceOf[js.Any])).asInstanceOf[BoundLen]
    
    inline def getGeometryVertex(geometry: Any, vertex_position: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryVertex")(geometry.asInstanceOf[js.Any], vertex_position.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /*
    function OrbitControls(object: any, domElement: any): void;
    function SpriteCanvasMaterial(parameters?: any): void;
    */
  trait ICanvasRendererOptions extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  }
  object ICanvasRendererOptions {
    
    inline def apply(): ICanvasRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasRendererOptions]
    }
    
    extension [Self <: ICanvasRendererOptions](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    }
  }
}
