package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: js.UndefOr[String] = js.undefined
}
object Architecture {
  
  inline def apply(): Architecture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Architecture]
  }
  
  extension [Self <: Architecture](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
  }
}
