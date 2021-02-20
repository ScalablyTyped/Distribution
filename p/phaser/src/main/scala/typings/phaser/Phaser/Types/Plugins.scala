package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  @js.native
  trait CorePluginContainer extends StObject {
    
    /**
      * Core Scene plugin or a Custom Scene plugin?
      */
    var custom: js.UndefOr[Boolean] = js.native
    
    /**
      * The unique name of this plugin in the core plugin cache.
      */
    var key: String = js.native
    
    /**
      * If this plugin is to be injected into the Scene Systems, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.native
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function = js.native
  }
  object CorePluginContainer {
    
    @scala.inline
    def apply(key: String, plugin: js.Function): CorePluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorePluginContainer]
    }
    
    @scala.inline
    implicit class CorePluginContainerMutableBuilder[Self <: CorePluginContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      @scala.inline
      def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomPluginContainer extends StObject {
    
    /**
      * The unique name of this plugin in the custom plugin cache.
      */
    var key: String = js.native
    
    /**
      * The plugin to be stored. Should be the source object, not instantiated.
      */
    var plugin: js.Function = js.native
  }
  object CustomPluginContainer {
    
    @scala.inline
    def apply(key: String, plugin: js.Function): CustomPluginContainer = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPluginContainer]
    }
    
    @scala.inline
    implicit class CustomPluginContainerMutableBuilder[Self <: CustomPluginContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalPlugin extends StObject {
    
    /**
      * Is the plugin active or not?
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * The unique name of this plugin within the plugin cache.
      */
    var key: String = js.native
    
    /**
      * If this plugin is to be injected into the Scene Systems, this is the property key map used.
      */
    var mapping: js.UndefOr[String] = js.native
    
    /**
      * An instance of the plugin.
      */
    var plugin: js.Function = js.native
  }
  object GlobalPlugin {
    
    @scala.inline
    def apply(key: String, plugin: js.Function): GlobalPlugin = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalPlugin]
    }
    
    @scala.inline
    implicit class GlobalPluginMutableBuilder[Self <: GlobalPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      @scala.inline
      def setPlugin(value: js.Function): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
