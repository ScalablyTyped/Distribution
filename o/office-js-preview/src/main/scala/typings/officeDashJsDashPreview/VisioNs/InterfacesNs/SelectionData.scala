package typings.officeDashJsDashPreview.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "selection.toJSON()". */
trait SelectionData extends js.Object {
  /**
    *
    * Gets the Shapes of the Selection. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object SelectionData {
  @scala.inline
  def apply(shapes: js.Array[ShapeData] = null): SelectionData = {
    val __obj = js.Dynamic.literal()
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    __obj.asInstanceOf[SelectionData]
  }
}

