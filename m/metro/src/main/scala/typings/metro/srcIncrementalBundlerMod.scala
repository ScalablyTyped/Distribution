package typings.metro

import typings.metro.anon.Delta
import typings.metro.anon.ReadonlygraphOutputGraphp
import typings.metro.srcDeltaBundlerMod.Graph
import typings.metro.srcDeltaBundlerTypesMod.Module
import typings.metro.srcDeltaBundlerTypesMod.ReadOnlyDependencies
import typings.metro.srcDeltaBundlerTypesMod.TransformInputOptions
import typings.metro.srcLibGetGraphIdMod.GraphId
import typings.metro.srcSharedTypesMod.ResolverInputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIncrementalBundlerMod {
  
  @JSImport("metro/src/IncrementalBundler", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IncrementalBundler {
    def this(config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any) = this()
    def this(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
      options: IncrementalBundlerOptions
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("metro/src/IncrementalBundler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def revisionIdFromString(str: String): RevisionId = ^.asInstanceOf[js.Dynamic].applyDynamic("revisionIdFromString")(str.asInstanceOf[js.Any]).asInstanceOf[RevisionId]
  }
  
  trait GraphRevision extends StObject {
    
    val date: js.Date
    
    val graph: OutputGraph
    
    val graphId: GraphId
    
    val id: RevisionId
    
    val prepend: js.Array[Module[Unit]]
  }
  object GraphRevision {
    
    inline def apply(
      date: js.Date,
      graph: OutputGraph,
      graphId: GraphId,
      id: RevisionId,
      prepend: js.Array[Module[Unit]]
    ): GraphRevision = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], graphId = graphId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], prepend = prepend.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphRevision]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphRevision] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: OutputGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphId(value: GraphId): Self = StObject.set(x, "graphId", value.asInstanceOf[js.Any])
      
      inline def setId(value: RevisionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrepend(value: js.Array[Module[Unit]]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependVarargs(value: Module[Unit]*): Self = StObject.set(x, "prepend", js.Array(value*))
    }
  }
  
  @js.native
  trait IncrementalBundler extends StObject {
    
    def buildGraph(entryFile: String, transformOptions: TransformInputOptions, resolverOptions: ResolverInputOptions): js.Promise[ReadonlygraphOutputGraphp] = js.native
    def buildGraph(
      entryFile: String,
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions,
      otherOptions: OtherOptions
    ): js.Promise[ReadonlygraphOutputGraphp] = js.native
    
    def buildGraphForEntries(
      entryFiles: js.Array[String],
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions
    ): js.Promise[OutputGraph] = js.native
    def buildGraphForEntries(
      entryFiles: js.Array[String],
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions,
      otherOptions: OtherOptions
    ): js.Promise[OutputGraph] = js.native
    
    def end(): Unit = js.native
    
    def endGraph(graphId: GraphId): js.Promise[Unit] = js.native
    
    def getBundler(): typings.metro.srcBundlerMod.default = js.native
    
    def getDeltaBundler(): typings.metro.srcDeltaBundlerMod.default[Unit] = js.native
    
    def getDependencies(
      entryFiles: js.Array[String],
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions
    ): js.Promise[ReadOnlyDependencies[Unit]] = js.native
    def getDependencies(
      entryFiles: js.Array[String],
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions,
      otherOptions: OtherOptions
    ): js.Promise[ReadOnlyDependencies[Unit]] = js.native
    
    def getRevision(revisionId: RevisionId): js.Promise[GraphRevision] | Null = js.native
    
    def getRevisionByGraphId(graphId: GraphId): js.Promise[GraphRevision] | Null = js.native
    
    def initializeGraph(entryFile: String, transformOptions: TransformInputOptions, resolverOptions: ResolverInputOptions): js.Promise[Delta] = js.native
    def initializeGraph(
      entryFile: String,
      transformOptions: TransformInputOptions,
      resolverOptions: ResolverInputOptions,
      otherOptions: OtherOptions
    ): js.Promise[Delta] = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def updateGraph(revision: GraphRevision, reset: Boolean): js.Promise[Delta] = js.native
  }
  
  trait IncrementalBundlerOptions extends StObject {
    
    val hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    val watch: js.UndefOr[Boolean] = js.undefined
  }
  object IncrementalBundlerOptions {
    
    inline def apply(): IncrementalBundlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncrementalBundlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncrementalBundlerOptions] (val x: Self) extends AnyVal {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait OtherOptions extends StObject {
    
    val onProgress: (js.Function2[/* numProcessed */ Double, /* total */ Double, Any]) | Null
    
    val shallow: Boolean
  }
  object OtherOptions {
    
    inline def apply(shallow: Boolean): OtherOptions = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any], onProgress = null)
      __obj.asInstanceOf[OtherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OtherOptions] (val x: Self) extends AnyVal {
      
      inline def setOnProgress(value: (/* numProcessed */ Double, /* total */ Double) => Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressNull: Self = StObject.set(x, "onProgress", null)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputGraph = Graph[Unit]
  
  type RevisionId = String
}
