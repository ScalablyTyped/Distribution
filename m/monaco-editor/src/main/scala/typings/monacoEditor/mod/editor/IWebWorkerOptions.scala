package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebWorkerOptions extends StObject {
  
  /**
    * The data to send over when calling create on the module.
    */
  var createData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * An object that can be used by the web worker to make calls back to the main thread.
    */
  var host: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Keep idle models.
    * Defaults to false, which means that idle models will stop syncing after a while.
    */
  var keepIdleModels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A label to be used to identify the web worker for debugging purposes.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The AMD moduleId to load.
    * It should export a function `create` that should return the exported proxy.
    */
  var moduleId: String
}
object IWebWorkerOptions {
  
  inline def apply(moduleId: String): IWebWorkerOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebWorkerOptions]
  }
  
  extension [Self <: IWebWorkerOptions](x: Self) {
    
    inline def setCreateData(value: js.Any): Self = StObject.set(x, "createData", value.asInstanceOf[js.Any])
    
    inline def setCreateDataUndefined: Self = StObject.set(x, "createData", js.undefined)
    
    inline def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKeepIdleModels(value: Boolean): Self = StObject.set(x, "keepIdleModels", value.asInstanceOf[js.Any])
    
    inline def setKeepIdleModelsUndefined: Self = StObject.set(x, "keepIdleModels", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
