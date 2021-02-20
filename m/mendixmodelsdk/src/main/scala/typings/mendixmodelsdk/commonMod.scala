package typings.mendixmodelsdk

import typings.mendixmodelsdk.deltasDeltasMod._PrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  object common {
    
    /**
      * Callback interface returning data of some type `T`.
      */
    type ICallback[T] = js.Function1[/* data */ T, Unit]
    
    /**
      * Representation of an RGB color.
      */
    @js.native
    trait IColor extends _PrimitiveValue {
      
      var blue: Double = js.native
      
      var green: Double = js.native
      
      var red: Double = js.native
    }
    object IColor {
      
      @scala.inline
      def apply(blue: Double, green: Double, red: Double): IColor = {
        val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
        __obj.asInstanceOf[IColor]
      }
      
      @scala.inline
      implicit class IColorMutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Callback interface returning an error at most.
      */
    type IErrorCallback = js.Function1[/* err */ js.Any, Unit]
    
    /**
      * Representation of a point.
      */
    @js.native
    trait IPoint extends _PrimitiveValue {
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    object IPoint {
      
      @scala.inline
      def apply(x: Double, y: Double): IPoint = {
        val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPoint]
      }
      
      @scala.inline
      implicit class IPointMutableBuilder[Self <: IPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Representation of a size, e.g. of an entity box.
      */
    @js.native
    trait ISize extends _PrimitiveValue {
      
      var height: Double = js.native
      
      var width: Double = js.native
    }
    object ISize {
      
      @scala.inline
      def apply(height: Double, width: Double): ISize = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISize]
      }
      
      @scala.inline
      implicit class ISizeMutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Callback interface returning nothing, not even an error.
      */
    type IVoidCallback = js.Function0[Unit]
  }
}
