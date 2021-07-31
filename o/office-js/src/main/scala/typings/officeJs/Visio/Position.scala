package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Position of the object in the view.
  *
  * [Api set:  1.1]
  */
trait Position extends StObject {
  
  /**
    *
    * An integer that specifies the x-coordinate of the object, which is the signed value of the distance in pixels from the viewport's center to the left boundary of the page.
    *
    * [Api set:  1.1]
    */
  var x: Double
  
  /**
    *
    * An integer that specifies the y-coordinate of the object, which is the signed value of the distance in pixels from the viewport's center to the top boundary of the page.
    *
    * [Api set:  1.1]
    */
  var y: Double
}
object Position {
  
  @scala.inline
  def apply(x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
