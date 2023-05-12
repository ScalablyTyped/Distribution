package typings.metroCache

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.metroCache.srcStoresAutoCleanFileStoreMod.default
import typings.metroCache.srcStoresFileStoreMod.Options
import typings.metroCache.srcTypesMod.CacheStore
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("metro-cache/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("metro-cache/src", "AutoCleanFileStore")
  @js.native
  open class AutoCleanFileStore[T] () extends default[T]
  
  @JSImport("metro-cache/src", "Cache")
  @js.native
  open class Cache[T] protected ()
    extends typings.metroCache.srcCacheMod.default[T] {
    def this(stores: js.Array[CacheStore[T]]) = this()
  }
  
  @JSImport("metro-cache/src", "FileStore")
  @js.native
  open class FileStore[T] protected ()
    extends typings.metroCache.srcStoresFileStoreMod.default[T] {
    def this(options: Options) = this()
  }
  
  @JSImport("metro-cache/src", "HttpGetStore")
  @js.native
  open class HttpGetStore[T] protected ()
    extends typings.metroCache.srcStoresHttpGetStoreMod.default[T] {
    def this(options: typings.metroCache.srcStoresHttpStoreMod.Options) = this()
  }
  
  @JSImport("metro-cache/src", "HttpStore")
  @js.native
  open class HttpStore[T] protected ()
    extends typings.metroCache.srcStoresHttpStoreMod.default[T] {
    def this(options: typings.metroCache.srcStoresHttpStoreMod.Options) = this()
  }
  
  inline def stableHash(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stableHash")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  trait MetroCache extends StObject {
    
    var AutoCleanFileStore: Instantiable0[default[js.Object]]
    
    var Cache: Instantiable1[
        /* stores */ js.Array[CacheStore[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
        typings.metroCache.srcCacheMod.default[js.Object]
      ]
    
    var FileStore: Instantiable1[/* options */ Options, typings.metroCache.srcStoresFileStoreMod.default[js.Object]]
    
    var HttpGetStore: Instantiable1[
        /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
        typings.metroCache.srcStoresHttpGetStoreMod.default[js.Object]
      ]
    
    var HttpStore: Instantiable1[
        /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
        typings.metroCache.srcStoresHttpStoreMod.default[js.Object]
      ]
    
    def stableHash(value: Any): Buffer
    @JSName("stableHash")
    var stableHash_Original: js.Function1[/* value */ Any, Buffer]
  }
  object MetroCache {
    
    inline def apply(
      AutoCleanFileStore: Instantiable0[default[js.Object]],
      Cache: Instantiable1[
          /* stores */ js.Array[CacheStore[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
          typings.metroCache.srcCacheMod.default[js.Object]
        ],
      FileStore: Instantiable1[/* options */ Options, typings.metroCache.srcStoresFileStoreMod.default[js.Object]],
      HttpGetStore: Instantiable1[
          /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
          typings.metroCache.srcStoresHttpGetStoreMod.default[js.Object]
        ],
      HttpStore: Instantiable1[
          /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
          typings.metroCache.srcStoresHttpStoreMod.default[js.Object]
        ],
      stableHash: /* value */ Any => Buffer
    ): MetroCache = {
      val __obj = js.Dynamic.literal(AutoCleanFileStore = AutoCleanFileStore.asInstanceOf[js.Any], Cache = Cache.asInstanceOf[js.Any], FileStore = FileStore.asInstanceOf[js.Any], HttpGetStore = HttpGetStore.asInstanceOf[js.Any], HttpStore = HttpStore.asInstanceOf[js.Any], stableHash = js.Any.fromFunction1(stableHash))
      __obj.asInstanceOf[MetroCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetroCache] (val x: Self) extends AnyVal {
      
      inline def setAutoCleanFileStore(value: Instantiable0[default[js.Object]]): Self = StObject.set(x, "AutoCleanFileStore", value.asInstanceOf[js.Any])
      
      inline def setCache(
        value: Instantiable1[
              /* stores */ js.Array[CacheStore[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
              typings.metroCache.srcCacheMod.default[js.Object]
            ]
      ): Self = StObject.set(x, "Cache", value.asInstanceOf[js.Any])
      
      inline def setFileStore(
        value: Instantiable1[/* options */ Options, typings.metroCache.srcStoresFileStoreMod.default[js.Object]]
      ): Self = StObject.set(x, "FileStore", value.asInstanceOf[js.Any])
      
      inline def setHttpGetStore(
        value: Instantiable1[
              /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
              typings.metroCache.srcStoresHttpGetStoreMod.default[js.Object]
            ]
      ): Self = StObject.set(x, "HttpGetStore", value.asInstanceOf[js.Any])
      
      inline def setHttpStore(
        value: Instantiable1[
              /* options */ typings.metroCache.srcStoresHttpStoreMod.Options, 
              typings.metroCache.srcStoresHttpStoreMod.default[js.Object]
            ]
      ): Self = StObject.set(x, "HttpStore", value.asInstanceOf[js.Any])
      
      inline def setStableHash(value: /* value */ Any => Buffer): Self = StObject.set(x, "stableHash", js.Any.fromFunction1(value))
    }
  }
}
