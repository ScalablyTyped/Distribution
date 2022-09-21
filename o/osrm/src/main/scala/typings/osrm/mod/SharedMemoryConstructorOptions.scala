package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedMemoryConstructorOptions
  extends StObject
     with ConstructorOptions {
  
  /**
    * Connects to the persistent shared memory datastore defined by --dataset_name option when running osrm-datastore.
    * This requires you to run osrm-datastore --dataset_name prior to creating an OSRM object.
    */
  var dataset_name: js.UndefOr[String] = js.undefined
  
  /**
    * Connects to the persistent shared memory datastore. This requires you to run osrm-datastore prior to creating an OSRM object.
    */
  var shared_memory: js.UndefOr[Boolean] = js.undefined
}
object SharedMemoryConstructorOptions {
  
  inline def apply(): SharedMemoryConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedMemoryConstructorOptions]
  }
  
  extension [Self <: SharedMemoryConstructorOptions](x: Self) {
    
    inline def setDataset_name(value: String): Self = StObject.set(x, "dataset_name", value.asInstanceOf[js.Any])
    
    inline def setDataset_nameUndefined: Self = StObject.set(x, "dataset_name", js.undefined)
    
    inline def setShared_memory(value: Boolean): Self = StObject.set(x, "shared_memory", value.asInstanceOf[js.Any])
    
    inline def setShared_memoryUndefined: Self = StObject.set(x, "shared_memory", js.undefined)
  }
}
