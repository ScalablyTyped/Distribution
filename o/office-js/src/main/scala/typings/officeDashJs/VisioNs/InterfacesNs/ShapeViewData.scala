package typings.officeDashJs.VisioNs.InterfacesNs

import typings.officeDashJs.VisioNs.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeView.toJSON()". */
trait ShapeViewData extends js.Object {
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.undefined
}

object ShapeViewData {
  @scala.inline
  def apply(highlight: Highlight = null): ShapeViewData = {
    val __obj = js.Dynamic.literal()
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    __obj.asInstanceOf[ShapeViewData]
  }
}

