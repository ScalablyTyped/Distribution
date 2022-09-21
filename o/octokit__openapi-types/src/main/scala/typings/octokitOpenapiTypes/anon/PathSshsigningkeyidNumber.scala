package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSshsigningkeyidNumber extends StObject {
  
  var path: SshsigningkeyidNumber
}
object PathSshsigningkeyidNumber {
  
  inline def apply(path: SshsigningkeyidNumber): PathSshsigningkeyidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSshsigningkeyidNumber]
  }
  
  extension [Self <: PathSshsigningkeyidNumber](x: Self) {
    
    inline def setPath(value: SshsigningkeyidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
