package typings.pixiCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libIrendererMod.IRendererOptions
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAutoDetectRendererMod {
  
  @JSImport("@pixi/core/lib/autoDetectRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoDetectRenderer[VIEW /* <: ICanvas */](): IRenderer[VIEW] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[IRenderer[VIEW]]
  inline def autoDetectRenderer[VIEW /* <: ICanvas */](options: IRendererOptionsAuto): IRenderer[VIEW] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[IRenderer[VIEW]]
  
  @js.native
  trait IRendererConstructor[VIEW /* <: ICanvas */]
    extends StObject
       with Instantiable0[IRenderer[VIEW]]
       with Instantiable1[/* options */ IRendererOptionsAuto, IRenderer[VIEW]] {
    
    def test(): Boolean = js.native
    def test(options: IRendererOptionsAuto): Boolean = js.native
  }
  
  trait IRendererOptionsAuto
    extends StObject
       with IRendererOptions {
    
    var forceCanvas: js.UndefOr[Boolean] = js.undefined
  }
  object IRendererOptionsAuto {
    
    inline def apply(): IRendererOptionsAuto = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRendererOptionsAuto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRendererOptionsAuto] (val x: Self) extends AnyVal {
      
      inline def setForceCanvas(value: Boolean): Self = StObject.set(x, "forceCanvas", value.asInstanceOf[js.Any])
      
      inline def setForceCanvasUndefined: Self = StObject.set(x, "forceCanvas", js.undefined)
    }
  }
}
