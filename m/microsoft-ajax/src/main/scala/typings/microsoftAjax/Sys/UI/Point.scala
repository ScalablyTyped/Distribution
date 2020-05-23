package typings.microsoftAjax.Sys.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
  */
trait Point extends js.Object {
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
}

