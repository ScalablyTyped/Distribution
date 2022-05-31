package typings.minilog

import typings.minilog.mod.MinilogBackends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Minilog {
    
    inline def apply(namespace: String): typings.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[typings.minilog.mod.Minilog]
    
    @JSGlobal("Minilog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Minilog.Console")
    @js.native
    class Console ()
      extends typings.minilog.mod.Console
    
    @JSGlobal("Minilog.Filter")
    @js.native
    class Filter ()
      extends typings.minilog.mod.Filter
    
    @JSGlobal("Minilog.Transform")
    @js.native
    class Transform ()
      extends typings.minilog.mod.Transform
    
    @JSGlobal("Minilog.backends")
    @js.native
    def backends: MinilogBackends = js.native
    inline def backends_=(x: MinilogBackends): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backends")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Minilog.defaultBackend")
    @js.native
    def defaultBackend: js.Any = js.native
    inline def defaultBackend_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBackend")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Minilog.defaultFormatter")
    @js.native
    def defaultFormatter: String = js.native
    inline def defaultFormatter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(x.asInstanceOf[js.Any])
    
    inline def disable(): typings.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[typings.minilog.mod.Minilog]
    
    inline def enable(): typings.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[typings.minilog.mod.Minilog]
    
    inline def pipe(dest: js.Any): typings.minilog.mod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.minilog.mod.Transform]
    
    @JSGlobal("Minilog.suggest")
    @js.native
    def suggest: typings.minilog.mod.Filter = js.native
    inline def suggest_=(x: typings.minilog.mod.Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  }
}
