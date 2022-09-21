package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryObject
  extends StObject
     with Entity {
  
  // Date and time when this object was deleted. Always null when the object hasn't been deleted.
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectoryObject {
  
  inline def apply(): DirectoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObject]
  }
  
  extension [Self <: DirectoryObject](x: Self) {
    
    inline def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    inline def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
  }
}
