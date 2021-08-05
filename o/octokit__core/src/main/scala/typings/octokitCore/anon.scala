package typings.octokitCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(message: String): js.Any
    
    def error(message: String): js.Any
    
    def info(message: String): js.Any
    
    def warn(message: String): js.Any
  }
  object Debug {
    
    inline def apply(debug: String => js.Any, error: String => js.Any, info: String => js.Any, warn: String => js.Any): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: String => js.Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: String => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => js.Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: String => js.Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
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
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]
  
  @js.native
  trait InstantiablePlugins
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]] {
    
    var plugins: js.Array[js.Any] = js.native
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[js.Any]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[js.Any]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
