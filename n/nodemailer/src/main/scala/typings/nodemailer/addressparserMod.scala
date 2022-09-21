package typings.nodemailer

import typings.nodemailer.anon.Flatten
import typings.nodemailer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressparserMod {
  
  inline def apply(address: String): js.Array[AddressOrGroup] = ^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[AddressOrGroup]]
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
  inline def apply(address: String, options: Flatten): js.Array[Address] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Address]]
  inline def apply(address: String, options: `0`): js.Array[AddressOrGroup] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[AddressOrGroup]]
  
  @JSImport("nodemailer/lib/addressparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Address
    extends StObject
       with AddressOrGroup {
    
    var address: String
    
    var name: String
  }
  object Address {
    
    inline def apply(address: String, name: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.addressparserMod.Address
    - typings.nodemailer.addressparserMod.Group
  */
  trait AddressOrGroup extends StObject
  object AddressOrGroup {
    
    inline def Address(address: String, name: String): typings.nodemailer.addressparserMod.Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.addressparserMod.Address]
    }
    
    inline def Group(group: js.Array[AddressOrGroup], name: String): typings.nodemailer.addressparserMod.Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.addressparserMod.Group]
    }
  }
  
  trait Group
    extends StObject
       with AddressOrGroup {
    
    var group: js.Array[AddressOrGroup]
    
    var name: String
  }
  object Group {
    
    inline def apply(group: js.Array[AddressOrGroup], name: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setGroup(value: js.Array[AddressOrGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupVarargs(value: AddressOrGroup*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
