package typings.officeUiFabricReact.extendedPeoplePickerBasicExampleMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerExampleState extends js.Object {
  var mostRecentlyUsed: js.Array[IPersonaProps]
  var peopleList: js.Array[IPersonaProps]
  var searchMoreAvailable: Boolean
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(
    mostRecentlyUsed: js.Array[IPersonaProps],
    peopleList: js.Array[IPersonaProps],
    searchMoreAvailable: Boolean
  ): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(mostRecentlyUsed = mostRecentlyUsed.asInstanceOf[js.Any], peopleList = peopleList.asInstanceOf[js.Any], searchMoreAvailable = searchMoreAvailable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
}

