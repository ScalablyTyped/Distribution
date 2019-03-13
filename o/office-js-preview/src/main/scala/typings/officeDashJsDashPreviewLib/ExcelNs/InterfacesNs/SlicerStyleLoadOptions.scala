package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Slicer Style, which defines style elements by region of the slicer.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait SlicerStyleLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the name of the SlicerStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True means that this SlicerStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object SlicerStyleLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): SlicerStyleLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[SlicerStyleLoadOptions]
  }
}

