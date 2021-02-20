package typings.octokitCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Debug extends StObject {
    
    def debug(message: String): js.Any = js.native
    
    def error(message: String): js.Any = js.native
    
    def info(message: String): js.Any = js.native
    
    def warn(message: String): js.Any = js.native
  }
  object Debug {
    
    @scala.inline
    def apply(debug: String => js.Any, error: String => js.Any, info: String => js.Any, warn: String => js.Any): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String => js.Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: String => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: String => js.Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => js.Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    def debug(message: String): js.Any = js.native
    def debug(message: String, additionalInfo: js.Object): js.Any = js.native
    
    def error(message: String): js.Any = js.native
    def error(message: String, additionalInfo: js.Object): js.Any = js.native
    
    def info(message: String): js.Any = js.native
    def info(message: String, additionalInfo: js.Object): js.Any = js.native
    
    def warn(message: String): js.Any = js.native
    def warn(message: String, additionalInfo: js.Object): js.Any = js.native
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]
  
  @js.native
  trait InstantiablePlugins
    extends Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]] {
    
    var plugins: js.Array[_] = js.native
  }
  
  @js.native
  trait Plugins extends StObject {
    
    var plugins: js.Array[_] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply(plugins: js.Array[_]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
