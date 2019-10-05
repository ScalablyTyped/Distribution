package typings.officeDashJsDashPreview.Visio

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
  var pageName: String
  /**
    *
    * Gets the name of the shape object that raised the ShapeMouseEnter event.
    *
    * [Api set:  1.1]
    */
  var shapeName: String
}

object ShapeMouseEnterEventArgs {
  @scala.inline
  def apply(pageName: String, shapeName: String): ShapeMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName, shapeName = shapeName)
  
    __obj.asInstanceOf[ShapeMouseEnterEventArgs]
  }
}

