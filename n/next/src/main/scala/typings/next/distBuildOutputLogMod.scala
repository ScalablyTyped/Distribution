package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildOutputLogMod {
  
  @JSImport("next/dist/build/output/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def event(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  object prefixes {
    
    @JSImport("next/dist/build/output/log", "prefixes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/build/output/log", "prefixes.error")
    @js.native
    def error: String = js.native
    inline def error_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.event")
    @js.native
    def event: String = js.native
    inline def event_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("event")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.info")
    @js.native
    def info: String = js.native
    inline def info_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.ready")
    @js.native
    def ready: String = js.native
    inline def ready_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.trace")
    @js.native
    def trace: String = js.native
    inline def trace_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.wait")
    @js.native
    def wait_ : String = js.native
    
    inline def wait__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wait")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/build/output/log", "prefixes.warn")
    @js.native
    def warn: String = js.native
    inline def warn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  inline def ready(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def trace(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def wait_(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(message: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
