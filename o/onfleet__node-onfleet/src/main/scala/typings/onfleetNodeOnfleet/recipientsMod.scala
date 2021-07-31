package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.PartialCreateRecipientPro
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipientsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Recipients", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Recipient
  
  trait CreateRecipientProps extends StObject {
    
    var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
    
    var name: String
    
    var notes: js.UndefOr[String] = js.undefined
    
    var phone: String
    
    var skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined
    
    var skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
  }
  object CreateRecipientProps {
    
    @scala.inline
    def apply(name: String, phone: String): CreateRecipientProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateRecipientProps]
    }
    
    @scala.inline
    implicit class CreateRecipientPropsMutableBuilder[Self <: CreateRecipientProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPhoneNumberValidation(value: Boolean): Self = StObject.set(x, "skipPhoneNumberValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPhoneNumberValidationUndefined: Self = StObject.set(x, "skipPhoneNumberValidation", js.undefined)
      
      @scala.inline
      def setSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "skipSMSNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSMSNotificationsUndefined: Self = StObject.set(x, "skipSMSNotifications", js.undefined)
    }
  }
  
  trait OnfleetRecipient extends StObject {
    
    var id: String
    
    var metadata: js.Array[OnfleetMetadata]
    
    var name: String
    
    var notes: String
    
    var organization: String
    
    var phone: String
    
    var skipSMSNotifications: Boolean
    
    var timeCreated: Double
    
    var timeLastModified: Double
  }
  object OnfleetRecipient {
    
    @scala.inline
    def apply(
      id: String,
      metadata: js.Array[OnfleetMetadata],
      name: String,
      notes: String,
      organization: String,
      phone: String,
      skipSMSNotifications: Boolean,
      timeCreated: Double,
      timeLastModified: Double
    ): OnfleetRecipient = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], skipSMSNotifications = skipSMSNotifications.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetRecipient]
    }
    
    @scala.inline
    implicit class OnfleetRecipientMutableBuilder[Self <: OnfleetRecipient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "skipSMSNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Recipient extends StObject {
    
    def create(recipient: CreateRecipientProps): js.Promise[OnfleetRecipient] = js.native
    
    def get(queryOrId: String): js.Promise[OnfleetRecipient] = js.native
    def get(queryOrId: String, queryKey: RecipientQueryKey): js.Promise[OnfleetRecipient] = js.native
    
    def update(id: String, recipient: PartialCreateRecipientPro): js.Promise[OnfleetRecipient] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.phone
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.name
  */
  trait RecipientQueryKey extends StObject
  object RecipientQueryKey {
    
    @scala.inline
    def name: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.name = "name".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.name]
    
    @scala.inline
    def phone: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.phone = "phone".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.phone]
  }
}
