package typings.oracleOraclejet.ojmenuMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaFocusSkipLink
import typings.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmenu.ojMenuSettableProperties> */
@js.native
trait ojMenuSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.native
  var openOptions: js.UndefOr[OpenOptions] = js.native
  var translations: js.UndefOr[AriaFocusSkipLink] = js.native
}

object ojMenuSettablePropertiesLenient {
  @scala.inline
  def apply(): ojMenuSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMenuSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojMenuSettablePropertiesLenientOps[Self <: ojMenuSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOpenOptions(value: OpenOptions): Self = this.set("openOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOptions: Self = this.set("openOptions", js.undefined)
    @scala.inline
    def setTranslations(value: AriaFocusSkipLink): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

