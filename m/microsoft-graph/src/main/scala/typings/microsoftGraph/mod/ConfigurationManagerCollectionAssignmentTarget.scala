package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationManagerCollectionAssignmentTarget
  extends StObject
     with DeviceAndAppManagementAssignmentTarget {
  
  // The collection Id that is the target of the assignment.
  var collectionId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ConfigurationManagerCollectionAssignmentTarget {
  
  inline def apply(): ConfigurationManagerCollectionAssignmentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationManagerCollectionAssignmentTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationManagerCollectionAssignmentTarget] (val x: Self) extends AnyVal {
    
    inline def setCollectionId(value: NullableOption[String]): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdNull: Self = StObject.set(x, "collectionId", null)
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
  }
}
