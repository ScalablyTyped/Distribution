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
  
  extension [Self <: IncludeNonDatabaseFields](x: Self) {
    
    inline def setIncludeNonDatabaseFields(value: Boolean): Self = StObject.set(x, "includeNonDatabaseFields", value.asInstanceOf[js.Any])
  }
}
