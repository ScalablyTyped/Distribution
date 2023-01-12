package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOsNativeAppPackageManagerMod {
  
  inline def apply(key: Double, path: String): Unit = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/os/NativeAppPackageManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NativeAppPackageManager {
    def this(key: Double, path: String) = this()
    
    /* private */ /* CompleteClass */
    var _appId: Any = js.native
    
    /* private */ /* CompleteClass */
    var _key: Any = js.native
    
    /* private */ /* CompleteClass */
    var _localManifest: Any = js.native
    
    /* private */ /* CompleteClass */
    var _manifest: Any = js.native
    
    /* private */ /* CompleteClass */
    var _manifestName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _path: Any = js.native
    
    /* private */ /* CompleteClass */
    var downloadBundle_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var extractBundle_ : Any = js.native
    
    /* CompleteClass */
    override def getManifest(): Any = js.native
    
    /* CompleteClass */
    override def isInstalled(): Boolean = js.native
    
    /* CompleteClass */
    override def isUpdated(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var load: Any = js.native
    
    /* private */ /* CompleteClass */
    var loadBaseManifest_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var loadDiskManifest_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var saveManifest_ : Any = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var verifyBundle_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/os/NativeAppPackageManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NativeAppPackageManager extends StObject {
    
    /* private */ var _appId: Any
    
    /* private */ var _key: Any
    
    /* private */ var _localManifest: Any
    
    /* private */ var _manifest: Any
    
    /* private */ var _manifestName: Any
    
    /* private */ var _path: Any
    
    /* private */ var downloadBundle_ : Any
    
    /* private */ var extractBundle_ : Any
    
    def getManifest(): Any
    
    def isInstalled(): Boolean
    
    def isUpdated(): Boolean
    
    /* private */ var load: Any
    
    /* private */ var loadBaseManifest_ : Any
    
    /* private */ var loadDiskManifest_ : Any
    
    /* private */ var logger_ : Any
    
    /* private */ var saveManifest_ : Any
    
    def update(): Unit
    
    /* private */ var verifyBundle_ : Any
  }
  object NativeAppPackageManager {
    
    inline def apply(
      _appId: Any,
      _key: Any,
      _localManifest: Any,
      _manifest: Any,
      _manifestName: Any,
      _path: Any,
      downloadBundle_ : Any,
      extractBundle_ : Any,
      getManifest: () => Any,
      isInstalled: () => Boolean,
      isUpdated: () => Boolean,
      load: Any,
      loadBaseManifest_ : Any,
      loadDiskManifest_ : Any,
      logger_ : Any,
      saveManifest_ : Any,
      update: () => Unit,
      verifyBundle_ : Any
    ): NativeAppPackageManager = {
      val __obj = js.Dynamic.literal(_appId = _appId.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _localManifest = _localManifest.asInstanceOf[js.Any], _manifest = _manifest.asInstanceOf[js.Any], _manifestName = _manifestName.asInstanceOf[js.Any], _path = _path.asInstanceOf[js.Any], downloadBundle_ = downloadBundle_.asInstanceOf[js.Any], extractBundle_ = extractBundle_.asInstanceOf[js.Any], getManifest = js.Any.fromFunction0(getManifest), isInstalled = js.Any.fromFunction0(isInstalled), isUpdated = js.Any.fromFunction0(isUpdated), load = load.asInstanceOf[js.Any], loadBaseManifest_ = loadBaseManifest_.asInstanceOf[js.Any], loadDiskManifest_ = loadDiskManifest_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], saveManifest_ = saveManifest_.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), verifyBundle_ = verifyBundle_.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeAppPackageManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeAppPackageManager] (val x: Self) extends AnyVal {
      
      inline def setDownloadBundle_(value: Any): Self = StObject.set(x, "downloadBundle_", value.asInstanceOf[js.Any])
      
      inline def setExtractBundle_(value: Any): Self = StObject.set(x, "extractBundle_", value.asInstanceOf[js.Any])
      
      inline def setGetManifest(value: () => Any): Self = StObject.set(x, "getManifest", js.Any.fromFunction0(value))
      
      inline def setIsInstalled(value: () => Boolean): Self = StObject.set(x, "isInstalled", js.Any.fromFunction0(value))
      
      inline def setIsUpdated(value: () => Boolean): Self = StObject.set(x, "isUpdated", js.Any.fromFunction0(value))
      
      inline def setLoad(value: Any): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadBaseManifest_(value: Any): Self = StObject.set(x, "loadBaseManifest_", value.asInstanceOf[js.Any])
      
      inline def setLoadDiskManifest_(value: Any): Self = StObject.set(x, "loadDiskManifest_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setSaveManifest_(value: Any): Self = StObject.set(x, "saveManifest_", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setVerifyBundle_(value: Any): Self = StObject.set(x, "verifyBundle_", value.asInstanceOf[js.Any])
      
      inline def set_appId(value: Any): Self = StObject.set(x, "_appId", value.asInstanceOf[js.Any])
      
      inline def set_key(value: Any): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
      
      inline def set_localManifest(value: Any): Self = StObject.set(x, "_localManifest", value.asInstanceOf[js.Any])
      
      inline def set_manifest(value: Any): Self = StObject.set(x, "_manifest", value.asInstanceOf[js.Any])
      
      inline def set_manifestName(value: Any): Self = StObject.set(x, "_manifestName", value.asInstanceOf[js.Any])
      
      inline def set_path(value: Any): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    }
  }
}
