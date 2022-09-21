package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreNonExistingFields extends StObject {
  
  var ignoreNonExistingFields: js.UndefOr[Boolean] = js.undefined
}
object IgnoreNonExistingFields {
  
  inline def apply(): IgnoreNonExistingFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreNonExistingFields]
  }
  
  extension [Self <: IgnoreNonExistingFields](x: Self) {
    
    inline def setIgnoreNonExistingFields(value: Boolean): Self = StObject.set(x, "ignoreNonExistingFields", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNonExistingFieldsUndefined: Self = StObject.set(x, "ignoreNonExistingFields", js.undefined)
  }
}
