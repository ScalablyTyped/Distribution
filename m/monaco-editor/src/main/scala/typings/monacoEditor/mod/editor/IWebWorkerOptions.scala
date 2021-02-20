package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebWorkerOptions extends StObject {
  
  /**
    * The data to send over when calling create on the module.
    */
  var createData: js.UndefOr[js.Any] = js.native
  
  /**
    * An object that can be used by the web worker to make calls back to the main thread.
    */
  var host: js.UndefOr[js.Any] = js.native
  
  /**
    * Keep idle models.
    * Defaults to false, which means that idle models will stop syncing after a while.
    */
  var keepIdleModels: js.UndefOr[Boolean] = js.native
  
  /**
    * A label to be used to identify the web worker for debugging purposes.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The AMD moduleId to load.
    * It should export a function `create` that should return the exported proxy.
    */
  var moduleId: String = js.native
}
object IWebWorkerOptions {
  
  @scala.inline
  def apply(moduleId: String): IWebWorkerOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebWorkerOptions]
  }
  
  @scala.inline
  implicit class IWebWorkerOptionsMutableBuilder[Self <: IWebWorkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateData(value: js.Any): Self = StObject.set(x, "createData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDataUndefined: Self = StObject.set(x, "createData", js.undefined)
    
    @scala.inline
    def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setKeepIdleModels(value: Boolean): Self = StObject.set(x, "keepIdleModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepIdleModelsUndefined: Self = StObject.set(x, "keepIdleModels", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
