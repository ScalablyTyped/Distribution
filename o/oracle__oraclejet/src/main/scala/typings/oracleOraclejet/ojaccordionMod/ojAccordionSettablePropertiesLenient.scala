package typings.oracleOraclejet.ojaccordionMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojaccordion.ojAccordionSettableProperties> */
@js.native
trait ojAccordionSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var expanded: js.UndefOr[(js.Array[Double | Id | String]) | Null] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[js.Object | Null] = js.native
}

object ojAccordionSettablePropertiesLenient {
  @scala.inline
  def apply(): ojAccordionSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojAccordionSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojAccordionSettablePropertiesLenientOps[Self <: ojAccordionSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setExpandedVarargs(value: (Double | Id | String)*): Self = this.set("expanded", js.Array(value :_*))
    @scala.inline
    def setExpanded(value: js.Array[Double | Id | String]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExpandedNull: Self = this.set("expanded", null)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
  
}

