package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  /**
    * The new start date, as a JavaScript date object. It is considered as a local date.
    */
  var date: js.UndefOr[js.Object] = js.undefined
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
