package typings.nginstackEngine

import typings.nginstackEngine.anon.Method
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventAdapterMod {
  
  inline def apply(
    emitter: typings.nginstackEngine.libEventEmitterMod.^,
    descriptor: typings.nginstackEngine.libEventAdapterDescriptorMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(emitter: typings.nginstackEngine.libEventEmitterMod.^, descriptor: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/Adapter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Adapter {
    def this(
      emitter: typings.nginstackEngine.libEventEmitterMod.^,
      descriptor: typings.nginstackEngine.libEventAdapterDescriptorMod.^
    ) = this()
    def this(emitter: typings.nginstackEngine.libEventEmitterMod.^, descriptor: Record[Any, Any]) = this()
  }
  @JSImport("@nginstack/engine/lib/event/Adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptEvent(obj: Any, name: String, adapterDescriptor: typings.nginstackEngine.libEventAdapterDescriptorMod.^): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptEvent")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], adapterDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def adaptEvent(obj: Any, name: String, adapterDescriptor: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptEvent")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], adapterDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Adapter extends StObject {
    
    def assign(source: Adapter): Unit = js.native
    def assign(source: Adapter, opt_preserveMethods: Boolean): Unit = js.native
    def assign(source: Event): Unit = js.native
    def assign(source: Event, opt_preserveMethods: Boolean): Unit = js.native
    
    def clear(): Unit = js.native
    
    var clearMethods: Any = js.native
    
    /* private */ var descriptor_ : Any = js.native
    
    def dispatch(args: Any*): Any = js.native
    
    var duplicates: String = js.native
    
    /* private */ var emitter_ : Any = js.native
    
    var isEmpty: Boolean = js.native
    
    var methods: js.Array[js.Function1[/* arg0 */ Any, Any]] = js.native
    
    /* private */ var nonDescribedParameters_ : Any = js.native
    
    def set(listener: js.Function1[/* arg0 */ Any, Any]): Unit = js.native
    def set(listener: Method): Unit = js.native
    
    /* private */ var updateEventWithArguments_ : Any = js.native
  }
  
  type Event = typings.nginstackEngine.libEventEventMod.^
}
