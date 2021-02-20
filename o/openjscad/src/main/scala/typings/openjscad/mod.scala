package typings.openjscad

import typings.openjscad.anon.BoundLen
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CSG {
    
    @JSImport("three", "CSG.fromCSG")
    @js.native
    def fromCSG(csg: typings.openjscad.CSG, defaultColor: js.Any): BoundLen = js.native
    
    @JSImport("three", "CSG.getGeometryVertex")
    @js.native
    def getGeometryVertex(geometry: js.Any, vertex_position: js.Any): Double = js.native
  }
  
  /*
    function OrbitControls(object: any, domElement: any): void;
    function SpriteCanvasMaterial(parameters?: any): void;
    */
  @js.native
  trait ICanvasRendererOptions extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.native
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  }
  object ICanvasRendererOptions {
    
    @scala.inline
    def apply(): ICanvasRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasRendererOptions]
    }
    
    @scala.inline
    implicit class ICanvasRendererOptionsMutableBuilder[Self <: ICanvasRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    }
  }
}
