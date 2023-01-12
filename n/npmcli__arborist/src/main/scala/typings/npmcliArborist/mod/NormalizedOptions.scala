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
  
  inline def apply(): NormalizedOptions = {
    val __obj = js.Dynamic.literal(lockfileVersion = null)
    __obj.asInstanceOf[NormalizedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setLockfileVersion(value: Double): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
    
    inline def setLockfileVersionNull: Self = StObject.set(x, "lockfileVersion", null)
    
    inline def setNodeVersion(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
    
    inline def setPackumentCache(value: NonNullable[js.UndefOr[Map[String, Packument_]]]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
    
    inline def setPackumentCacheUndefined: Self = StObject.set(x, "packumentCache", js.undefined)
    
    inline def setPath(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRegistry(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setReplaceRegistryHost(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "replaceRegistryHost", value.asInstanceOf[js.Any])
    
    inline def setReplaceRegistryHostUndefined: Self = StObject.set(x, "replaceRegistryHost", js.undefined)
    
    inline def setWorkspacesEnabled(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "workspacesEnabled", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesEnabledUndefined: Self = StObject.set(x, "workspacesEnabled", js.undefined)
  }
}
