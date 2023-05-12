package typings.metro

import typings.metro.srcDeltaBundlerTypesMod.TransformResultWithSource
import typings.metro.srcDeltaBundlerWorkerMod.TransformOptions
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBundlerMod {
  
  @JSImport("metro/src/Bundler", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Bundler {
    def this(config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any) = this()
    def this(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
      options: BundlerOptions
    ) = this()
  }
  
  @js.native
  trait Bundler extends StObject {
    
    def end(): js.Promise[Unit] = js.native
    
    def getDependencyGraph(): js.Promise[typings.metro.srcNodeHasteDependencyGraphMod.default] = js.native
    
    def getWatcher(): EventEmitter = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    def transformFile(filePath: String, transformOptions: TransformOptions): js.Promise[TransformResultWithSource[Unit]] = js.native
    def transformFile(
      filePath: String,
      transformOptions: TransformOptions,
      /** Optionally provide the file contents, this can be used to provide virtual contents for a file. */
    fileBuffer: Buffer
    ): js.Promise[TransformResultWithSource[Unit]] = js.native
  }
  
  trait BundlerOptions extends StObject {
    
    val hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    val watch: js.UndefOr[Boolean] = js.undefined
  }
  object BundlerOptions {
    
    inline def apply(): BundlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundlerOptions] (val x: Self) extends AnyVal {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
