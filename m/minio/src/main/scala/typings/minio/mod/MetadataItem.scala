package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataItem extends StObject {
  
  var Key: String
  
  var Value: String
}
object MetadataItem {
  
  inline def apply(Key: String, Value: String): MetadataItem = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataItem] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
