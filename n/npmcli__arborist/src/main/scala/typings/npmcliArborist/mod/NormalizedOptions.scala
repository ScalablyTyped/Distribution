package typings.npmcliArborist.mod

import typings.pacote.mod.Packument_
import typings.std.Map
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedOptions
  extends StObject
     with Options {
  
  @JSName("cache")
  var cache_NormalizedOptions: NonNullable[js.UndefOr[String]]
  
  @JSName("lockfileVersion")
  var lockfileVersion_NormalizedOptions: Double | Null
  
  @JSName("nodeVersion")
  var nodeVersion_NormalizedOptions: NonNullable[js.UndefOr[String]]
  
  @JSName("packumentCache")
  var packumentCache_NormalizedOptions: NonNullable[js.UndefOr[Map[String, Packument_]]]
  
  @JSName("path")
  var path_NormalizedOptions: NonNullable[js.UndefOr[String]]
  
  @JSName("registry")
  var registry_NormalizedOptions: NonNullable[js.UndefOr[String]]
  
  @JSName("replaceRegistryHost")
  var replaceRegistryHost_NormalizedOptions: NonNullable[js.UndefOr[String]]
  
  @JSName("workspacesEnabled")
  var workspacesEnabled_NormalizedOptions: NonNullable[js.UndefOr[Boolean]]
}
object NormalizedOptions {
  
  inline def apply(
    cache: NonNullable[js.UndefOr[String]],
    nodeVersion: NonNullable[js.UndefOr[String]],
    packumentCache: NonNullable[js.UndefOr[Map[String, Packument_]]],
    path: NonNullable[js.UndefOr[String]],
    registry: NonNullable[js.UndefOr[String]],
    replaceRegistryHost: NonNullable[js.UndefOr[String]],
    workspacesEnabled: NonNullable[js.UndefOr[Boolean]]
  ): NormalizedOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], packumentCache = packumentCache.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], replaceRegistryHost = replaceRegistryHost.asInstanceOf[js.Any], workspacesEnabled = workspacesEnabled.asInstanceOf[js.Any], lockfileVersion = null)
    __obj.asInstanceOf[NormalizedOptions]
  }
  
  extension [Self <: NormalizedOptions](x: Self) {
    
    inline def setCache(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setLockfileVersion(value: Double): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
    
    inline def setLockfileVersionNull: Self = StObject.set(x, "lockfileVersion", null)
    
    inline def setNodeVersion(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setPackumentCache(value: NonNullable[js.UndefOr[Map[String, Packument_]]]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setReplaceRegistryHost(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "replaceRegistryHost", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesEnabled(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "workspacesEnabled", value.asInstanceOf[js.Any])
  }
}
