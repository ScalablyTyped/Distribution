package typings.officeDashJs.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
trait ShapeViewLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
}

object ShapeViewLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, highlight: js.UndefOr[Boolean] = js.undefined): ShapeViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    __obj.asInstanceOf[ShapeViewLoadOptions]
  }
}

