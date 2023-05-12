package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcPlatformNodeRequireInTheMiddleSingletonMod.Hooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeModuleNameTrieMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/node/ModuleNameTrie", "ModuleNameSeparator")
  @js.native
  val ModuleNameSeparator: /* "/" */ String = js.native
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/node/ModuleNameTrie", "ModuleNameTrie")
  @js.native
  open class ModuleNameTrie () extends StObject {
    
    /* private */ var _counter: Any = js.native
    
    /* private */ var _trie: Any = js.native
    
    /**
      * Insert a module hook into the trie
      *
      * @param {Hooked} hook Hook
      */
    def insert(hook: Hooked): Unit = js.native
    
    /**
      * Search for matching hooks in the trie
      *
      * @param {string} moduleName Module name
      * @param {boolean} maintainInsertionOrder Whether to return the results in insertion order
      * @param {boolean} fullOnly Whether to return only full matches
      * @returns {Hooked[]} Matching hooks
      */
    def search(moduleName: String): js.Array[Hooked] = js.native
    def search(moduleName: String, param1: ModuleNameTrieSearchOptions): js.Array[Hooked] = js.native
  }
  
  trait ModuleNameTrieSearchOptions extends StObject {
    
    /**
      * Whether to return only full matches
      */
    var fullOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to return the results in insertion order
      */
    var maintainInsertionOrder: js.UndefOr[Boolean] = js.undefined
  }
  object ModuleNameTrieSearchOptions {
    
    inline def apply(): ModuleNameTrieSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleNameTrieSearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleNameTrieSearchOptions] (val x: Self) extends AnyVal {
      
      inline def setFullOnly(value: Boolean): Self = StObject.set(x, "fullOnly", value.asInstanceOf[js.Any])
      
      inline def setFullOnlyUndefined: Self = StObject.set(x, "fullOnly", js.undefined)
      
      inline def setMaintainInsertionOrder(value: Boolean): Self = StObject.set(x, "maintainInsertionOrder", value.asInstanceOf[js.Any])
      
      inline def setMaintainInsertionOrderUndefined: Self = StObject.set(x, "maintainInsertionOrder", js.undefined)
    }
  }
}
