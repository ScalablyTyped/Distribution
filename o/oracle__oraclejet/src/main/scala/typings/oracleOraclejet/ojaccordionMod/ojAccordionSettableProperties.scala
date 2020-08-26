package typings.oracleOraclejet.ojaccordionMod

import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordionSettableProperties extends baseComponentSettableProperties {
  var expanded: (js.Array[Double | Id | String]) | Null = js.native
  var multiple: Boolean = js.native
}

object ojAccordionSettableProperties {
  @scala.inline
  def apply(multiple: Boolean): ojAccordionSettableProperties = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojAccordionSettableProperties]
  }
  @scala.inline
  implicit class ojAccordionSettablePropertiesOps[Self <: ojAccordionSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedVarargs(value: (Double | Id | String)*): Self = this.set("expanded", js.Array(value :_*))
    @scala.inline
    def setExpanded(value: js.Array[Double | Id | String]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedNull: Self = this.set("expanded", null)
  }
  
}

