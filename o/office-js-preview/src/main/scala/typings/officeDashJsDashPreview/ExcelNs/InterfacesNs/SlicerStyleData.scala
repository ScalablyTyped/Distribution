package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "slicerStyle.toJSON()". */
trait SlicerStyleData extends js.Object {
  /**
    *
    * Gets the name of the SlicerStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if this SlicerStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object SlicerStyleData {
  @scala.inline
  def apply(name: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): SlicerStyleData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[SlicerStyleData]
  }
}

