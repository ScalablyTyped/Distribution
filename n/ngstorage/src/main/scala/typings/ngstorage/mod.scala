package typings.ngstorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ngStorage {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ @js.native
    trait StorageProvider extends StObject {
      
      def get[T](key: String): T | Boolean = js.native
      
      def remove(key: String): Unit = js.native
      
      def set[T](key: String, value: T): T | Boolean = js.native
      
      def setDeserializer(deserializer: js.Function1[/* value */ String, _]): Unit = js.native
      
      def setKeyPrefix(prefix: String): Unit = js.native
      
      def setSerializer(serializer: js.Function1[/* value */ js.Any, String]): Unit = js.native
      
      def supported(): Boolean = js.native
    }
    object StorageProvider {
      
      @scala.inline
      def apply(
        get: String => js.Any | Boolean,
        remove: String => Unit,
        set: (String, js.Any) => js.Any | Boolean,
        setDeserializer: js.Function1[/* value */ String, _] => Unit,
        setKeyPrefix: String => Unit,
        setSerializer: js.Function1[/* value */ js.Any, String] => Unit,
        supported: () => Boolean
      ): StorageProvider = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
        __obj.asInstanceOf[StorageProvider]
      }
      
      @scala.inline
      implicit class StorageProviderMutableBuilder[Self <: StorageProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => js.Any | Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSet(value: (String, js.Any) => js.Any | Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetDeserializer(value: js.Function1[/* value */ String, _] => Unit): Self = StObject.set(x, "setDeserializer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetKeyPrefix(value: String => Unit): Self = StObject.set(x, "setKeyPrefix", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetSerializer(value: js.Function1[/* value */ js.Any, String] => Unit): Self = StObject.set(x, "setSerializer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSupported(value: () => Boolean): Self = StObject.set(x, "supported", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait StorageService
      extends /**
      * Access to the properties of the store.
      */
    /* key */ StringDictionary[js.Any] {
      
      @JSName("$apply")
      def $apply(): Unit = js.native
      
      /**
        * Adds default values to the store.
        * Copies all properties of the default items to the store.
        * If the store already has one of these properties it will skip it.
        *
        * @param items object holding the default values.
        * @return the modified storage service.
        */
      @JSName("$default")
      def $default[T](items: T): StorageService with T = js.native
      
      /**
        * Removes all properties from the store.
        *
        * @param items optional object holding the default values to initialize the store after reset.
        * @return the modified storage service.
        */
      @JSName("$reset")
      def $reset[T](): StorageService with T = js.native
      @JSName("$reset")
      def $reset[T](items: T): StorageService with T = js.native
      
      /**
        * @return true if the storage service is supported by the browser.
        */
      @JSName("$supported")
      def $supported(): Boolean = js.native
      
      @JSName("$sync")
      def $sync(): Unit = js.native
    }
  }
}
