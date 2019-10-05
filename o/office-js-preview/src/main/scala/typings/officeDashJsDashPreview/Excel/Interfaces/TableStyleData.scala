package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableStyle.toJSON()`. */
trait TableStyleData extends js.Object {
  /**
    *
    * Gets the name of the TableStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether this TableStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object TableStyleData {
  @scala.inline
  def apply(name: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): TableStyleData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[TableStyleData]
  }
}

