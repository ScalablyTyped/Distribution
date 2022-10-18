package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.ParentId
import typings.next.distTraceSharedMod.SpanId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceTraceMod {
  
  @JSImport("next/dist/trace/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/trace/trace", "Span")
  @js.native
  open class Span protected () extends StObject {
    def this(hasNameParentIdAttrsStartTime: ParentId) = this()
    
    var _start: js.BigInt = js.native
    
    var attrs: StringDictionary[Any] = js.native
    
    var duration: Double | Null = js.native
    
    var id: SpanId = js.native
    
    def manualTraceChild(name: String, startTime: js.BigInt, stopTime: js.BigInt): Unit = js.native
    def manualTraceChild(name: String, startTime: js.BigInt, stopTime: js.BigInt, attrs: js.Object): Unit = js.native
    
    var name: String = js.native
    
    var now: Double = js.native
    
    var parentId: js.UndefOr[SpanId] = js.native
    
    def setAttribute(key: String, value: Any): Unit = js.native
    
    var status: SpanStatus = js.native
    
    def stop(): Unit = js.native
    def stop(stopTime: js.BigInt): Unit = js.native
    
    def traceAsyncFn[T](fn: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
    
    def traceChild(name: String): Span = js.native
    def traceChild(name: String, attrs: js.Object): Span = js.native
    
    def traceFn[T](fn: js.Function0[T]): T = js.native
  }
  
  @js.native
  sealed trait SpanStatus extends StObject
  @JSImport("next/dist/trace/trace", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpanStatus & Double] = js.native
    
    @js.native
    sealed trait Started
      extends StObject
         with SpanStatus
    /* 0 */ val Started: typings.next.distTraceTraceMod.SpanStatus.Started & Double = js.native
    
    @js.native
    sealed trait Stopped
      extends StObject
         with SpanStatus
    /* 1 */ val Stopped: typings.next.distTraceTraceMod.SpanStatus.Stopped & Double = js.native
  }
  
  inline def flushAllTraces(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllTraces")().asInstanceOf[js.Promise[Unit]]
  
  inline def trace(name: String): Span = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any]).asInstanceOf[Span]
  inline def trace(name: String, parentId: Unit, attrs: StringDictionary[String]): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Span]
  inline def trace(name: String, parentId: SpanId): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[Span]
  inline def trace(name: String, parentId: SpanId, attrs: StringDictionary[String]): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Span]
}
