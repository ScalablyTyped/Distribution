package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.PaginablePayload
import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/user_identities|Zendesk User Identities}
  */
object Identities {
  
  trait CreateModel extends StObject {
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var `type`: IdentityType
    
    var value: String
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object CreateModel {
    
    @scala.inline
    def apply(`type`: IdentityType, value: String): typings.nodeZendesk.mod.Users.Identities.CreateModel = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.CreateModel]
    }
    
    @scala.inline
    implicit class CreateModelMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.CreateModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait CreatePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.CreateModel
  }
  object CreatePayload {
    
    @scala.inline
    def apply(identity: typings.nodeZendesk.mod.Users.Identities.CreateModel): typings.nodeZendesk.mod.Users.Identities.CreatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.CreatePayload]
    }
    
    @scala.inline
    implicit class CreatePayloadMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.CreatePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.CreateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.deliverable
    - typings.nodeZendesk.nodeZendeskStrings.undeliverable
  */
  trait DeliverableState extends StObject
  object DeliverableState {
    
    @scala.inline
    def deliverable: typings.nodeZendesk.nodeZendeskStrings.deliverable = "deliverable".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.deliverable]
    
    @scala.inline
    def undeliverable: typings.nodeZendesk.nodeZendeskStrings.undeliverable = "undeliverable".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.undeliverable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.agent_forwarding
    - typings.nodeZendesk.nodeZendeskStrings.email
    - typings.nodeZendesk.nodeZendeskStrings.facebook
    - typings.nodeZendesk.nodeZendeskStrings.google
    - typings.nodeZendesk.nodeZendeskStrings.phone_number
    - typings.nodeZendesk.nodeZendeskStrings.sdk
  */
  trait IdentityType extends StObject
  object IdentityType {
    
    @scala.inline
    def agent_forwarding: typings.nodeZendesk.nodeZendeskStrings.agent_forwarding = "agent_forwarding".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.agent_forwarding]
    
    @scala.inline
    def email: typings.nodeZendesk.nodeZendeskStrings.email = "email".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.email]
    
    @scala.inline
    def facebook: typings.nodeZendesk.nodeZendeskStrings.facebook = "facebook".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.facebook]
    
    @scala.inline
    def google: typings.nodeZendesk.nodeZendeskStrings.google = "google".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.google]
    
    @scala.inline
    def phone_number: typings.nodeZendesk.nodeZendeskStrings.phone_number = "phone_number".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.phone_number]
    
    @scala.inline
    def sdk: typings.nodeZendesk.nodeZendeskStrings.sdk = "sdk".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.sdk]
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    val identities: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]
  }
  object ListPayload {
    
    @scala.inline
    def apply(count: Double, identities: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]): typings.nodeZendesk.mod.Users.Identities.ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.ListPayload]
    }
    
    @scala.inline
    implicit class ListPayloadMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.ListPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentities(value: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitiesVarargs(value: typings.nodeZendesk.mod.Users.Identities.ResponseModel*): Self = StObject.set(x, "identities", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def create(userId: ZendeskID, identity: typings.nodeZendesk.mod.Users.Identities.CreatePayload): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponseModel] = js.native
    /** Creating Identities */
    def create(
      userId: ZendeskID,
      identity: typings.nodeZendesk.mod.Users.Identities.CreatePayload,
      cb: ZendeskCallback[js.Any, js.Any]
    ): typings.nodeZendesk.mod.Users.Identities.ResponseModel = js.native
    
    def delete(userId: ZendeskID, identityId: ZendeskID): js.Promise[js.Any] = js.native
    /** Deleting Identities */
    def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): js.Any = js.native
    
    def list(userId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    /** Listing Identities */
    def list(userId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): typings.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def makePrimary(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): typings.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def requestVerification(userId: ZendeskID, identityId: ZendeskID): js.Promise[js.Any] = js.native
    def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): js.Any = js.native
    
    def show(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Viewing Identities */
    def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typings.nodeZendesk.mod.Users.Identities.UpdatePayload
    ): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Updating Identities */
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typings.nodeZendesk.mod.Users.Identities.UpdatePayload,
      cb: ZendeskCallback[js.Any, js.Any]
    ): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def verify(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[js.Any, js.Any]): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
  }
  
  trait ResponseModel
    extends StObject
       with AuditableModel {
    
    val deliverable_state: DeliverableState
    
    val primary: Boolean
    
    val `type`: IdentityType
    
    val undeliverable_count: Double
    
    val url: String
    
    val user_id: ZendeskID
    
    val value: String
    
    val verified: Boolean
  }
  object ResponseModel {
    
    @scala.inline
    def apply(
      created_at: String,
      deliverable_state: DeliverableState,
      id: ZendeskID,
      primary: Boolean,
      `type`: IdentityType,
      undeliverable_count: Double,
      url: String,
      user_id: ZendeskID,
      value: String,
      verified: Boolean
    ): typings.nodeZendesk.mod.Users.Identities.ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], updated_at = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.ResponseModel]
    }
    
    @scala.inline
    implicit class ResponseModelMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.ResponseModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeliverable_state(value: DeliverableState): Self = StObject.set(x, "deliverable_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndeliverable_count(value: Double): Self = StObject.set(x, "undeliverable_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.ResponseModel
  }
  object ResponsePayload {
    
    @scala.inline
    def apply(identity: typings.nodeZendesk.mod.Users.Identities.ResponseModel): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.ResponsePayload]
    }
    
    @scala.inline
    implicit class ResponsePayloadMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.ResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.ResponseModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateModel extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateModel {
    
    @scala.inline
    def apply(): typings.nodeZendesk.mod.Users.Identities.UpdateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.UpdateModel]
    }
    
    @scala.inline
    implicit class UpdateModelMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.UpdateModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait UpdatePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.UpdateModel
  }
  object UpdatePayload {
    
    @scala.inline
    def apply(identity: typings.nodeZendesk.mod.Users.Identities.UpdateModel): typings.nodeZendesk.mod.Users.Identities.UpdatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.UpdatePayload]
    }
    
    @scala.inline
    implicit class UpdatePayloadMutableBuilder[Self <: typings.nodeZendesk.mod.Users.Identities.UpdatePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.UpdateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
}
