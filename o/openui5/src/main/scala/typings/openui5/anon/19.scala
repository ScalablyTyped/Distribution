package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  /**
    * whether the view source is loaded asynchronously
    */
  var async: js.UndefOr[Boolean] = js.undefined
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}
