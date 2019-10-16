package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  container  :std.Partial<react.react.CSSProperties>,   basic  :std.Partial<react.react.CSSProperties>,   chip  :std.Partial<react.react.CSSProperties>,   table  :std.Partial<react.react.CSSProperties>,   tableCell  :std.Partial<react.react.CSSProperties>}> */
trait PartialcontainerPartialCSSPropertiesbasicPartialCS extends js.Object {
  var basic: js.UndefOr[PartialCSSProperties] = js.undefined
  var chip: js.UndefOr[PartialCSSProperties] = js.undefined
  var container: js.UndefOr[PartialCSSProperties] = js.undefined
  var table: js.UndefOr[PartialCSSProperties] = js.undefined
  var tableCell: js.UndefOr[PartialCSSProperties] = js.undefined
}

object PartialcontainerPartialCSSPropertiesbasicPartialCS {
  @scala.inline
  def apply(
    basic: PartialCSSProperties = null,
    chip: PartialCSSProperties = null,
    container: PartialCSSProperties = null,
    table: PartialCSSProperties = null,
    tableCell: PartialCSSProperties = null
  ): PartialcontainerPartialCSSPropertiesbasicPartialCS = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic)
    if (chip != null) __obj.updateDynamic("chip")(chip)
    if (container != null) __obj.updateDynamic("container")(container)
    if (table != null) __obj.updateDynamic("table")(table)
    if (tableCell != null) __obj.updateDynamic("tableCell")(tableCell)
    __obj.asInstanceOf[PartialcontainerPartialCSSPropertiesbasicPartialCS]
  }
}

