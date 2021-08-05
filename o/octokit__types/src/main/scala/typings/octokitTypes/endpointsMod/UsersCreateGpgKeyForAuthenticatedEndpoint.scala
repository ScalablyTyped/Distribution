package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersCreateGpgKeyForAuthenticatedEndpoint extends StObject {
  
  /**
    * Your GPG key, generated in ASCII-armored format. See "[Generating a new GPG key](https://docs.github.com/articles/generating-a-new-gpg-key/)" for help creating a GPG key.
    */
  var armored_public_key: js.UndefOr[String] = js.undefined
}
object UsersCreateGpgKeyForAuthenticatedEndpoint {
  
  inline def apply(): UsersCreateGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersCreateGpgKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersCreateGpgKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setArmored_public_key(value: String): Self = StObject.set(x, "armored_public_key", value.asInstanceOf[js.Any])
    
    inline def setArmored_public_keyUndefined: Self = StObject.set(x, "armored_public_key", js.undefined)
  }
}
