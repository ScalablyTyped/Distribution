package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSshsigningkeyid extends StObject {
  
  var path: Sshsigningkeyid
}
object PathSshsigningkeyid {
  
  inline def apply(path: Sshsigningkeyid): PathSshsigningkeyid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSshsigningkeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSshsigningkeyid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Sshsigningkeyid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
