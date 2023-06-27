package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /**
    * user specific data which is available during the whole lifecycle of the component
    */
  var componentData: js.UndefOr[Any] = js.undefined
  
  /**
    * ID for the component instance
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * name of the component to import
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * settings object for the component
    */
  var settings: js.UndefOr[js.Object] = js.undefined
  
  /**
    * URL to load the component from
    */
  var url: js.UndefOr[String] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setComponentData(value: Any): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
    
    inline def setComponentDataUndefined: Self = StObject.set(x, "componentData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
