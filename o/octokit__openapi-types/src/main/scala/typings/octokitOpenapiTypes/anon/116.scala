package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  /** @description The email of the author (or committer) of the commit */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description The name of the author (or committer) of the commit */
  var name: js.UndefOr[String] = js.undefined
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
