package typings.microsoftAjax.Sys.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
  */
@js.native
trait Point extends js.Object {
  //#endregion
  //#region Fields
  /**
    * Gets the x-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
    * @return A number that represents the x-coordinate of the Point object in pixels.
    */
  var x: Double = js.native
  /**
    * Gets the y-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
    * @return A number that represents the y-coordinate of the Point object in pixels.
    */
  var y: Double = js.native
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

