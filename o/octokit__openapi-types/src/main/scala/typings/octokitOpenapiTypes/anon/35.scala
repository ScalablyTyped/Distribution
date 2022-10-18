package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  /**
    * @description Whether to block all notifications from a thread.
    * @default false
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`35`]
  }
  
  extension [Self <: `35`](x: Self) {
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
  }
}
