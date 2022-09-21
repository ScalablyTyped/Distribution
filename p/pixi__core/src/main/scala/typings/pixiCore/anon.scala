package typings.pixiCore

import org.scalablytyped.runtime.Instantiable1
import typings.pixiCore.mod.AbstractBatchRenderer
import typings.pixiCore.mod.BatchDrawCall
import typings.pixiCore.mod.BatchTextureArray
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.UBOElement
import typings.pixiCore.mod.UniformsSyncCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    extension [Self <: Height](x: Self) {
      
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
    
    extension [Self <: Size](x: Self) {
      
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
    
    extension [Self <: SyncFunc](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSyncFunc(value: UniformsSyncCallback): Self = StObject.set(x, "syncFunc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofAbstractBatchRender
    extends StObject
       with Instantiable1[/* renderer */ Renderer, AbstractBatchRenderer] {
    
    /**
      * Pool of `BatchDrawCall` objects that `flush` used
      * to create "batches" of the objects being rendered.
      *
      * These are never re-allocated again.
      * Shared between all batch renderers because it can be only one "flush" working at the moment.
      * @member {PIXI.BatchDrawCall[]}
      */
    var _drawCallPool: js.Array[BatchDrawCall] = js.native
    
    /**
      * Pool of `BatchDrawCall` objects that `flush` used
      * to create "batches" of the objects being rendered.
      *
      * These are never re-allocated again.
      * Shared between all batch renderers because it can be only one "flush" working at the moment.
      * @member {PIXI.BatchTextureArray[]}
      */
    var _textureArrayPool: js.Array[BatchTextureArray] = js.native
  }
}
