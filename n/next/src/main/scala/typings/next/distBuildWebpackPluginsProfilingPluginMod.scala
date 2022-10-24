package typings.next

import typings.next.anon.Attrs
import typings.next.anon.RunWebpackSpan
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.next.distTraceMod.Span
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsProfilingPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/profiling-plugin", "ProfilingPlugin")
  @js.native
  open class ProfilingPlugin protected () extends StObject {
    def this(param0: RunWebpackSpan) = this()
    
    @JSName("apply")
    def apply(compiler: Any): Unit = js.native
    
    var compiler: Any = js.native
    
    var runWebpackSpan: Span = js.native
    
    def traceCompilationHooks(compiler: Any): Unit = js.native
    
    def traceHookPair(spanName: String, startHook: Any, stopHook: Any): Unit = js.native
    def traceHookPair(spanName: String, startHook: Any, stopHook: Any, param3: Attrs): Unit = js.native
    def traceHookPair(spanName: js.Function0[String], startHook: Any, stopHook: Any): Unit = js.native
    def traceHookPair(spanName: js.Function0[String], startHook: Any, stopHook: Any, param3: Attrs): Unit = js.native
    
    def traceTopLevelHooks(compiler: Any): Unit = js.native
  }
  
  @JSImport("next/dist/build/webpack/plugins/profiling-plugin", "spans")
  @js.native
  val spans: WeakMap[Compiler | Compilation, Span] = js.native
  
  @JSImport("next/dist/build/webpack/plugins/profiling-plugin", "webpackInvalidSpans")
  @js.native
  val webpackInvalidSpans: WeakMap[Any, Span] = js.native
}
