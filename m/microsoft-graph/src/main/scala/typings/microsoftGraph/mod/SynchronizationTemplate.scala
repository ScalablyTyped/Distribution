package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationTemplate
  extends StObject
     with Entity {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var applicationId: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  var discoverable: js.UndefOr[Boolean] = js.undefined
  
  var factoryTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  var metadata: js.UndefOr[NullableOption[js.Array[SynchronizationMetadataEntry]]] = js.undefined
  
  var schema: js.UndefOr[NullableOption[SynchronizationSchema]] = js.undefined
}
object SynchronizationTemplate {
  
  inline def apply(): SynchronizationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationTemplate] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscoverable(value: Boolean): Self = StObject.set(x, "discoverable", value.asInstanceOf[js.Any])
    
    inline def setDiscoverableUndefined: Self = StObject.set(x, "discoverable", js.undefined)
    
    inline def setFactoryTag(value: NullableOption[String]): Self = StObject.set(x, "factoryTag", value.asInstanceOf[js.Any])
    
    inline def setFactoryTagNull: Self = StObject.set(x, "factoryTag", null)
    
    inline def setFactoryTagUndefined: Self = StObject.set(x, "factoryTag", js.undefined)
    
    inline def setMetadata(value: NullableOption[js.Array[SynchronizationMetadataEntry]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: SynchronizationMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setSchema(value: NullableOption[SynchronizationSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
