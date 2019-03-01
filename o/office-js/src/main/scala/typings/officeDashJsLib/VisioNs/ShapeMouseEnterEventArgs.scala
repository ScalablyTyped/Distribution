package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the ShapeMouseEnter event.
  *
  * [Api set:  1.1]
  */
trait ShapeMouseEnterEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page which has the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var pageName: java.lang.String
  /**
    *
    * Gets the name of the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var shapeName: java.lang.String
}

object ShapeMouseEnterEventArgs {
  @scala.inline
  def apply(pageName: java.lang.String, shapeName: java.lang.String): ShapeMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pageName")(pageName)
    __obj.updateDynamic("shapeName")(shapeName)
    __obj.asInstanceOf[ShapeMouseEnterEventArgs]
  }
}

