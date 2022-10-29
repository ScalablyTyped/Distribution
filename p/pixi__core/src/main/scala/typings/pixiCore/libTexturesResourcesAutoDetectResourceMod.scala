package typings.pixiCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesAutoDetectResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/autoDetectResource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/core/lib/textures/resources/autoDetectResource", "INSTALLED")
  @js.native
  val INSTALLED: js.Array[IResourcePlugin[Any, Any]] = js.native
  
  inline def autoDetectResource[R /* <: Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def autoDetectResource[R /* <: Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiMath.mod.ISize
    - typings.pixiCore.libTexturesResourcesCubeResourceMod.ICubeResourceOptions
    - typings.pixiCore.libTexturesResourcesImageResourceMod.IImageResourceOptions
    - typings.pixiCore.libTexturesResourcesSvgresourceMod.ISVGResourceOptions
    - typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptions
    - typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IResourcePluginOptions
  */
  type IAutoDetectOptions = _IAutoDetectOptions | ISize | IResourcePluginOptions
  
  @js.native
  trait IResourcePlugin[R, RO]
    extends StObject
       with Instantiable1[/* source */ Any, R]
       with Instantiable2[/* source */ Any, /* options */ RO, R] {
    
    def test(source: Any, `extension`: String): Boolean = js.native
  }
  
  type IResourcePluginOptions = StringDictionary[Any]
  
  trait _IAutoDetectOptions extends StObject
  object _IAutoDetectOptions {
    
    inline def ICubeResourceOptions(height: Double, width: Double): typings.pixiCore.libTexturesResourcesCubeResourceMod.ICubeResourceOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pixiCore.libTexturesResourcesCubeResourceMod.ICubeResourceOptions]
    }
    
    inline def IImageResourceOptions(): typings.pixiCore.libTexturesResourcesImageResourceMod.IImageResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pixiCore.libTexturesResourcesImageResourceMod.IImageResourceOptions]
    }
    
    inline def ISVGResourceOptions(): typings.pixiCore.libTexturesResourcesSvgresourceMod.ISVGResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pixiCore.libTexturesResourcesSvgresourceMod.ISVGResourceOptions]
    }
    
    inline def IVideoResourceOptions(): typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptions]
    }
  }
}
