package typings.minilog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minilog", JSImport.Namespace)
  @js.native
  def apply(namespace: String): Minilog = js.native
  
  @JSImport("minilog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("minilog", "Console")
  @js.native
  class Console () extends Transform {
    
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
  class Filter () extends Transform {
    
    /**
      * Adds an entry to the whitelist
      * Returns this filter
      */
    def allow(name: js.Any): Filter = js.native
    def allow(name: js.Any, level: js.Any): Filter = js.native
    
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
    def deny(name: js.Any): Filter = js.native
    def deny(name: js.Any, level: js.Any): Filter = js.native
    
    /**
      * controls whether the filter is enabled. Default: true
      */
    var enabled: Boolean = js.native
    
    def test(name: js.Any, level: js.Any): Boolean = js.native
  }
  
  @JSImport("minilog", "Transform")
  @js.native
  class Transform () extends StObject {
    
    def mixin(dest: js.Any): Unit = js.native
    
    def pipe(dest: js.Any): js.Any = js.native
    
    def unpipe(from: js.Any): Transform = js.native
    
    def write(name: js.Any, level: js.Any, args: js.Any): Unit = js.native
  }
  
  @JSImport("minilog", "backends")
  @js.native
  def backends: MinilogBackends = js.native
  @scala.inline
  def backends_=(x: MinilogBackends): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backends")(x.asInstanceOf[js.Any])
  
  @JSImport("minilog", "defaultBackend")
  @js.native
  def defaultBackend: js.Any = js.native
  @scala.inline
  def defaultBackend_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBackend")(x.asInstanceOf[js.Any])
  
  @JSImport("minilog", "defaultFormatter")
  @js.native
  def defaultFormatter: String = js.native
  @scala.inline
  def defaultFormatter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(x.asInstanceOf[js.Any])
  
  @JSImport("minilog", "disable")
  @js.native
  def disable(): Minilog = js.native
  
  @JSImport("minilog", "enable")
  @js.native
  def enable(): Minilog = js.native
  
  @JSImport("minilog", "pipe")
  @js.native
  def pipe(dest: js.Any): Transform = js.native
  
  @JSImport("minilog", "suggest")
  @js.native
  def suggest: Filter = js.native
  @scala.inline
  def suggest_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Minilog extends StObject {
    
    def debug(msg: js.Any*): Minilog = js.native
    
    def error(msg: js.Any*): Minilog = js.native
    
    def info(msg: js.Any*): Minilog = js.native
    
    def log(msg: js.Any*): Minilog = js.native
    
    def warn(msg: js.Any*): Minilog = js.native
  }
  object Minilog {
    
    @scala.inline
    def apply(
      debug: /* repeated */ js.Any => Minilog,
      error: /* repeated */ js.Any => Minilog,
      info: /* repeated */ js.Any => Minilog,
      log: /* repeated */ js.Any => Minilog,
      warn: /* repeated */ js.Any => Minilog
    ): Minilog = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Minilog]
    }
    
    @scala.inline
    implicit class MinilogMutableBuilder[Self <: Minilog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Minilog): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Minilog): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Minilog): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Minilog): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: /* repeated */ js.Any => Minilog): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MinilogBackends extends StObject {
    
    var array: js.Any = js.native
    
    var browser: js.Any = js.native
    
    var console: Console = js.native
    
    var jQuery: js.Any = js.native
    
    var localstorage: js.Any = js.native
  }
  object MinilogBackends {
    
    @scala.inline
    def apply(array: js.Any, browser: js.Any, console: Console, jQuery: js.Any, localstorage: js.Any): MinilogBackends = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], jQuery = jQuery.asInstanceOf[js.Any], localstorage = localstorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinilogBackends]
    }
    
    @scala.inline
    implicit class MinilogBackendsMutableBuilder[Self <: MinilogBackends] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: js.Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowser(value: js.Any): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJQuery(value: js.Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalstorage(value: js.Any): Self = StObject.set(x, "localstorage", value.asInstanceOf[js.Any])
    }
  }
}
