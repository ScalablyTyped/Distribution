package typings.metro.anon

import typings.metro.srcDeltaBundlerTypesMod.Module
import typings.metro.srcIncrementalBundlerMod.OutputGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  graph :metro.metro/src/IncrementalBundler.OutputGraph,   prepend :std.ReadonlyArray<metro.metro/src/DeltaBundler.Module<void>>}> */
trait ReadonlygraphOutputGraphp extends StObject {
  
  val graph: OutputGraph
  
  val prepend: js.Array[Module[Unit]]
}
object ReadonlygraphOutputGraphp {
  
  inline def apply(graph: OutputGraph, prepend: js.Array[Module[Unit]]): ReadonlygraphOutputGraphp = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], prepend = prepend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlygraphOutputGraphp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlygraphOutputGraphp] (val x: Self) extends AnyVal {
    
    inline def setGraph(value: OutputGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setPrepend(value: js.Array[Module[Unit]]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    inline def setPrependVarargs(value: Module[Unit]*): Self = StObject.set(x, "prepend", js.Array(value*))
  }
}
