package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttRowSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var label: java.lang.String
  var labelStyle: js.Object
}

object ojGanttRowSettableProperties {
  @scala.inline
  def apply(label: java.lang.String, labelStyle: js.Object): ojGanttRowSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.asInstanceOf[ojGanttRowSettableProperties]
  }
}

