package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginObjectItem extends StObject {
  
  /**
    * Arbitrary data passed to the plugin's init() method.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A key to identify the plugin in the Plugin Manager.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  
  /**
    * The plugin itself. Usually a class/constructor.
    */
  var plugin: js.UndefOr[js.Any] = js.undefined
  
  /**
    * For a scene plugin, add the plugin to the scene object under this key (`this.KEY`, from the scene).
    */
  var sceneKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the plugin should be started automatically.
    */
  var start: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For a scene plugin, add the plugin to the scene's systems object under this key (`this.sys.KEY`, from the scene).
    */
  var systemKey: js.UndefOr[String] = js.undefined
}
object PluginObjectItem {
  
  inline def apply(): PluginObjectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObjectItem]
  }
  
  extension [Self <: PluginObjectItem](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setPlugin(value: js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setSceneKey(value: String): Self = StObject.set(x, "sceneKey", value.asInstanceOf[js.Any])
    
    inline def setSceneKeyUndefined: Self = StObject.set(x, "sceneKey", js.undefined)
    
    inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemKeyUndefined: Self = StObject.set(x, "systemKey", js.undefined)
  }
}
