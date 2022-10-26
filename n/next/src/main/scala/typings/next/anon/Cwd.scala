package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cwd extends StObject {
  
  var cwd: String
}
object Cwd {
  
  inline def apply(cwd: String): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
  
  extension [Self <: Cwd](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
  }
}
