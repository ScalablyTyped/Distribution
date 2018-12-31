package typings
package microsoftDashAjaxLib.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an object that contains a set of integer coordinates representing position, width, and height.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397698(v=vs.100).aspx}
  */
@JSGlobal("Sys.UI.Bounds")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the Sys.UI.Bounds class.
  */
class Bounds () extends js.Object {
  //#endregion
  //#region Fields
  /**
    * Gets the height of an object in pixels. This property is read-only.
    * @return A number that represents the height of an object in pixels.
    */
  var height: scala.Double = js.native
  /**
    * Gets the width of an object in pixels. This property is read-only.
    * @return A number that represents the width of an object in pixels.
    */
  var width: scala.Double = js.native
  /**
    * Gets the x-coordinate of an object in pixels.
    * @return A number that represents the x-coordinate of an object in pixels.
    */
  var x: scala.Double = js.native
  /**
    * Gets the y-coordinate of anobject in pixels.
    * @return A number that represents the y-coordinate of an object in pixels.
    */
  var y: scala.Double = js.native
}

