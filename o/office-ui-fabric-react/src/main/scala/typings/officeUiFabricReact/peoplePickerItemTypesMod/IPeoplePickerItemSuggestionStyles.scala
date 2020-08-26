package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSuggestionStyles extends js.Object {
  /** Refers to the element wrapping the Persona of the suggested PeoplePicker item. */
  var personaWrapper: IStyle = js.native
  /** Root container element of a suggested PeoplePicker item. */
  var root: IStyle = js.native
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles = js.native
}

object IPeoplePickerItemSuggestionStyles {
  @scala.inline
  def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSuggestionStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionStyles]
  }
  @scala.inline
  implicit class IPeoplePickerItemSuggestionStylesOps[Self <: IPeoplePickerItemSuggestionStyles] (val x: Self) extends AnyVal {
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
    def setSubComponentStyles(value: IPeoplePickerItemSelectedSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersonaWrapper(value: IStyle): Self = this.set("personaWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonaWrapper: Self = this.set("personaWrapper", js.undefined)
    @scala.inline
    def setPersonaWrapperNull: Self = this.set("personaWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

