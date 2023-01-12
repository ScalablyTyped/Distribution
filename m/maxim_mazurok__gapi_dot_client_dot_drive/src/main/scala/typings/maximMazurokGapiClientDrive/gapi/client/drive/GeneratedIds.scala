package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedIds extends StObject {
  
  /** The IDs generated for the requesting user in the specified space. */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#generatedIds". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The type of file that can be created with these IDs. */
  var space: js.UndefOr[String] = js.undefined
}
object GeneratedIds {
  
  inline def apply(): GeneratedIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedIds] (val x: Self) extends AnyVal {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
