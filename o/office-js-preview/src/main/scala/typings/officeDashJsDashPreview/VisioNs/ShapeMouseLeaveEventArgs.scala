package typings.officeDashJsDashPreview.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape that raised the ShapeMouseLeave event.
  *
  * [Api set:  1.1]
  */
trait ShapeMouseLeaveEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page which has the shape object that raised the ShapeMouseLeave event.
    *
    * [Api set:  1.1]
    */
  var pageName: String
  /**
    *
    * Gets the name of the shape object that raised the ShapeMouseLeave event.
    *
    * [Api set:  1.1]
    */
  var shapeName: String
}

object ShapeMouseLeaveEventArgs {
  @scala.inline
  def apply(pageName: String, shapeName: String): ShapeMouseLeaveEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName, shapeName = shapeName)
  
    __obj.asInstanceOf[ShapeMouseLeaveEventArgs]
  }
}

