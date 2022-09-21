package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DONE extends StObject {
  
  var DONE: String
  
  var IGNORE: String
  
  var NEWLINE: String
}
object DONE {
  
  inline def apply(DONE: String, IGNORE: String, NEWLINE: String): DONE = {
    val __obj = js.Dynamic.literal(DONE = DONE.asInstanceOf[js.Any], IGNORE = IGNORE.asInstanceOf[js.Any], NEWLINE = NEWLINE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DONE]
  }
  
  extension [Self <: DONE](x: Self) {
    
    inline def setDONE(value: String): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
    
    inline def setIGNORE(value: String): Self = StObject.set(x, "IGNORE", value.asInstanceOf[js.Any])
    
    inline def setNEWLINE(value: String): Self = StObject.set(x, "NEWLINE", value.asInstanceOf[js.Any])
  }
}
