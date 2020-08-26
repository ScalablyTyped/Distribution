package typings.oracleOraclejet.ojswipeactionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaHideActionsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojswipeactions.ojSwipeActionsSettableProperties> */
@js.native
trait ojSwipeActionsSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var translations: js.UndefOr[AriaHideActionsDescription] = js.native
}

object ojSwipeActionsSettablePropertiesLenient {
  @scala.inline
  def apply(): ojSwipeActionsSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSwipeActionsSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojSwipeActionsSettablePropertiesLenientOps[Self <: ojSwipeActionsSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setTranslations(value: AriaHideActionsDescription): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

