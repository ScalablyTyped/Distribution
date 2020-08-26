package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonSettableProperties> */
@js.native
trait ojButtonSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var chroming: js.UndefOr[full | half | outlined] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var display: js.UndefOr[all | icons] = js.native
  var translations: js.UndefOr[js.Object | Null] = js.native
}

object ojButtonSettablePropertiesLenient {
  @scala.inline
  def apply(): ojButtonSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojButtonSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojButtonSettablePropertiesLenientOps[Self <: ojButtonSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setChroming(value: full | half | outlined): Self = this.set("chroming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChroming: Self = this.set("chroming", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplay(value: all | icons): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
  
}

