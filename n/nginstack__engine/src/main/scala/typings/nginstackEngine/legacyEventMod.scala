package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyEventMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/LegacyEvent", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LegacyEvent
  @JSImport("@nginstack/engine/lib/event/LegacyEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeEventMethod(methodIndex: Any, params: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("executeEventMethod")(methodIndex.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def inherited(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inherited")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/event/LegacyEvent", "inheritedEvent")
  @js.native
  val inheritedEvent: Any = js.native
  
  @JSImport("@nginstack/engine/lib/event/LegacyEvent", "inheritedEventsMethodsStack")
  @js.native
  val inheritedEventsMethodsStack: js.Array[Any] = js.native
  
  @JSImport("@nginstack/engine/lib/event/LegacyEvent", "inheritedIndexEventsMethods")
  @js.native
  val inheritedIndexEventsMethods: Double = js.native
  
  @js.native
  trait LegacyEvent extends StObject {
    
    /* private */ var _indexOf: Any = js.native
    
    var _methods: js.Array[typings.nginstackEngine.legacyMethodMod.^ | (js.Function1[/* arg0 */ Any, Any])] = js.native
    
    /* private */ var _scriptMethodsCache: Any = js.native
    
    def assign(source: LegacyEvent, preserveMethods: Boolean): Unit = js.native
    
    def assignAddingMethods(source: LegacyEvent): Unit = js.native
    
    def clear(): Unit = js.native
    
    def clearMethods(): Unit = js.native
    
    def dispatch(args: Any*): Any = js.native
    
    def dispatchWithParameterArray(params: js.Array[Any]): Any = js.native
    
    var duplicates: String = js.native
    
    /* private */ var getMethod: Any = js.native
    
    var isEmpty: Boolean = js.native
    
    def set(method: js.Function1[/* arg0 */ Any, Any]): Unit = js.native
    def set(method: typings.nginstackEngine.legacyMethodMod.^): Unit = js.native
  }
}
