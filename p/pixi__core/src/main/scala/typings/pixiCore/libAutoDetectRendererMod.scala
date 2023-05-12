package typings.pixiCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.pixiColor.libColorMod.ColorSource
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libIrendererMod.IRendererOptions
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.Partial
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAutoDetectRendererMod {
  
  @JSImport("@pixi/core/lib/autoDetectRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoDetectRenderer[VIEW /* <: ICanvas */](): IRenderer[VIEW] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[IRenderer[VIEW]]
  inline def autoDetectRenderer[VIEW /* <: ICanvas */](options: Partial[IRendererOptionsAuto]): IRenderer[VIEW] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[IRenderer[VIEW]]
  
  @js.native
  trait IRendererConstructor[VIEW /* <: ICanvas */]
    extends StObject
       with Instantiable0[IRenderer[VIEW]]
       with Instantiable1[/* options */ Partial[IRendererOptionsAuto], IRenderer[VIEW]] {
    
    def test(): Boolean = js.native
    def test(options: Partial[IRendererOptionsAuto]): Boolean = js.native
  }
  
  trait IRendererOptionsAuto
    extends StObject
       with IRendererOptions {
    
    /**
      * Force CanvasRenderer even if WebGL is supported. Only available with **pixi.js-legacy**.
      * @default false
      */
    var forceCanvas: js.UndefOr[Boolean] = js.undefined
  }
  object IRendererOptionsAuto {
    
    inline def apply(
      antialias: Boolean,
      backgroundAlpha: Double,
      backgroundColor: ColorSource,
      clearBeforeRender: Boolean,
      hello: Boolean,
      powerPreference: WebGLPowerPreference,
      premultipliedAlpha: Boolean,
      preserveDrawingBuffer: Boolean
    ): IRendererOptionsAuto = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], hello = hello.asInstanceOf[js.Any], powerPreference = powerPreference.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], context = null)
      __obj.asInstanceOf[IRendererOptionsAuto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRendererOptionsAuto] (val x: Self) extends AnyVal {
      
      inline def setForceCanvas(value: Boolean): Self = StObject.set(x, "forceCanvas", value.asInstanceOf[js.Any])
      
      inline def setForceCanvasUndefined: Self = StObject.set(x, "forceCanvas", js.undefined)
    }
  }
}
