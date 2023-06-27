package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationSchema
  extends StObject
     with Entity {
  
  var directories: js.UndefOr[NullableOption[js.Array[DirectoryDefinition]]] = js.undefined
  
  var synchronizationRules: js.UndefOr[NullableOption[js.Array[SynchronizationRule]]] = js.undefined
  
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object SynchronizationSchema {
  
  inline def apply(): SynchronizationSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationSchema] (val x: Self) extends AnyVal {
    
    inline def setDirectories(value: NullableOption[js.Array[DirectoryDefinition]]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesNull: Self = StObject.set(x, "directories", null)
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: DirectoryDefinition*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setSynchronizationRules(value: NullableOption[js.Array[SynchronizationRule]]): Self = StObject.set(x, "synchronizationRules", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationRulesNull: Self = StObject.set(x, "synchronizationRules", null)
    
    inline def setSynchronizationRulesUndefined: Self = StObject.set(x, "synchronizationRules", js.undefined)
    
    inline def setSynchronizationRulesVarargs(value: SynchronizationRule*): Self = StObject.set(x, "synchronizationRules", js.Array(value*))
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
