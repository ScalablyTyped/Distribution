package typings.oracleOraclejet.ojaccordionMod

import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAccordionSettableProperties extends baseComponentSettableProperties {
  var expanded: (js.Array[Double | Id | String]) | Null
  var multiple: Boolean
}

object ojAccordionSettableProperties {
  @scala.inline
  def apply(multiple: Boolean, expanded: js.Array[Double | Id | String] = null, translations: js.Object = null): ojAccordionSettableProperties = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAccordionSettableProperties]
  }
}

