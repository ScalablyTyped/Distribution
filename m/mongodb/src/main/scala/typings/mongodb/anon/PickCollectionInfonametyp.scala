package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mongodb.mongodb.CollectionInfo, 'name' | 'type'> */
trait PickCollectionInfonametyp extends StObject {
  
  var name: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PickCollectionInfonametyp {
  
  inline def apply(name: String): PickCollectionInfonametyp = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCollectionInfonametyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCollectionInfonametyp] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
