package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the shape collection that raised the SelectionChanged event.
  *
  * [Api set:  1.1]
  */
trait SelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page which has the ShapeCollection object that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var pageName: java.lang.String
  /**
    *
    * Gets the array of shape names that raised the SelectionChanged event.
    *
    * [Api set:  1.1]
    */
  var shapeNames: js.Array[java.lang.String]
}

object SelectionChangedEventArgs {
  @scala.inline
  def apply(pageName: java.lang.String, shapeNames: js.Array[java.lang.String]): SelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName, shapeNames = shapeNames)
  
    __obj.asInstanceOf[SelectionChangedEventArgs]
  }
}

