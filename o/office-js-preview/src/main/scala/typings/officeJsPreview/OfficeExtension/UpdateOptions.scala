package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an option for suppressing an error when the object that is used to set multiple properties tries to set read-only properties.
  */
trait UpdateOptions extends StObject {
  
  /**
    * Throw an error if the passed-in property list includes read-only properties (default = true).
    */
  var throwOnReadOnly: js.UndefOr[Boolean] = js.undefined
}
object UpdateOptions {
  
  inline def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
    inline def setThrowOnReadOnly(value: Boolean): Self = StObject.set(x, "throwOnReadOnly", value.asInstanceOf[js.Any])
    
    inline def setThrowOnReadOnlyUndefined: Self = StObject.set(x, "throwOnReadOnly", js.undefined)
  }
}
