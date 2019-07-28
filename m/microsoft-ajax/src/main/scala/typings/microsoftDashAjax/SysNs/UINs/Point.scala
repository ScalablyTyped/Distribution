package typings.microsoftDashAjax.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
  */
@JSGlobal("Sys.UI.Point")
@js.native
class Point protected () extends js.Object {
  //#region Constructors
  /**
    * Creates an object that contains a set of integer coordinates that represent a position.
    * @param x The number of pixels between the location and the left edge of the parent frame.
    * @param y The number of pixels between the location and the top edge of the parent frame.
    */
  def this(x: Double, y: Double) = this()
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

