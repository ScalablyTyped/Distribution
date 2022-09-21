package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectReferences extends StObject {
  
  /** The object IDs. */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ObjectReferences {
  
  inline def apply(): ObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectReferences]
  }
  
  extension [Self <: ObjectReferences](x: Self) {
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
  }
}
