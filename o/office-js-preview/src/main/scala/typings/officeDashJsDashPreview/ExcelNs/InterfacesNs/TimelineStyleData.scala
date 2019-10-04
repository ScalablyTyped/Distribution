package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `timelineStyle.toJSON()`. */
trait TimelineStyleData extends js.Object {
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether this TimelineStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object TimelineStyleData {
  @scala.inline
  def apply(name: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): TimelineStyleData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[TimelineStyleData]
  }
}

