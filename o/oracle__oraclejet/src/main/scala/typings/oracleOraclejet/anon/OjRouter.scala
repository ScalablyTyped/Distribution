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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OjRouter] (val x: Self) extends AnyVal {
    
    inline def setOjRouter(value: Parameters): Self = StObject.set(x, "ojRouter", value.asInstanceOf[js.Any])
  }
}
