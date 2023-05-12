package typings.mirada

import typings.mirada.distSrcTypesOpencvMod.Mat
import typings.mirada.distSrcTypesOpencvMod.Rect
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserCanvasRenderMod {
  
  @JSImport("mirada/dist/src/browser/canvasRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderArrayBufferInCanvas(a: js.typedarray.ArrayBuffer, mime: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArrayBufferInCanvas")(a.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def renderArrayBufferInCanvas(a: js.typedarray.ArrayBuffer, mime: String, options: ABOptions): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArrayBufferInCanvas")(a.asInstanceOf[js.Any], mime.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def renderInCanvas(mat: Mat): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderInCanvas")(mat.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  inline def renderInCanvas(mat: Mat, options: Options): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("renderInCanvas")(mat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def renderSvgInCanvas(svg: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSvgInCanvas")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def renderSvgInCanvas(svg: String, options: ABOptions): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSvgInCanvas")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  trait ABOptions extends StObject {
    
    var appendToBody: js.UndefOr[Boolean] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ABOptions {
    
    inline def apply(): ABOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ABOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ABOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
      
      inline def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var appendToBody: js.UndefOr[Boolean] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var forceSameSize: js.UndefOr[Boolean] = js.undefined
    
    var region: js.UndefOr[Rect] = js.undefined
    
    var rgba: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
      
      inline def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setForceSameSize(value: Boolean): Self = StObject.set(x, "forceSameSize", value.asInstanceOf[js.Any])
      
      inline def setForceSameSizeUndefined: Self = StObject.set(x, "forceSameSize", js.undefined)
      
      inline def setRegion(value: Rect): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRgba(value: Boolean): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
      
      inline def setRgbaUndefined: Self = StObject.set(x, "rgba", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var canvas: HTMLCanvasElement
    
    var height: Double
    
    var width: Double
  }
  object Result {
    
    inline def apply(canvas: HTMLCanvasElement, height: Double, width: Double): Result = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
