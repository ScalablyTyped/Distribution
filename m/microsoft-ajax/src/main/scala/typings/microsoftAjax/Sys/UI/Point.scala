package typings.microsoftAjax.Sys.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
  */
trait Point extends StObject {
  
  //#endregion
  //#region Fields
  /**
    * Gets the x-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
    * @return A number that represents the x-coordinate of the Point object in pixels.
    */
  var x: Double
  
  /**
    * Gets the y-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
    * @return A number that represents the y-coordinate of the Point object in pixels.
    */
  var y: Double
}
object Point {
  
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
