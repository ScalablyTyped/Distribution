package typings.metroFileMap

import typings.metroFileMap.anon.ReadonlychangedFileDatare
import typings.metroFileMap.srcFlowTypesMod.BuildParameters
import typings.metroFileMap.srcFlowTypesMod.CacheData
import typings.metroFileMap.srcFlowTypesMod.CacheManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCacheDiskCacheManagerMod {
  
  @JSImport("metro-file-map/src/cache/DiskCacheManager", "DiskCacheManager")
  @js.native
  open class DiskCacheManager protected ()
    extends StObject
       with CacheManager {
    def this(options: DiskCacheConfig) = this()
    
    def getCacheFilePath(): String = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[CacheData | Null] = js.native
    
    /* CompleteClass */
    override def write(dataSnapshot: CacheData, delta: ReadonlychangedFileDatare): js.Promise[Unit] = js.native
  }
  /* static members */
  object DiskCacheManager {
    
    @JSImport("metro-file-map/src/cache/DiskCacheManager", "DiskCacheManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCacheFilePath(buildParameters: BuildParameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: String, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: Null, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: Unit, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait DiskCacheConfig extends StObject {
    
    var buildParameters: BuildParameters
    
    var cacheDirectory: js.UndefOr[String | Null] = js.undefined
    
    var cacheFilePrefix: js.UndefOr[String | Null] = js.undefined
  }
  object DiskCacheConfig {
    
    inline def apply(buildParameters: BuildParameters): DiskCacheConfig = {
      val __obj = js.Dynamic.literal(buildParameters = buildParameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiskCacheConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiskCacheConfig] (val x: Self) extends AnyVal {
      
      inline def setBuildParameters(value: BuildParameters): Self = StObject.set(x, "buildParameters", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryNull: Self = StObject.set(x, "cacheDirectory", null)
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheFilePrefix(value: String): Self = StObject.set(x, "cacheFilePrefix", value.asInstanceOf[js.Any])
      
      inline def setCacheFilePrefixNull: Self = StObject.set(x, "cacheFilePrefix", null)
      
      inline def setCacheFilePrefixUndefined: Self = StObject.set(x, "cacheFilePrefix", js.undefined)
    }
  }
}
