package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMappingMetadataEntry extends StObject {
  
  var key: js.UndefOr[NullableOption[ObjectMappingMetadata]] = js.undefined
  
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object ObjectMappingMetadataEntry {
  
  inline def apply(): ObjectMappingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMappingMetadataEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectMappingMetadataEntry] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NullableOption[ObjectMappingMetadata]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
