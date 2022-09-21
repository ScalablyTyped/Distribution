package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileNameProfileName[ProfileName /* <: String */] extends StObject {
  
  var profileName: ProfileName
}
object ProfileNameProfileName {
  
  inline def apply[ProfileName /* <: String */](profileName: ProfileName): ProfileNameProfileName[ProfileName] = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileNameProfileName[ProfileName]]
  }
  
  extension [Self <: ProfileNameProfileName[?], ProfileName /* <: String */](x: Self & ProfileNameProfileName[ProfileName]) {
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
  }
}
