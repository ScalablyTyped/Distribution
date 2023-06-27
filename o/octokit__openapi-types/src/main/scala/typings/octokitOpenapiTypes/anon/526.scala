package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `526` extends StObject {
  
  /** @description The integrator reference of the action requested by the user. */
  var identifier: js.UndefOr[String] = js.undefined
}
object `526` {
  
  inline def apply(): `526` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`526`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `526`] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
  }
}
