package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttRowSettableProperties extends JetSettableProperties {
  var label: String
  var labelStyle: js.Object
}

object ojGanttRowSettableProperties {
  @scala.inline
  def apply(label: String, labelStyle: js.Object): ojGanttRowSettableProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojGanttRowSettableProperties]
  }
}

