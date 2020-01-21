package typings.officeJsPreview.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Position of the object in the view.
  *
  * [Api set:  1.1]
  */
trait Position extends js.Object {
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
}

