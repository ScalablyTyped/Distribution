package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Math {
  
  @js.native
  trait SinCosTable extends StObject {
    
    /**
      * The cosine value.
      */
    var cos: Double = js.native
    
    /**
      * The length.
      */
    var length: Double = js.native
    
    /**
      * The sine value.
      */
    var sin: Double = js.native
  }
  object SinCosTable {
    
    @scala.inline
    def apply(cos: Double, length: Double, sin: Double): SinCosTable = {
      val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinCosTable]
    }
    
    @scala.inline
    implicit class SinCosTableMutableBuilder[Self <: SinCosTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCos(value: Double): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSin(value: Double): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vector2Like extends StObject {
    
    /**
      * The x component.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The y component.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object Vector2Like {
    
    @scala.inline
    def apply(): Vector2Like = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vector2Like]
    }
    
    @scala.inline
    implicit class Vector2LikeMutableBuilder[Self <: Vector2Like] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
