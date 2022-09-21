package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCredentialidOrg extends StObject {
  
  var path: CredentialidOrg
}
object PathCredentialidOrg {
  
  inline def apply(path: CredentialidOrg): PathCredentialidOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCredentialidOrg]
  }
  
  extension [Self <: PathCredentialidOrg](x: Self) {
    
    inline def setPath(value: CredentialidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
