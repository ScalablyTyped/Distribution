package typings.nodeFetchCache

import org.scalablytyped.runtime.Shortcut
import typings.nodeFetch.mod.Response
import typings.nodeFetchCache.anon.FnCall
import typings.nodeFetchCache.anon.WithCache
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-fetch-cache", JSImport.Default)
  @js.native
  val default: FetchCache = js.native
  
  @JSImport("node-fetch-cache", "FileSystemCache")
  @js.native
  open class FileSystemCache ()
    extends StObject
       with Cache {
    def this(options: FileSystemCacheOptions) = this()
    
    /* CompleteClass */
    override def get(key: String): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def remove(key: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def set(value: Any): js.Promise[Any] = js.native
  }
  
  @JSImport("node-fetch-cache", "MemoryCache")
  @js.native
  open class MemoryCache ()
    extends StObject
       with Cache {
    def this(options: MemoryCacheOptions) = this()
    
    /* CompleteClass */
    override def get(key: String): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def remove(key: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def set(value: Any): js.Promise[Any] = js.native
  }
  
  @JSImport("node-fetch-cache", "fetchBuilder")
  @js.native
  val fetchBuilder: FetchCache = js.native
  
  trait Cache extends StObject {
    
    def get(key: String): js.Promise[Any]
    
    def remove(key: String): js.Promise[Unit]
    
    def set(value: Any): js.Promise[Any]
  }
  object Cache {
    
    inline def apply(get: String => js.Promise[Any], remove: String => js.Promise[Unit], set: Any => js.Promise[Any]): Cache = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: Any => js.Promise[Any]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  type FetchBuilder_ = js.Function1[/* cache */ Cache, FetchCache]
  
  type FetchCache = (js.Function1[/* args */ Parameters[FnCall], js.Promise[NFCResponse]]) & WithCache
  
  trait FileSystemCacheOptions extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object FileSystemCacheOptions {
    
    inline def apply(): FileSystemCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSystemCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait MemoryCacheOptions extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object MemoryCacheOptions {
    
    inline def apply(): MemoryCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait NFCResponse extends Response {
    
    def ejectFromCache(): js.Promise[Unit] = js.native
  }
  
  type _To = FetchCache
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FetchCache = default
}
