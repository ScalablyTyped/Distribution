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
    
    inline def apply(`type`: IdentityType, value: String): typings.nodeZendesk.mod.Users.Identities.CreateModel = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.CreateModel]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.CreateModel](x: Self) {
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait CreatePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.CreateModel
  }
  object CreatePayload {
    
    inline def apply(identity: typings.nodeZendesk.mod.Users.Identities.CreateModel): typings.nodeZendesk.mod.Users.Identities.CreatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.CreatePayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.CreatePayload](x: Self) {
      
      inline def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.CreateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.deliverable
    - typings.nodeZendesk.nodeZendeskStrings.undeliverable
  */
  trait DeliverableState extends StObject
  object DeliverableState {
    
    inline def deliverable: typings.nodeZendesk.nodeZendeskStrings.deliverable = "deliverable".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.deliverable]
    
    inline def undeliverable: typings.nodeZendesk.nodeZendeskStrings.undeliverable = "undeliverable".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.undeliverable]
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
    
    inline def agent_forwarding: typings.nodeZendesk.nodeZendeskStrings.agent_forwarding = "agent_forwarding".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.agent_forwarding]
    
    inline def email: typings.nodeZendesk.nodeZendeskStrings.email = "email".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.email]
    
    inline def facebook: typings.nodeZendesk.nodeZendeskStrings.facebook = "facebook".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.facebook]
    
    inline def google: typings.nodeZendesk.nodeZendeskStrings.google = "google".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.google]
    
    inline def phone_number: typings.nodeZendesk.nodeZendeskStrings.phone_number = "phone_number".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.phone_number]
    
    inline def sdk: typings.nodeZendesk.nodeZendeskStrings.sdk = "sdk".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.sdk]
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    val identities: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]
  }
  object ListPayload {
    
    inline def apply(count: Double, identities: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]): typings.nodeZendesk.mod.Users.Identities.ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.ListPayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.ListPayload](x: Self) {
      
      inline def setIdentities(value: js.Array[typings.nodeZendesk.mod.Users.Identities.ResponseModel]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: typings.nodeZendesk.mod.Users.Identities.ResponseModel*): Self = StObject.set(x, "identities", js.Array(value*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def create(userId: ZendeskID, identity: typings.nodeZendesk.mod.Users.Identities.CreatePayload): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponseModel] = js.native
    /** Creating Identities */
    def create(
      userId: ZendeskID,
      identity: typings.nodeZendesk.mod.Users.Identities.CreatePayload,
      cb: ZendeskCallback[Any, Any]
    ): typings.nodeZendesk.mod.Users.Identities.ResponseModel = js.native
    
    def delete(userId: ZendeskID, identityId: ZendeskID): js.Promise[Any] = js.native
    /** Deleting Identities */
    def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def list(userId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    /** Listing Identities */
    def list(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def makePrimary(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def requestVerification(userId: ZendeskID, identityId: ZendeskID): js.Promise[Any] = js.native
    def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def show(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Viewing Identities */
    def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
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
      cb: ZendeskCallback[Any, Any]
    ): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def verify(userId: ZendeskID, identityId: ZendeskID): js.Promise[typings.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
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
    
    inline def apply(
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
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.ResponseModel](x: Self) {
      
      inline def setDeliverable_state(value: DeliverableState): Self = StObject.set(x, "deliverable_state", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUndeliverable_count(value: Double): Self = StObject.set(x, "undeliverable_count", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(identity: typings.nodeZendesk.mod.Users.Identities.ResponseModel): typings.nodeZendesk.mod.Users.Identities.ResponsePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.ResponsePayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.ResponsePayload](x: Self) {
      
      inline def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.ResponseModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateModel extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateModel {
    
    inline def apply(): typings.nodeZendesk.mod.Users.Identities.UpdateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.UpdateModel]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.UpdateModel](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait UpdatePayload extends StObject {
    
    val identity: typings.nodeZendesk.mod.Users.Identities.UpdateModel
  }
  object UpdatePayload {
    
    inline def apply(identity: typings.nodeZendesk.mod.Users.Identities.UpdateModel): typings.nodeZendesk.mod.Users.Identities.UpdatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeZendesk.mod.Users.Identities.UpdatePayload]
    }
    
    extension [Self <: typings.nodeZendesk.mod.Users.Identities.UpdatePayload](x: Self) {
      
      inline def setIdentity(value: typings.nodeZendesk.mod.Users.Identities.UpdateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
}
