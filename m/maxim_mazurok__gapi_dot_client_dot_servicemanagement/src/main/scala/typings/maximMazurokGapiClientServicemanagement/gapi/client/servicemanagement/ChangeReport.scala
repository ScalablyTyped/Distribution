package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeReport extends StObject {
  
  /**
    * List of changes between two service configurations. The changes will be alphabetically sorted based on the identifier of each change. A ConfigChange identifier is a dot separated
    * path to the configuration. Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
    */
  var configChanges: js.UndefOr[js.Array[ConfigChange]] = js.undefined
}
object ChangeReport {
  
  inline def apply(): ChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeReport]
  }
  
  extension [Self <: ChangeReport](x: Self) {
    
    inline def setConfigChanges(value: js.Array[ConfigChange]): Self = StObject.set(x, "configChanges", value.asInstanceOf[js.Any])
    
    inline def setConfigChangesUndefined: Self = StObject.set(x, "configChanges", js.undefined)
    
    inline def setConfigChangesVarargs(value: ConfigChange*): Self = StObject.set(x, "configChanges", js.Array(value :_*))
  }
}
