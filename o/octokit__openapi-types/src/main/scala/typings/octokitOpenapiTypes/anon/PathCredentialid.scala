package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCredentialid extends StObject {
  
  var path: Credentialid
}
object PathCredentialid {
  
  inline def apply(path: Credentialid): PathCredentialid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCredentialid]
  }
  
  extension [Self <: PathCredentialid](x: Self) {
    
    inline def setPath(value: Credentialid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
