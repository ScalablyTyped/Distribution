package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.ParentId
import typings.next.distTraceSharedMod.SpanId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceMod {
  
  @JSImport("next/dist/trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/trace", "Span")
  @js.native
  open class Span protected ()
    extends typings.next.distTraceTraceMod.Span {
    def this(param0: ParentId) = this()
  }
  
  @JSImport("next/dist/trace", "SpanStatus")
  @js.native
  object SpanStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.next.distTraceTraceMod.SpanStatus & Double] = js.native
    
    /* 0 */ val Started: typings.next.distTraceTraceMod.SpanStatus.Started & Double = js.native
    
    /* 1 */ val Stopped: typings.next.distTraceTraceMod.SpanStatus.Stopped & Double = js.native
  }
  
  inline def flushAllTraces(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllTraces")().asInstanceOf[js.Promise[Unit]]
  
  inline def setGlobal(key: Any, `val`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trace(name: String): typings.next.distTraceTraceMod.Span = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any]).asInstanceOf[typings.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: Unit, attrs: StringDictionary[String]): typings.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typings.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: SpanId): typings.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[typings.next.distTraceTraceMod.Span]
  inline def trace(name: String, parentId: SpanId, attrs: StringDictionary[String]): typings.next.distTraceTraceMod.Span = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(name.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typings.next.distTraceTraceMod.Span]
}
