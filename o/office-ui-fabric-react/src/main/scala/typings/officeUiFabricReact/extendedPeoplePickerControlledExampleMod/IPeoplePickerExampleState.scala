package typings.officeUiFabricReact.extendedPeoplePickerControlledExampleMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerExampleState extends js.Object {
  var currentlySelectedItems: js.Array[IExtendedPersonaProps] = js.native
  var mostRecentlyUsed: js.Array[IPersonaProps] = js.native
  var peopleList: js.Array[IPersonaProps] = js.native
  var searchMoreAvailable: Boolean = js.native
  var suggestionItems: js.Array[IPersonaProps] = js.native
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(
    currentlySelectedItems: js.Array[IExtendedPersonaProps],
    mostRecentlyUsed: js.Array[IPersonaProps],
    peopleList: js.Array[IPersonaProps],
    searchMoreAvailable: Boolean,
    suggestionItems: js.Array[IPersonaProps]
  ): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(currentlySelectedItems = currentlySelectedItems.asInstanceOf[js.Any], mostRecentlyUsed = mostRecentlyUsed.asInstanceOf[js.Any], peopleList = peopleList.asInstanceOf[js.Any], searchMoreAvailable = searchMoreAvailable.asInstanceOf[js.Any], suggestionItems = suggestionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
  @scala.inline
  implicit class IPeoplePickerExampleStateOps[Self <: IPeoplePickerExampleState] (val x: Self) extends AnyVal {
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
    def setCurrentlySelectedItemsVarargs(value: IExtendedPersonaProps*): Self = this.set("currentlySelectedItems", js.Array(value :_*))
    @scala.inline
    def setCurrentlySelectedItems(value: js.Array[IExtendedPersonaProps]): Self = this.set("currentlySelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setMostRecentlyUsedVarargs(value: IPersonaProps*): Self = this.set("mostRecentlyUsed", js.Array(value :_*))
    @scala.inline
    def setMostRecentlyUsed(value: js.Array[IPersonaProps]): Self = this.set("mostRecentlyUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeopleListVarargs(value: IPersonaProps*): Self = this.set("peopleList", js.Array(value :_*))
    @scala.inline
    def setPeopleList(value: js.Array[IPersonaProps]): Self = this.set("peopleList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchMoreAvailable(value: Boolean): Self = this.set("searchMoreAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionItemsVarargs(value: IPersonaProps*): Self = this.set("suggestionItems", js.Array(value :_*))
    @scala.inline
    def setSuggestionItems(value: js.Array[IPersonaProps]): Self = this.set("suggestionItems", value.asInstanceOf[js.Any])
  }
  
}

