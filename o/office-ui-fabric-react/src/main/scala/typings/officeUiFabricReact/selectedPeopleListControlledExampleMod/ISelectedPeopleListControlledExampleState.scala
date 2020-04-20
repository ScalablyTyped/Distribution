package typings.officeUiFabricReact.selectedPeopleListControlledExampleMod

import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedPeopleListControlledExampleState extends js.Object {
  var currentSelectedItems: js.Array[IExtendedPersonaProps]
  var nextPersonIndex: Double
}

object ISelectedPeopleListControlledExampleState {
  @scala.inline
  def apply(currentSelectedItems: js.Array[IExtendedPersonaProps], nextPersonIndex: Double): ISelectedPeopleListControlledExampleState = {
    val __obj = js.Dynamic.literal(currentSelectedItems = currentSelectedItems.asInstanceOf[js.Any], nextPersonIndex = nextPersonIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedPeopleListControlledExampleState]
  }
}

