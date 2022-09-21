package typings.minilog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(namespace: String): Minilog = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[Minilog]
  
  @JSImport("minilog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("minilog", "Console")
  @js.native
  open class Console () extends Transform {
    
    //Only available on client
    var color: Transform = js.native
    
    //Only available on backend
    var formatClean: Transform = js.native
    
    var formatColor: Transform = js.native
    
    var formatLearnboost: Transform = js.native
    
    var formatMinilog: Transform = js.native
    
    var formatNpm: Transform = js.native
    
    var formatWithStack: Transform = js.native
    
    /**
      * List of available formatters
      */
    var formatters: js.Array[String] = js.native
    
    var minilog: Transform = js.native
  }
  
  @JSImport("minilog", "Filter")
  @js.native
  open class Filter () extends Transform {
    
    /**
      * Adds an entry to the whitelist
      * Returns this filter
      */
    def allow(name: Any): Filter = js.native
    def allow(name: Any, level: Any): Filter = js.native
    
    /**
      * Empties the whitelist and blacklist
      * Returns this filter
      */
    def clear(): Filter = js.native
    
    /**
      * specifies the behavior when a log line doesn't match either the whitelist or the blacklist.
      The default is true (= "allow by default") - lines that do not match the whitelist or the blacklist are not filtered (e.g. ).
      If you want to flip the default so that lines are filtered unless they are on the whitelist, set this to false (= "deny by default").
      */
    var defaultResult: Boolean = js.native
    
    /**
      * Adds an entry to the blacklist
      * Returns this filter
      */
    def deny(name: Any): Filter = js.native
    def deny(name: Any, level: Any): Filter = js.native
    
    /**
      * controls whether the filter is enabled. Default: true
      */
    var enabled: Boolean = js.native
    
    def test(name: Any, level: Any): Boolean = js.native
  }
  
  @JSImport("minilog", "Transform")
  @js.native
  open class Transform () extends StObject {
    
    def mixin(dest: Any): Unit = js.native
    
    def pipe(dest: Any): Any = js.native
    
    def unpipe(from: Any): Transform = js.native
    
    def write(name: Any, level: Any, args: Any): Unit = js.native
  }
  
  @JSImport("minilog", "backends")
  @js.native
  def backends: MinilogBackends = js.native
  inline def backends_=(x: MinilogBackends): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backends")(x.asInstanceOf[js.Any])
  
  @JSImport("minilog", "defaultBackend")
  @js.native
  def defaultBackend: Any = js.native
  inline def defaultBackend_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBackend")(x.asInstanceOf[js.Any])
  
  @JSImport("minilog", "defaultFormatter")
  @js.native
  def defaultFormatter: String = js.native
  inline def defaultFormatter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(x.asInstanceOf[js.Any])
  
  inline def disable(): Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Minilog]
  
  inline def enable(): Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Minilog]
  
  inline def pipe(dest: Any): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(dest.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("minilog", "suggest")
  @js.native
  def suggest: Filter = js.native
  inline def suggest_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  
  trait Minilog extends StObject {
    
    def debug(msg: Any*): Minilog
    
    def error(msg: Any*): Minilog
    
    def info(msg: Any*): Minilog
    
    def log(msg: Any*): Minilog
    
    def warn(msg: Any*): Minilog
  }
  object Minilog {
    
    inline def apply(
      debug: /* repeated */ Any => Minilog,
      error: /* repeated */ Any => Minilog,
      info: /* repeated */ Any => Minilog,
      log: /* repeated */ Any => Minilog,
      warn: /* repeated */ Any => Minilog
    ): Minilog = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Minilog]
    }
    
    extension [Self <: Minilog](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Minilog): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Minilog): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Minilog): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Minilog): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Minilog): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait MinilogBackends extends StObject {
    
    var array: Any
    
    var browser: Any
    
    var console: Console
    
    var jQuery: Any
    
    var localstorage: Any
  }
  object MinilogBackends {
    
    inline def apply(array: Any, browser: Any, console: Console, jQuery: Any, localstorage: Any): MinilogBackends = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], jQuery = jQuery.asInstanceOf[js.Any], localstorage = localstorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinilogBackends]
    }
    
    extension [Self <: MinilogBackends](x: Self) {
      
      inline def setArray(value: Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setBrowser(value: Any): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setJQuery(value: Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      inline def setLocalstorage(value: Any): Self = StObject.set(x, "localstorage", value.asInstanceOf[js.Any])
    }
  }
}
