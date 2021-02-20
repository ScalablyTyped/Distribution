package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectReferences extends StObject {
  
  /** The object IDs. */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}
object ObjectReferences {
  
  @scala.inline
  def apply(): ObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectReferences]
  }
  
  @scala.inline
  implicit class ObjectReferencesMutableBuilder[Self <: ObjectReferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
  }
}
