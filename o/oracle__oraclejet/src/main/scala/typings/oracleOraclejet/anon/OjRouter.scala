package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OjRouter extends StObject {
  
  var ojRouter: Parameters = js.native
}
object OjRouter {
  
  @scala.inline
  def apply(ojRouter: Parameters): OjRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouter]
  }
  
  @scala.inline
  implicit class OjRouterMutableBuilder[Self <: OjRouter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOjRouter(value: Parameters): Self = StObject.set(x, "ojRouter", value.asInstanceOf[js.Any])
  }
}
