package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CwdName extends StObject {
  
  var cwd: String
  
  var name: String
}
object CwdName {
  
  inline def apply(cwd: String, name: String): CwdName = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CwdName]
  }
  
  extension [Self <: CwdName](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
