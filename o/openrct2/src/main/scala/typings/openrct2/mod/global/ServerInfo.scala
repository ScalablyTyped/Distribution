package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  val description: String
  
  val greeting: String
  
  val name: String
  
  val providerEmail: String
  
  val providerName: String
  
  val providerWebsite: String
}
object ServerInfo {
  
  inline def apply(
    description: String,
    greeting: String,
    name: String,
    providerEmail: String,
    providerName: String,
    providerWebsite: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], greeting = greeting.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerEmail = providerEmail.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerWebsite = providerWebsite.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviderEmail(value: String): Self = StObject.set(x, "providerEmail", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderWebsite(value: String): Self = StObject.set(x, "providerWebsite", value.asInstanceOf[js.Any])
  }
}
