package typings.ngstorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ngStorage {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait StorageProvider extends StObject {
      
      def get[T](key: String): T | Boolean
      
      def remove(key: String): Unit
      
      def set[T](key: String, value: T): T | Boolean
      
      def setDeserializer(deserializer: js.Function1[/* value */ String, Any]): Unit
      
      def setKeyPrefix(prefix: String): Unit
      
      def setSerializer(serializer: js.Function1[/* value */ Any, String]): Unit
      
      def supported(): Boolean
    }
    object StorageProvider {
      
      inline def apply(
        get: String => Any | Boolean,
        remove: String => Unit,
        set: (String, Any) => Any | Boolean,
        setDeserializer: js.Function1[/* value */ String, Any] => Unit,
        setKeyPrefix: String => Unit,
        setSerializer: js.Function1[/* value */ Any, String] => Unit,
        supported: () => Boolean
      ): StorageProvider = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
        __obj.asInstanceOf[StorageProvider]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StorageProvider] (val x: Self) extends AnyVal {
        
        inline def setGet(value: String => Any | Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setSet(value: (String, Any) => Any | Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
        
        inline def setSetDeserializer(value: js.Function1[/* value */ String, Any] => Unit): Self = StObject.set(x, "setDeserializer", js.Any.fromFunction1(value))
        
        inline def setSetKeyPrefix(value: String => Unit): Self = StObject.set(x, "setKeyPrefix", js.Any.fromFunction1(value))
        
        inline def setSetSerializer(value: js.Function1[/* value */ Any, String] => Unit): Self = StObject.set(x, "setSerializer", js.Any.fromFunction1(value))
        
        inline def setSupported(value: () => Boolean): Self = StObject.set(x, "supported", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait StorageService
      extends StObject
         with /**
      * Access to the properties of the store.
      */
    /* key */ StringDictionary[Any] {
      
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
      def $default[T](items: T): StorageService & T = js.native
      
      /**
        * Removes all properties from the store.
        *
        * @param items optional object holding the default values to initialize the store after reset.
        * @return the modified storage service.
        */
      @JSName("$reset")
      def $reset[T](): StorageService & T = js.native
      @JSName("$reset")
      def $reset[T](items: T): StorageService & T = js.native
      
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
