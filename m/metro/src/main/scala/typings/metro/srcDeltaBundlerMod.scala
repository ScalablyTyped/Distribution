package typings.metro

import typings.metro.anon.Reset
import typings.metro.srcDeltaBundlerTypesMod.DeltaResult
import typings.metro.srcDeltaBundlerTypesMod.GraphInputOptions
import typings.metro.srcDeltaBundlerTypesMod.Options
import typings.metro.srcDeltaBundlerTypesMod.ReadOnlyDependencies
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeltaBundlerMod {
  
  @JSImport("metro/src/DeltaBundler", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with DeltaBundler[T] {
    def this(changeEventSource: EventEmitter) = this()
    
    /* CompleteClass */
    override def buildGraph(entryPoints: js.Array[String], options: Options[T]): js.Promise[typings.metro.srcDeltaBundlerTypesMod.Graph[T]] = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def endGraph(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T]): Unit = js.native
    
    /* CompleteClass */
    override def getDelta(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T], param1: Reset): js.Promise[DeltaResult[T]] = js.native
    
    /* CompleteClass */
    override def getDependencies(entryPoints: js.Array[String], options: Options[T]): js.Promise[ReadOnlyDependencies[T]] = js.native
    
    /* CompleteClass */
    override def listen(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T], callback: js.Function0[js.Promise[Unit]]): js.Function0[Unit] = js.native
  }
  
  @JSImport("metro/src/DeltaBundler", "Graph")
  @js.native
  open class Graph[T] protected ()
    extends typings.metro.srcDeltaBundlerGraphMod.Graph[T] {
    def this(options: GraphInputOptions) = this()
  }
  
  trait DeltaBundler[T] extends StObject {
    
    def buildGraph(entryPoints: js.Array[String], options: Options[T]): js.Promise[typings.metro.srcDeltaBundlerTypesMod.Graph[T]]
    
    def end(): Unit
    
    def endGraph(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T]): Unit
    
    def getDelta(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T], param1: Reset): js.Promise[DeltaResult[T]]
    
    def getDependencies(entryPoints: js.Array[String], options: Options[T]): js.Promise[ReadOnlyDependencies[T]]
    
    def listen(graph: typings.metro.srcDeltaBundlerTypesMod.Graph[T], callback: js.Function0[js.Promise[Unit]]): js.Function0[Unit]
  }
  object DeltaBundler {
    
    inline def apply[T](
      buildGraph: (js.Array[String], Options[T]) => js.Promise[typings.metro.srcDeltaBundlerTypesMod.Graph[T]],
      end: () => Unit,
      endGraph: typings.metro.srcDeltaBundlerTypesMod.Graph[T] => Unit,
      getDelta: (typings.metro.srcDeltaBundlerTypesMod.Graph[T], Reset) => js.Promise[DeltaResult[T]],
      getDependencies: (js.Array[String], Options[T]) => js.Promise[ReadOnlyDependencies[T]],
      listen: (typings.metro.srcDeltaBundlerTypesMod.Graph[T], js.Function0[js.Promise[Unit]]) => js.Function0[Unit]
    ): DeltaBundler[T] = {
      val __obj = js.Dynamic.literal(buildGraph = js.Any.fromFunction2(buildGraph), end = js.Any.fromFunction0(end), endGraph = js.Any.fromFunction1(endGraph), getDelta = js.Any.fromFunction2(getDelta), getDependencies = js.Any.fromFunction2(getDependencies), listen = js.Any.fromFunction2(listen))
      __obj.asInstanceOf[DeltaBundler[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeltaBundler[?], T] (val x: Self & DeltaBundler[T]) extends AnyVal {
      
      inline def setBuildGraph(
        value: (js.Array[String], Options[T]) => js.Promise[typings.metro.srcDeltaBundlerTypesMod.Graph[T]]
      ): Self = StObject.set(x, "buildGraph", js.Any.fromFunction2(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setEndGraph(value: typings.metro.srcDeltaBundlerTypesMod.Graph[T] => Unit): Self = StObject.set(x, "endGraph", js.Any.fromFunction1(value))
      
      inline def setGetDelta(value: (typings.metro.srcDeltaBundlerTypesMod.Graph[T], Reset) => js.Promise[DeltaResult[T]]): Self = StObject.set(x, "getDelta", js.Any.fromFunction2(value))
      
      inline def setGetDependencies(value: (js.Array[String], Options[T]) => js.Promise[ReadOnlyDependencies[T]]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction2(value))
      
      inline def setListen(
        value: (typings.metro.srcDeltaBundlerTypesMod.Graph[T], js.Function0[js.Promise[Unit]]) => js.Function0[Unit]
      ): Self = StObject.set(x, "listen", js.Any.fromFunction2(value))
    }
  }
}
