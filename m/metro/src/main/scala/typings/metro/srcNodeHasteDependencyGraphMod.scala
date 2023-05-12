package typings.metro

import typings.metro.anon.AssumeFlatNodeModules
import typings.metro.anon.ReadonlyhasReducedPerform
import typings.metro.anon.Readonlyrecursivebooleanf
import typings.metro.srcDeltaBundlerTypesMod.BundlerResolution
import typings.metro.srcSharedTypesMod.ResolverInputOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNodeHasteDependencyGraphMod {
  
  @JSImport("metro/src/node-haste/DependencyGraph", JSImport.Default)
  @js.native
  open class default protected () extends DependencyGraph {
    def this(config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any) = this()
    def this(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
      options: ReadonlyhasReducedPerform
    ) = this()
  }
  
  @js.native
  trait DependencyGraph extends EventEmitter {
    
    def end(): Unit = js.native
    
    def getAllFiles(): js.Array[String] = js.native
    
    def getDependencies(filePath: String): js.Array[String] = js.native
    
    def getHasteName(filePath: String): String = js.native
    
    def getSha1(filename: String): String = js.native
    
    def getWatcher(): EventEmitter = js.native
    
    /** @deprecated Use the constructor + `ready()` directly */
    def load(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any
    ): js.Promise[DependencyGraph] = js.native
    def load(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
      options: ReadonlyhasReducedPerform
    ): js.Promise[DependencyGraph] = js.native
    
    /** Given a search context, return a list of file paths matching the query. */
    def matchFilesWithContext(from: String, context: Readonlyrecursivebooleanf): js.Array[String] = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def resolveDependency(
      from: String,
      to: String,
      platform: String,
      resolverOptions: ResolverInputOptions,
      options: AssumeFlatNodeModules
    ): BundlerResolution = js.native
    def resolveDependency(
      from: String,
      to: String,
      platform: Null,
      resolverOptions: ResolverInputOptions,
      options: AssumeFlatNodeModules
    ): BundlerResolution = js.native
  }
}
