package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntermediateConfigT
  extends StObject
     with MetalConfigT {
  
  var resolver: ResolverConfigT
  
  var serializer: SerializerConfigT
  
  var server: ServerConfigT
  
  var symbolicator: SymbolicatorConfigT
  
  var transformer: TransformerConfigT
  
  var watcher: WatcherConfigT
}
object IntermediateConfigT {
  
  inline def apply(
    cacheStores: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
    ],
    cacheVersion: String,
    maxWorkers: Double,
    projectRoot: String,
    reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any,
    resetCache: Boolean,
    resolver: ResolverConfigT,
    serializer: SerializerConfigT,
    server: ServerConfigT,
    stickyWorkers: Boolean,
    symbolicator: SymbolicatorConfigT,
    transformer: TransformerConfigT,
    transformerPath: String,
    watchFolders: js.Array[String],
    watcher: WatcherConfigT
  ): IntermediateConfigT = {
    val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntermediateConfigT] (val x: Self) extends AnyVal {
    
    inline def setResolver(value: ResolverConfigT): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: SerializerConfigT): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setServer(value: ServerConfigT): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSymbolicator(value: SymbolicatorConfigT): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: TransformerConfigT): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: WatcherConfigT): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
