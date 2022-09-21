package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usedefault extends StObject {
  
  var use_default: Boolean
}
object Usedefault {
  
  inline def apply(use_default: Boolean): Usedefault = {
    val __obj = js.Dynamic.literal(use_default = use_default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usedefault]
  }
  
  extension [Self <: Usedefault](x: Self) {
    
    inline def setUse_default(value: Boolean): Self = StObject.set(x, "use_default", value.asInstanceOf[js.Any])
  }
}
