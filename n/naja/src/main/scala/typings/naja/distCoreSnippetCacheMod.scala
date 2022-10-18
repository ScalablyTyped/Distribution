package typings.naja

import typings.naja.anon.Key
import typings.naja.anon.Snippets
import typings.naja.anon.State
import typings.naja.distCoreSnippetHandlerMod.SnippetHandler
import typings.naja.distNajaMod.Naja
import typings.naja.distUtilsMod.TypedEventListener
import typings.naja.najaStrings.fetch
import typings.naja.najaStrings.restore
import typings.naja.najaStrings.store
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventTarget
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSnippetCacheMod {
  
  @JSImport("naja/dist/core/SnippetCache", "SnippetCache")
  @js.native
  open class SnippetCache protected ()
    extends StObject
       with EventTarget {
    def this(naja: Naja) = this()
    
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var buildHistoryState: Any = js.native
    
    /* private */ var configureCache: Any = js.native
    
    /* private */ val naja: Any = js.native
    
    def removeEventListener(
      `type`: String,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: string extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.SnippetCacheEventMap[string] : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: fetch,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fetch' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.FetchEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: restore,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'restore' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.RestoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener(
      `type`: store,
      listener: TypedEventListener[
          SnippetHandler, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'store' extends 'store' | 'fetch' | 'restore' ? naja.naja/dist/core/SnippetCache.StoreEvent : std.CustomEvent<any> */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /* private */ var resolveStorage: Any = js.native
    
    /* private */ var restoreHistoryState: Any = js.native
    
    /* private */ val storages: Any = js.native
  }
  
  type CachedSnippets = Record[String, String]
  
  type FetchEvent = CustomEvent[State]
  
  type RestoreEvent = CustomEvent[Snippets]
  
  trait SnippetCacheEventMap extends StObject {
    
    var fetch: FetchEvent
    
    var restore: RestoreEvent
    
    var store: StoreEvent
  }
  object SnippetCacheEventMap {
    
    inline def apply(fetch: FetchEvent, restore: RestoreEvent, store: StoreEvent): SnippetCacheEventMap = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], restore = restore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetCacheEventMap]
    }
    
    extension [Self <: SnippetCacheEventMap](x: Self) {
      
      inline def setFetch(value: FetchEvent): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setRestore(value: RestoreEvent): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      inline def setStore(value: StoreEvent): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type SnippetCacheKey = CachedSnippets | String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.naja.najaStrings.off
    - typings.naja.najaStrings.history
    - typings.naja.najaStrings.session
  */
  trait SnippetCacheStorageType extends StObject
  object SnippetCacheStorageType {
    
    inline def history: typings.naja.najaStrings.history = "history".asInstanceOf[typings.naja.najaStrings.history]
    
    inline def off: typings.naja.najaStrings.off = "off".asInstanceOf[typings.naja.najaStrings.off]
    
    inline def session: typings.naja.najaStrings.session = "session".asInstanceOf[typings.naja.najaStrings.session]
  }
  
  type StoreEvent = CustomEvent[Snippets]
  
  /* augmented module */
  object najaDistCoreHistoryHandlerAugmentingMod {
    
    trait HistoryState extends StObject {
      
      var snippets: js.UndefOr[Key] = js.undefined
    }
    object HistoryState {
      
      inline def apply(): HistoryState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistoryState]
      }
      
      extension [Self <: HistoryState](x: Self) {
        
        inline def setSnippets(value: Key): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
        
        inline def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object najaDistNajaAugmentingMod {
    
    trait Options extends StObject {
      
      var snippetCache: js.UndefOr[Boolean | SnippetCacheStorageType] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setSnippetCache(value: Boolean | SnippetCacheStorageType): Self = StObject.set(x, "snippetCache", value.asInstanceOf[js.Any])
        
        inline def setSnippetCacheUndefined: Self = StObject.set(x, "snippetCache", js.undefined)
      }
    }
  }
}
