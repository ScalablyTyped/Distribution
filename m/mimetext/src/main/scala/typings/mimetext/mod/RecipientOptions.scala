package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientOptions extends StObject {
  
  var `type`: js.UndefOr[RecipientType] = js.undefined
}
object RecipientOptions {
  
  inline def apply(): RecipientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: RecipientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
