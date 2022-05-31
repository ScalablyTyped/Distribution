package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: ToString | js.Function0[String] | String
}
object Description {
  
  inline def apply(description: ToString | js.Function0[String] | String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: ToString | js.Function0[String] | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionFunction0(value: () => String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
  }
}
