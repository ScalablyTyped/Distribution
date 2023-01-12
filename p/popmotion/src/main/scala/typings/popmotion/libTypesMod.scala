package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.popmotion.libTypesMod.Point2D
    - typings.popmotion.libTypesMod.Point3D
  */
  trait Point extends StObject
  object Point {
    
    inline def Point2D(x: Double, y: Double): typings.popmotion.libTypesMod.Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.popmotion.libTypesMod.Point2D]
    }
    
    inline def Point3D(x: Double, y: Double, z: Double): typings.popmotion.libTypesMod.Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.popmotion.libTypesMod.Point3D]
    }
  }
  
  trait Point2D
    extends StObject
       with Point {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    inline def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point2D] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.popmotion.libTypesMod.Point because Already inherited */ trait Point3D
    extends StObject
       with Point2D {
    
    var z: Double
  }
  object Point3D {
    
    inline def apply(x: Double, y: Double, z: Double): Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point3D]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point3D] (val x: Self) extends AnyVal {
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
