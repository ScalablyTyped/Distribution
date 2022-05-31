package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OjRouter extends StObject {
  
  var ojRouter: Parameters
}
object OjRouter {
  
  inline def apply(ojRouter: Parameters): OjRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouter]
  }
  
  extension [Self <: OjRouter](x: Self) {
    
    inline def setOjRouter(value: Parameters): Self = StObject.set(x, "ojRouter", value.asInstanceOf[js.Any])
  }
}
