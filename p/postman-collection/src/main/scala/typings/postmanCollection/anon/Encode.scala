package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encode extends StObject {
  
  var encode: js.UndefOr[Boolean] = js.undefined
  
  var ignoreDisabled: js.UndefOr[Boolean] = js.undefined
}
object Encode {
  
  inline def apply(): Encode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
    
    inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setIgnoreDisabled(value: Boolean): Self = StObject.set(x, "ignoreDisabled", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDisabledUndefined: Self = StObject.set(x, "ignoreDisabled", js.undefined)
  }
}
