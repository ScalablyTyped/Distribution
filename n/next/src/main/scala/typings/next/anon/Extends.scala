package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extends extends StObject {
  
  var `extends`: String
}
object Extends {
  
  inline def apply(`extends`: String): Extends = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extends]
  }
  
  extension [Self <: Extends](x: Self) {
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
  }
}
