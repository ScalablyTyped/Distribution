package typings.openui5.anon

import typings.openui5.sapUiSupportLibraryMod.Severity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var context: IdString
  
  var details: String
  
  var severity: Severity
}
object Details {
  
  inline def apply(context: IdString, details: String, severity: Severity): Details = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IdString): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
