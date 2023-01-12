package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod._PrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommonMod {
  
  object common {
    
    /**
      * Callback interface returning data of some type `T`.
      */
    type ICallback[T] = js.Function1[/* data */ T, Unit]
    
    /**
      * Representation of an RGB color.
      */
    trait IColor
      extends StObject
         with _PrimitiveValue {
      
      var blue: Double
      
      var green: Double
      
      var red: Double
    }
    object IColor {
      
      inline def apply(blue: Double, green: Double, red: Double): IColor = {
        val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
        __obj.asInstanceOf[IColor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
        
        inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Callback interface returning an error at most.
      */
    type IErrorCallback = js.Function1[/* err */ Any, Unit]
    
    /**
      * Representation of a point.
      */
    trait IPoint
      extends StObject
         with _PrimitiveValue {
      
      var x: Double
      
      var y: Double
    }
    object IPoint {
      
      inline def apply(x: Double, y: Double): IPoint = {
        val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPoint]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Representation of a size, e.g. of an entity box.
      */
    trait ISize
      extends StObject
         with _PrimitiveValue {
      
      var height: Double
      
      var width: Double
    }
    object ISize {
      
      inline def apply(height: Double, width: Double): ISize = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISize]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Callback interface returning nothing, not even an error.
      */
    type IVoidCallback = js.Function0[Unit]
  }
}
