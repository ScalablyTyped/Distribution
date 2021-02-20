package typings.nodemailer

import typings.nodemailer.anon.Flatten
import typings.nodemailer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressparserMod {
  
  @JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
  @js.native
  def apply(address: String): js.Array[AddressOrGroup] = js.native
  /**
    * Parses structured e-mail addresses from an address field
    *
    * Example:
    *
    *    'Name <address@domain>'
    *
    * will be converted to
    *
    *     [{name: 'Name', address: 'address@domain'}]
    *
    * @return An array of address objects
    */
  @JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
  @js.native
  def apply(address: String, options: Flatten): js.Array[Address] = js.native
  @JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
  @js.native
  def apply(address: String, options: `0`): js.Array[AddressOrGroup] = js.native
  
  @js.native
  trait Address extends AddressOrGroup {
    
    var address: String = js.native
    
    var name: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: String, name: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.addressparserMod.Address
    - typings.nodemailer.addressparserMod.Group
  */
  trait AddressOrGroup extends StObject
  object AddressOrGroup {
    
    @scala.inline
    def Address(address: String, name: String): typings.nodemailer.addressparserMod.Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.addressparserMod.Address]
    }
    
    @scala.inline
    def Group(group: js.Array[AddressOrGroup], name: String): typings.nodemailer.addressparserMod.Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.addressparserMod.Group]
    }
  }
  
  @js.native
  trait Group extends AddressOrGroup {
    
    var group: js.Array[AddressOrGroup] = js.native
    
    var name: String = js.native
  }
  object Group {
    
    @scala.inline
    def apply(group: js.Array[AddressOrGroup], name: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: js.Array[AddressOrGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupVarargs(value: AddressOrGroup*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
