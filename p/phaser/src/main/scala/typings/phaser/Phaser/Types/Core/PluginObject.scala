package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginObject extends StObject {
  
  /**
    * The default set of scene plugins (names).
    */
  var default: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Plugins to *add* to the default set of scene plugins.
    */
  var defaultMerge: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Global plugins to install.
    */
  var global: js.UndefOr[js.Array[PluginObjectItem]] = js.undefined
  
  /**
    * Scene plugins to install.
    */
  var scene: js.UndefOr[js.Array[PluginObjectItem]] = js.undefined
}
object PluginObject {
  
  inline def apply(): PluginObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObject]
  }
  
  extension [Self <: PluginObject](x: Self) {
    
    inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultMerge(value: js.Array[String]): Self = StObject.set(x, "defaultMerge", value.asInstanceOf[js.Any])
    
    inline def setDefaultMergeUndefined: Self = StObject.set(x, "defaultMerge", js.undefined)
    
    inline def setDefaultMergeVarargs(value: String*): Self = StObject.set(x, "defaultMerge", js.Array(value*))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setGlobal(value: js.Array[PluginObjectItem]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setGlobalVarargs(value: PluginObjectItem*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setScene(value: js.Array[PluginObjectItem]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    inline def setSceneVarargs(value: PluginObjectItem*): Self = StObject.set(x, "scene", js.Array(value*))
  }
}
