package typings.officeUiFabricReact.floatingPeoplePickerBasicExampleMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerExampleState extends js.Object {
  var peopleList: js.Array[IPersonaProps]
  var searchValue: String
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(peopleList: js.Array[IPersonaProps], searchValue: String): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal(peopleList = peopleList.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
}

