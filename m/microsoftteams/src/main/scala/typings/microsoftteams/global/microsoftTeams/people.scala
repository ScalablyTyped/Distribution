package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.people.PeoplePickerInputs
import typings.microsoftteams.microsoftTeams.people.PeoplePickerResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object people {
  
  @JSGlobal("microsoftTeams.people")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Launches a people picker and allows the user to select one or more people from the list
    * If the app is added to personal app scope the people picker launched is org wide and if the app is added to a chat/channel, people picker launched is also limited to the members of chat/channel
    * @param callback Returns list of JSON object of type PeoplePickerResult which consists of AAD IDs, display names and emails of the selected users
    * @param peoplePickerInputs Input parameters to launch customized people picker
    */
  inline def selectPeople(callback: js.Function2[/* error */ SdkError, /* people */ js.Array[PeoplePickerResult], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectPeople")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def selectPeople(
    callback: js.Function2[/* error */ SdkError, /* people */ js.Array[PeoplePickerResult], Unit],
    peoplePickerInputs: PeoplePickerInputs
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectPeople")(callback.asInstanceOf[js.Any], peoplePickerInputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
