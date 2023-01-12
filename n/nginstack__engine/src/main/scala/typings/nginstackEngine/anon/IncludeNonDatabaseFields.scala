package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeNonDatabaseFields extends StObject {
  
  var includeNonDatabaseFields: Boolean
}
object IncludeNonDatabaseFields {
  
  inline def apply(includeNonDatabaseFields: Boolean): IncludeNonDatabaseFields = {
    val __obj = js.Dynamic.literal(includeNonDatabaseFields = includeNonDatabaseFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeNonDatabaseFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeNonDatabaseFields] (val x: Self) extends AnyVal {
    
    inline def setIncludeNonDatabaseFields(value: Boolean): Self = StObject.set(x, "includeNonDatabaseFields", value.asInstanceOf[js.Any])
  }
}
