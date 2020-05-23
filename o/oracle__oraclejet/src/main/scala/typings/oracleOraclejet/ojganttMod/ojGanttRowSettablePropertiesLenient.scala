package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttRowSettableProperties> */
trait ojGanttRowSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
}

object ojGanttRowSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    label: String = null,
    labelStyle: js.Object = null
  ): ojGanttRowSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttRowSettablePropertiesLenient]
  }
}

