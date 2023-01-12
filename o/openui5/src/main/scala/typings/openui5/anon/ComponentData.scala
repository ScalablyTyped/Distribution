package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentData extends StObject {
  
  /**
    * Indicates whether the component creation is done asynchronously (You should use synchronous creation
    * only if really necessary, because this has a negative impact on performance.)
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial data of the component (@see sap.ui.core.Component#getComponentData)
    */
  var componentData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * ID of the nested component that is prefixed with `autoPrefixId`
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for the nested component like for {#link sap.ui.component} or the component constructor
    */
  var settings: js.UndefOr[js.Object] = js.undefined
  
  /**
    * ID of component usage
    */
  var usage: String
}
object ComponentData {
  
  inline def apply(usage: String): ComponentData = {
    val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentData] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComponentData(value: js.Object): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
    
    inline def setComponentDataUndefined: Self = StObject.set(x, "componentData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
