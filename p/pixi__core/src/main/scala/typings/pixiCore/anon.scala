package typings.pixiCore

import typings.pixiCore.libShaderUtilsGenerateUniformBufferSyncMod.UBOElement
import typings.pixiCore.libShaderUtilsGenerateUniformBufferSyncMod.UniformsSyncCallback
import typings.pixiCore.pixiCoreStrings.interleaved
import typings.pixiCore.pixiCoreStrings.separate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoDensity extends StObject {
    
    /**
      * {@link PIXI.IRendererOptions.autoDensity}
      * @default false
      * @memberof PIXI.settings.RENDER_OPTIONS
      */
    var autoDensity: Boolean
    
    /**
      * {@link PIXI.IRendererOptions.height}
      * @default 600
      * @memberof PIXI.settings.RENDER_OPTIONS
      */
    var height: Double
    
    /**
      * {@link PIXI.IRendererOptions.resolution}
      * @type {number}
      * @default PIXI.settings.RESOLUTION
      * @memberof PIXI.settings.RENDER_OPTIONS
      */
    var resolution: Double
    
    /**
      * {@link PIXI.IRendererOptions.width}
      * @default 800
      * @memberof PIXI.settings.RENDER_OPTIONS
      */
    var width: Double
  }
  object AutoDensity {
    
    inline def apply(autoDensity: Boolean, height: Double, resolution: Double, width: Double): AutoDensity = {
      val __obj = js.Dynamic.literal(autoDensity = autoDensity.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDensity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoDensity] (val x: Self) extends AnyVal {
      
      inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferMode extends StObject {
    
    var bufferMode: separate | interleaved
    
    var names: js.Array[String]
  }
  object BufferMode {
    
    inline def apply(bufferMode: separate | interleaved, names: js.Array[String]): BufferMode = {
      val __obj = js.Dynamic.literal(bufferMode = bufferMode.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferMode] (val x: Self) extends AnyVal {
      
      inline def setBufferMode(value: separate | interleaved): Self = StObject.set(x, "bufferMode", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  trait Fragment extends StObject {
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var vertex: js.UndefOr[String] = js.undefined
  }
  object Fragment {
    
    inline def apply(): Fragment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Double
    
    var uboElements: js.Array[UBOElement]
  }
  object Size {
    
    inline def apply(size: Double, uboElements: js.Array[UBOElement]): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], uboElements = uboElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUboElements(value: js.Array[UBOElement]): Self = StObject.set(x, "uboElements", value.asInstanceOf[js.Any])
      
      inline def setUboElementsVarargs(value: UBOElement*): Self = StObject.set(x, "uboElements", js.Array(value*))
    }
  }
  
  trait SyncFunc extends StObject {
    
    var size: Double
    
    def syncFunc(args: Any*): Unit
    @JSName("syncFunc")
    var syncFunc_Original: UniformsSyncCallback
  }
  object SyncFunc {
    
    inline def apply(size: Double, syncFunc: UniformsSyncCallback): SyncFunc = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], syncFunc = syncFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncFunc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncFunc] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSyncFunc(value: UniformsSyncCallback): Self = StObject.set(x, "syncFunc", value.asInstanceOf[js.Any])
    }
  }
}
