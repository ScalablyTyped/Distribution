package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.anon.ReadonlyclocksReadonlyMap
import typings.nodeAbortController.mod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerOptions extends StObject {
  
  var abortSignal: AbortSignal | Null
  
  var computeSha1: Boolean
  
  var extensions: js.Array[String]
  
  var forceNodeFilesystemAPI: Boolean
  
  def ignore(item: String): Boolean
  @JSName("ignore")
  var ignore_Original: IgnoreMatcher
  
  var includeSymlinks: Boolean
  
  def onStatus(status: WatcherStatus): Unit
  
  var perfLogger: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PerfLogger */ Any) | Null
  ] = js.undefined
  
  var previousState: ReadonlyclocksReadonlyMap
  
  var rootDir: String
  
  var roots: js.Array[String]
}
object CrawlerOptions {
  
  inline def apply(
    computeSha1: Boolean,
    extensions: js.Array[String],
    forceNodeFilesystemAPI: Boolean,
    ignore: /* item */ String => Boolean,
    includeSymlinks: Boolean,
    onStatus: WatcherStatus => Unit,
    previousState: ReadonlyclocksReadonlyMap,
    rootDir: String,
    roots: js.Array[String]
  ): CrawlerOptions = {
    val __obj = js.Dynamic.literal(computeSha1 = computeSha1.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], forceNodeFilesystemAPI = forceNodeFilesystemAPI.asInstanceOf[js.Any], ignore = js.Any.fromFunction1(ignore), includeSymlinks = includeSymlinks.asInstanceOf[js.Any], onStatus = js.Any.fromFunction1(onStatus), previousState = previousState.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], abortSignal = null)
    __obj.asInstanceOf[CrawlerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrawlerOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalNull: Self = StObject.set(x, "abortSignal", null)
    
    inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setForceNodeFilesystemAPI(value: Boolean): Self = StObject.set(x, "forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: /* item */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
    
    inline def setIncludeSymlinks(value: Boolean): Self = StObject.set(x, "includeSymlinks", value.asInstanceOf[js.Any])
    
    inline def setOnStatus(value: WatcherStatus => Unit): Self = StObject.set(x, "onStatus", js.Any.fromFunction1(value))
    
    inline def setPerfLogger(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PerfLogger */ Any
    ): Self = StObject.set(x, "perfLogger", value.asInstanceOf[js.Any])
    
    inline def setPerfLoggerNull: Self = StObject.set(x, "perfLogger", null)
    
    inline def setPerfLoggerUndefined: Self = StObject.set(x, "perfLogger", js.undefined)
    
    inline def setPreviousState(value: ReadonlyclocksReadonlyMap): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
  }
}
