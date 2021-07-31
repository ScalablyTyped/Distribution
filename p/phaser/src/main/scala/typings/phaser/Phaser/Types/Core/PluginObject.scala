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
  
  @scala.inline
  def apply(): PluginObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginObject]
  }
  
  @scala.inline
  implicit class PluginObjectMutableBuilder[Self <: PluginObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMerge(value: js.Array[String]): Self = StObject.set(x, "defaultMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMergeUndefined: Self = StObject.set(x, "defaultMerge", js.undefined)
    
    @scala.inline
    def setDefaultMergeVarargs(value: String*): Self = StObject.set(x, "defaultMerge", js.Array(value :_*))
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    @scala.inline
    def setGlobal(value: js.Array[PluginObjectItem]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setGlobalVarargs(value: PluginObjectItem*): Self = StObject.set(x, "global", js.Array(value :_*))
    
    @scala.inline
    def setScene(value: js.Array[PluginObjectItem]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setSceneVarargs(value: PluginObjectItem*): Self = StObject.set(x, "scene", js.Array(value :_*))
  }
}
