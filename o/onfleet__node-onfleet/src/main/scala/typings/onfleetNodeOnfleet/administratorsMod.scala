package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`super`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object administratorsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Administrators", JSImport.Namespace)
  @js.native
  class ^ () extends Admin
  
  @js.native
  trait Admin extends StObject {
    
    def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin] = js.native
    
    def deleteOne(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[OnfleetAdmin]] = js.native
    
    def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin] = js.native
  }
  object Admin {
    
    @scala.inline
    def apply(
      create: CreateAdminProps => js.Promise[OnfleetAdmin],
      deleteOne: String => js.Promise[Unit],
      get: () => js.Promise[js.Array[OnfleetAdmin]],
      update: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]
    ): Admin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Admin]
    }
    
    @scala.inline
    implicit class AdminMutableBuilder[Self <: Admin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateAdminProps => js.Promise[OnfleetAdmin]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteOne(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteOne", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => js.Promise[js.Array[OnfleetAdmin]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * @prop email - The administrator’s complete name.
    * @prop name - The administrator’s email address.
    * @prop phone - Optional. The administrator's phone number.
    * @prop isReadOnly - Optional. Whether this administrator can perform write operations.
    */
  @js.native
  trait CreateAdminProps extends StObject {
    
    var email: String = js.native
    
    var isReadOnly: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var phone: js.UndefOr[String] = js.native
  }
  object CreateAdminProps {
    
    @scala.inline
    def apply(email: String, name: String): CreateAdminProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAdminProps]
    }
    
    @scala.inline
    implicit class CreateAdminPropsMutableBuilder[Self <: CreateAdminProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  @js.native
  trait OnfleetAdmin extends StObject {
    
    var email: String = js.native
    
    var id: String = js.native
    
    var isActive: Boolean = js.native
    
    var metadata: OnfleetMetadata = js.native
    
    var name: String = js.native
    
    var organization: String = js.native
    
    var phone: String = js.native
    
    var timeCreated: Double = js.native
    
    var timeLastModified: Double = js.native
    
    var `type`: `super` | standard = js.native
  }
  object OnfleetAdmin {
    
    @scala.inline
    def apply(
      email: String,
      id: String,
      isActive: Boolean,
      metadata: OnfleetMetadata,
      name: String,
      organization: String,
      phone: String,
      timeCreated: Double,
      timeLastModified: Double,
      `type`: `super` | standard
    ): OnfleetAdmin = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetAdmin]
    }
    
    @scala.inline
    implicit class OnfleetAdminMutableBuilder[Self <: OnfleetAdmin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `super` | standard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateAdminProps extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var metadata: js.UndefOr[OnfleetMetadata] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object UpdateAdminProps {
    
    @scala.inline
    def apply(): UpdateAdminProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAdminProps]
    }
    
    @scala.inline
    implicit class UpdateAdminPropsMutableBuilder[Self <: UpdateAdminProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
