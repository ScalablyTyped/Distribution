package typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerExamplesExtendedPeoplePickerDotControlledDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerExampleState extends js.Object {
  var currentlySelectedItems: js.Array[IExtendedPersonaProps]
  var mostRecentlyUsed: js.Array[IPersonaProps]
  var peopleList: js.Array[IPersonaProps]
  var searchMoreAvailable: Boolean
  var suggestionItems: js.Array[IPersonaProps]
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
}

