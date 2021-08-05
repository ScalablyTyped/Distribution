package typings.opentypeJs

import typings.opentypeJs.mod.PathCommand
import typings.opentypeJs.opentypeJsStrings.C
import typings.opentypeJs.opentypeJsStrings.L
import typings.opentypeJs.opentypeJsStrings.M
import typings.opentypeJs.opentypeJsStrings.Q
import typings.opentypeJs.opentypeJsStrings.Z
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with PathCommand {
    
    var `type`: Z
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Z")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setType(value: Z): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LowMemory extends StObject {
    
    var lowMemory: Boolean
  }
  object LowMemory {
    
    inline def apply(lowMemory: Boolean): LowMemory = {
      val __obj = js.Dynamic.literal(lowMemory = lowMemory.asInstanceOf[js.Any])
      __obj.asInstanceOf[LowMemory]
    }
    
    extension [Self <: LowMemory](x: Self) {
      
      inline def setLowMemory(value: Boolean): Self = StObject.set(x, "lowMemory", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with PathCommand {
    
    var `type`: M
    
    var x: Double
    
    var y: Double
  }
  object Type {
    
    inline def apply(x: Double, y: Double): Type = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("M")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: M): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X
    extends StObject
       with PathCommand {
    
    var `type`: L
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("L")
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setType(value: L): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X1
    extends StObject
       with PathCommand {
    
    var `type`: C
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object X1 {
    
    inline def apply(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): X1 = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("C")
      __obj.asInstanceOf[X1]
    }
    
    extension [Self <: X1](x: Self) {
      
      inline def setType(value: C): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y
    extends StObject
       with PathCommand {
    
    var `type`: Q
    
    var x: Double
    
    var x1: Double
    
    var y: Double
    
    var y1: Double
  }
  object Y {
    
    inline def apply(x: Double, x1: Double, y: Double, y1: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Q")
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setType(value: Q): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    }
  }
}
