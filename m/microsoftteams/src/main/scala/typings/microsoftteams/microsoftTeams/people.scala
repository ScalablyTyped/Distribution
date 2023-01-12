package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object people {
  
  /**
    * Input parameter supplied to the People Picker API
    */
  trait PeoplePickerInputs extends StObject {
    
    /**
      * Optional; launches the people picker in org wide scope even if the app is added to a chat or channel
      * Default value is false
      */
    var openOrgWideSearchInChatOrChannel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional; AAD ids of the users to be pre-populated in the search box of people picker control
      * If single select is enabled this value, only the first user in the list will be pre-populated
      * Default value is null
      */
    var setSelected: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional; launches the people picker for which only 1 person can be selected
      * Default value is false
      */
    var singleSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional; Set title for the people picker
      * Default value is "Select people" for multiselect and "Select a person" for single select
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object PeoplePickerInputs {
    
    inline def apply(): PeoplePickerInputs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeoplePickerInputs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeoplePickerInputs] (val x: Self) extends AnyVal {
      
      inline def setOpenOrgWideSearchInChatOrChannel(value: Boolean): Self = StObject.set(x, "openOrgWideSearchInChatOrChannel", value.asInstanceOf[js.Any])
      
      inline def setOpenOrgWideSearchInChatOrChannelUndefined: Self = StObject.set(x, "openOrgWideSearchInChatOrChannel", js.undefined)
      
      inline def setSetSelected(value: js.Array[String]): Self = StObject.set(x, "setSelected", value.asInstanceOf[js.Any])
      
      inline def setSetSelectedUndefined: Self = StObject.set(x, "setSelected", js.undefined)
      
      inline def setSetSelectedVarargs(value: String*): Self = StObject.set(x, "setSelected", js.Array(value*))
      
      inline def setSingleSelect(value: Boolean): Self = StObject.set(x, "singleSelect", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectUndefined: Self = StObject.set(x, "singleSelect", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * Output user object of people picker API
    */
  trait PeoplePickerResult extends StObject {
    
    /**
      * Optional; display name of the selected user
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional; email of the selected user
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * user object Id (also known as aad id) of the selected user
      */
    var objectId: String
  }
  object PeoplePickerResult {
    
    inline def apply(objectId: String): PeoplePickerResult = {
      val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeoplePickerResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeoplePickerResult] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    }
  }
}
