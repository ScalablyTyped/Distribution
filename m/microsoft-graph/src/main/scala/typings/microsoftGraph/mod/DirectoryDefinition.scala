package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryDefinition
  extends StObject
     with Entity {
  
  var discoverabilities: js.UndefOr[DirectoryDefinitionDiscoverabilities] = js.undefined
  
  var discoveryDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  var objects: js.UndefOr[NullableOption[js.Array[ObjectDefinition]]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectoryDefinition {
  
  inline def apply(): DirectoryDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectoryDefinition] (val x: Self) extends AnyVal {
    
    inline def setDiscoverabilities(value: DirectoryDefinitionDiscoverabilities): Self = StObject.set(x, "discoverabilities", value.asInstanceOf[js.Any])
    
    inline def setDiscoverabilitiesUndefined: Self = StObject.set(x, "discoverabilities", js.undefined)
    
    inline def setDiscoveryDateTime(value: NullableOption[String]): Self = StObject.set(x, "discoveryDateTime", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryDateTimeNull: Self = StObject.set(x, "discoveryDateTime", null)
    
    inline def setDiscoveryDateTimeUndefined: Self = StObject.set(x, "discoveryDateTime", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjects(value: NullableOption[js.Array[ObjectDefinition]]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsNull: Self = StObject.set(x, "objects", null)
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setObjectsVarargs(value: ObjectDefinition*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
