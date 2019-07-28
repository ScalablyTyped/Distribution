package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single stroke of ink.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkStrokeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ID of the InkStroke object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
}

object InkStrokeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    floatingInk: FloatingInkLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined
  ): InkStrokeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (floatingInk != null) __obj.updateDynamic("floatingInk")(floatingInk)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[InkStrokeLoadOptions]
  }
}

