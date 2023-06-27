package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDefinitionMetadataEntry extends StObject {
  
  var key: js.UndefOr[NullableOption[ObjectDefinitionMetadata]] = js.undefined
  
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object ObjectDefinitionMetadataEntry {
  
  inline def apply(): ObjectDefinitionMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDefinitionMetadataEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectDefinitionMetadataEntry] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NullableOption[ObjectDefinitionMetadata]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
