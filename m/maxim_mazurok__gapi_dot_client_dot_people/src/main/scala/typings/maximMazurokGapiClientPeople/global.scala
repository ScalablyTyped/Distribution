package typings.maximMazurokGapiClientPeople

import typings.maximMazurokGapiClientPeople.gapi.client.people.ContactGroupsResource
import typings.maximMazurokGapiClientPeople.gapi.client.people.OtherContactsResource
import typings.maximMazurokGapiClientPeople.gapi.client.people.PeopleResource
import typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.people
import typings.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load People API v1 */
      inline def load(name: people, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: people, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object people {
        
        @JSGlobal("gapi.client.people.contactGroups")
        @js.native
        val contactGroups: ContactGroupsResource = js.native
        
        @JSGlobal("gapi.client.people.otherContacts")
        @js.native
        val otherContacts: OtherContactsResource = js.native
        
        @JSGlobal("gapi.client.people.people")
        @js.native
        val people: PeopleResource = js.native
      }
    }
  }
}
