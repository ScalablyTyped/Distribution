package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMasterKeyOption extends StObject {
  
  /**
    * In Cloud Code and Node only, causes the Master Key to be used for this request.
    */
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}
object UseMasterKeyOption {
  
  inline def apply(): UseMasterKeyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMasterKeyOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseMasterKeyOption] (val x: Self) extends AnyVal {
    
    inline def setUseMasterKey(value: Boolean): Self = StObject.set(x, "useMasterKey", value.asInstanceOf[js.Any])
    
    inline def setUseMasterKeyUndefined: Self = StObject.set(x, "useMasterKey", js.undefined)
  }
}
