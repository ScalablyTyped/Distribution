package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Math {
  
  trait SinCosTable extends StObject {
    
    /**
      * The cosine value.
      */
    var cos: Double
    
    /**
      * The length.
      */
    var length: Double
    
    /**
      * The sine value.
      */
    var sin: Double
  }
  object SinCosTable {
    
    inline def apply(cos: Double, length: Double, sin: Double): SinCosTable = {
      val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinCosTable]
    }
    
    extension [Self <: SinCosTable](x: Self) {
      
      inline def setCos(value: Double): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSin(value: Double): Self = StObject.set(x, "sin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vector2Like extends StObject {
    
    /**
      * The x component.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The y component.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object Vector2Like {
    
    inline def apply(): Vector2Like = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vector2Like]
    }
    
    extension [Self <: Vector2Like](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
