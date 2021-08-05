package typings.microsoftAjax.Sys.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates an object that contains a set of integer coordinates representing position, width, and height.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397698(v=vs.100).aspx}
  */
trait Bounds extends StObject {
  
  //#endregion
  //#region Fields
  /**
    * Gets the height of an object in pixels. This property is read-only.
    * @return A number that represents the height of an object in pixels.
    */
  var height: Double
  
  /**
    * Gets the width of an object in pixels. This property is read-only.
    * @return A number that represents the width of an object in pixels.
    */
  var width: Double
  
  /**
    * Gets the x-coordinate of an object in pixels.
    * @return A number that represents the x-coordinate of an object in pixels.
    */
  var x: Double
  
  /**
    * Gets the y-coordinate of anobject in pixels.
    * @return A number that represents the y-coordinate of an object in pixels.
    */
  var y: Double
}
object Bounds {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
