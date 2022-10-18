package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncSyncEventMod {
  
  inline def apply(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(eventName: String, opt_manualReset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], opt_manualReset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(eventName: String, opt_manualReset: Boolean, opt_osScope: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], opt_manualReset.asInstanceOf[js.Any], opt_osScope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(eventName: String, opt_manualReset: Unit, opt_osScope: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(eventName.asInstanceOf[js.Any], opt_manualReset.asInstanceOf[js.Any], opt_osScope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/sync/SyncEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SyncEvent {
    def this(eventName: String) = this()
    def this(eventName: String, opt_manualReset: Boolean) = this()
    def this(eventName: String, opt_manualReset: Boolean, opt_osScope: Boolean) = this()
    def this(eventName: String, opt_manualReset: Unit, opt_osScope: Boolean) = this()
  }
  @JSImport("@nginstack/engine/lib/sync/SyncEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait SyncEvent extends StObject {
    
    def resetEvent(): Unit = js.native
    
    def setEvent(): Unit = js.native
    
    def wait(opt_timeout: Double): Boolean = js.native
  }
}
