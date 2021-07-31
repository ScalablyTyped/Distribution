package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryObject
  extends StObject
     with Entity {
  
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectoryObject {
  
  @scala.inline
  def apply(): DirectoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObject]
  }
  
  @scala.inline
  implicit class DirectoryObjectMutableBuilder[Self <: DirectoryObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    @scala.inline
    def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
  }
}
