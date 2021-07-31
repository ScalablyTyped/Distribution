package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Tasks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Organization", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Organization
  
  trait Delegatee extends StObject {
    
    var country: String
    
    var email: String
    
    var id: String
    
    var name: String
    
    var timezone: String
  }
  object Delegatee {
    
    @scala.inline
    def apply(country: String, email: String, id: String, name: String, timezone: String): Delegatee = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delegatee]
    }
    
    @scala.inline
    implicit class DelegateeMutableBuilder[Self <: Delegatee] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnfleetOrganization extends StObject {
    
    var country: String
    
    var delegatees: js.Array[String]
    
    var email: String
    
    var id: String
    
    var image: String
    
    var name: String
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var timezone: String
  }
  object OnfleetOrganization {
    
    @scala.inline
    def apply(
      country: String,
      delegatees: js.Array[String],
      email: String,
      id: String,
      image: String,
      name: String,
      timeCreated: Double,
      timeLastModified: Double,
      timezone: String
    ): OnfleetOrganization = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], delegatees = delegatees.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetOrganization]
    }
    
    @scala.inline
    implicit class OnfleetOrganizationMutableBuilder[Self <: OnfleetOrganization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegatees(value: js.Array[String]): Self = StObject.set(x, "delegatees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateesVarargs(value: String*): Self = StObject.set(x, "delegatees", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Organization extends StObject {
    
    def get(): js.Promise[js.Array[OnfleetOrganization]] = js.native
    def get(id: String): js.Promise[OnfleetOrganization | Delegatee] = js.native
    
    def insertTask(id: String, obj: Tasks): js.Promise[js.Any] = js.native
  }
}
