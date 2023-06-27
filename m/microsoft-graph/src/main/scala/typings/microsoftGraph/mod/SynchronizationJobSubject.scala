package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationJobSubject extends StObject {
  
  var links: js.UndefOr[NullableOption[SynchronizationLinkedObjects]] = js.undefined
  
  var objectId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var objectTypeName: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationJobSubject {
  
  inline def apply(): SynchronizationJobSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationJobSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationJobSubject] (val x: Self) extends AnyVal {
    
    inline def setLinks(value: NullableOption[SynchronizationLinkedObjects]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setObjectId(value: NullableOption[String]): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectTypeName(value: NullableOption[String]): Self = StObject.set(x, "objectTypeName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNameNull: Self = StObject.set(x, "objectTypeName", null)
    
    inline def setObjectTypeNameUndefined: Self = StObject.set(x, "objectTypeName", js.undefined)
  }
}
