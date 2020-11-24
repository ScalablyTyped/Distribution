package typings.maximMazurokGapiClientPeople

import typings.maximMazurokGapiClientPeople.gapi.client.people.ContactGroupsResource
import typings.maximMazurokGapiClientPeople.gapi.client.people.OtherContactsResource
import typings.maximMazurokGapiClientPeople.gapi.client.people.PeopleResource
import typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.people
import typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load People API v1 */
      def load(name: people, version: v1): js.Thenable[Unit] = js.native
      def load(name: people, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object people extends js.Object {
        
        val contactGroups: ContactGroupsResource = js.native
        
        val otherContacts: OtherContactsResource = js.native
        
        val people: PeopleResource = js.native
      }
    }
  }
}
