package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationRule extends StObject {
  
  var containerFilter: js.UndefOr[NullableOption[ContainerFilter]] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var groupFilter: js.UndefOr[NullableOption[GroupFilter]] = js.undefined
  
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  var metadata: js.UndefOr[NullableOption[js.Array[StringKeyStringValuePair]]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var objectMappings: js.UndefOr[NullableOption[js.Array[ObjectMapping]]] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var sourceDirectoryName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var targetDirectoryName: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationRule {
  
  inline def apply(): SynchronizationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationRule] (val x: Self) extends AnyVal {
    
    inline def setContainerFilter(value: NullableOption[ContainerFilter]): Self = StObject.set(x, "containerFilter", value.asInstanceOf[js.Any])
    
    inline def setContainerFilterNull: Self = StObject.set(x, "containerFilter", null)
    
    inline def setContainerFilterUndefined: Self = StObject.set(x, "containerFilter", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setGroupFilter(value: NullableOption[GroupFilter]): Self = StObject.set(x, "groupFilter", value.asInstanceOf[js.Any])
    
    inline def setGroupFilterNull: Self = StObject.set(x, "groupFilter", null)
    
    inline def setGroupFilterUndefined: Self = StObject.set(x, "groupFilter", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: NullableOption[js.Array[StringKeyStringValuePair]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: StringKeyStringValuePair*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectMappings(value: NullableOption[js.Array[ObjectMapping]]): Self = StObject.set(x, "objectMappings", value.asInstanceOf[js.Any])
    
    inline def setObjectMappingsNull: Self = StObject.set(x, "objectMappings", null)
    
    inline def setObjectMappingsUndefined: Self = StObject.set(x, "objectMappings", js.undefined)
    
    inline def setObjectMappingsVarargs(value: ObjectMapping*): Self = StObject.set(x, "objectMappings", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSourceDirectoryName(value: NullableOption[String]): Self = StObject.set(x, "sourceDirectoryName", value.asInstanceOf[js.Any])
    
    inline def setSourceDirectoryNameNull: Self = StObject.set(x, "sourceDirectoryName", null)
    
    inline def setSourceDirectoryNameUndefined: Self = StObject.set(x, "sourceDirectoryName", js.undefined)
    
    inline def setTargetDirectoryName(value: NullableOption[String]): Self = StObject.set(x, "targetDirectoryName", value.asInstanceOf[js.Any])
    
    inline def setTargetDirectoryNameNull: Self = StObject.set(x, "targetDirectoryName", null)
    
    inline def setTargetDirectoryNameUndefined: Self = StObject.set(x, "targetDirectoryName", js.undefined)
  }
}
