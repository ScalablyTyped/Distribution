package typings
package atOracleOraclejetLib.ojaccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAccordionSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var expanded: js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[atOracleOraclejetLib.Anon_Id] | scala.Null
  var multiple: scala.Boolean
}

object ojAccordionSettableProperties {
  @scala.inline
  def apply(
    multiple: scala.Boolean,
    expanded: js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[atOracleOraclejetLib.Anon_Id] = null,
    translations: js.Object = null
  ): ojAccordionSettableProperties = {
    val __obj = js.Dynamic.literal(multiple = multiple)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojAccordionSettableProperties]
  }
}

