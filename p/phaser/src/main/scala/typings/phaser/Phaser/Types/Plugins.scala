package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  trait CorePluginContainer extends StObject {
    
    /**
      * Core Scene plugin or a Custom Scene plugin?
      */
    var custom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The unique name of this plugin in the core plugin cache.
      */
    var key: String
    
    /**
      * If this plugin is to be injected into the Scene Systems, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.undefined
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function
  }
  object CorePluginContainer {
    
    inline def apply(key: String, plugin: js.Function): CorePluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorePluginContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CorePluginContainer] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomPluginContainer extends StObject {
    
    /**
      * The unique name of this plugin in the custom plugin cache.
      */
    var key: String
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function
  }
  object CustomPluginContainer {
    
    inline def apply(key: String, plugin: js.Function): CustomPluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPluginContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomPluginContainer] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalPlugin extends StObject {
    
    /**
      * Is the plugin active or not?
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The unique name of this plugin within the plugin cache.
      */
    var key: String
    
    /**
      * If this plugin is to be injected into the Scene Systems, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.undefined
    
    /**
      * An instance of the plugin.
      */
    var plugin: js.Function
  }
  object GlobalPlugin {
    
    inline def apply(key: String, plugin: js.Function): GlobalPlugin = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalPlugin] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
