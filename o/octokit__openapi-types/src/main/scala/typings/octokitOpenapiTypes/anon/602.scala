package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `602` extends StObject {
  
  /** The name of the secret. */
  var secret_name: String
}
object `602` {
  
  inline def apply(secret_name: String): `602` = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`602`]
  }
  
  extension [Self <: `602`](x: Self) {
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
