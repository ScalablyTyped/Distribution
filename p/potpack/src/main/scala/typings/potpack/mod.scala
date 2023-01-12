package typings.potpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("potpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Packs 2D rectangles into a near-square container.
    *
    * Mutates the {@link boxes} array: it's sorted by height,
    * and box objects are augmented with `x`, `y` coordinates.
    */
  inline def default(boxes: js.Array[PotpackBox]): PotpackStats = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(boxes.asInstanceOf[js.Any]).asInstanceOf[PotpackStats]
  
  trait PotpackBox extends StObject {
    
    var h: Double
    
    var w: Double
    
    /**
      * X coordinate in the resulting container.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * Y coordinate in the resulting container.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object PotpackBox {
    
    inline def apply(h: Double, w: Double): PotpackBox = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotpackBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotpackBox] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PotpackStats extends StObject {
    
    /**
      * The space utilization value (0 to 1). Higher is better.
      */
    var fill: Double
    
    /**
      * Height of the resulting container.
      */
    var h: Double
    
    /**
      * Width of the resulting container.
      */
    var w: Double
  }
  object PotpackStats {
    
    inline def apply(fill: Double, h: Double, w: Double): PotpackStats = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotpackStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotpackStats] (val x: Self) extends AnyVal {
      
      inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
