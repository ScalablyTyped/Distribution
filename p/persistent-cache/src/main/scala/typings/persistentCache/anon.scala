package typings.persistentCache

import typings.node.NodeJS.ErrnoException
import typings.persistentCache.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delete extends StObject {
    
    /**
      * Remove the provided `key` from the cache and call the provided callback when done.
      */
    def delete(name: String, cb: Callback): Unit
    
    /**
      * Remove the provided `key` from the cache.
      */
    def deleteSync(name: String): js.UndefOr[Unit]
    
    /**
      * Get the data saved under `key` from the cache and call the provided callback when done, passing the retrieved data as the second argument (again, passing error first following node convention).
      *
      * If there is no (valid) cache entry for the provided `key`, `undefined` will be returned/passed.
      */
    def get(name: String, cb: Callback): Any
    
    /**
      * Get the data saved under `key` from the cache.
      *
      * If there is no (valid) cache entry for the provided `key`, `undefined` will be returned/passed.
      */
    def getSync(name: String): Any
    
    /**
      * Finds all available keys in a cache.
      */
    def keys(cb: Callback): Any
    
    /**
      * Finds all available keys in a cache.
      */
    def keysSync(): js.Array[String]
    
    /**
      * Store any arbitrary `data` in the cache under the provided key and call the provided callback when done (passing err as the first argument, following node convention).
      *
      * If there is already an entry for the provided key it will be overwriten.
      */
    def put(name: String, data: Any, cb: Callback): Any
    
    /**
      * Store any arbitrary `data` in the cache under the provided key.
      *
      * If there is already an entry for the provided key it will be overwriten.
      */
    def putSync(name: String, data: Any): Unit
    
    /**
      * Delete the folder and files of a persistent cache.
      */
    def unlink(cb: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit
  }
  object Delete {
    
    inline def apply(
      delete: (String, Callback) => Unit,
      deleteSync: String => js.UndefOr[Unit],
      get: (String, Callback) => Any,
      getSync: String => Any,
      keys: Callback => Any,
      keysSync: () => js.Array[String],
      put: (String, Any, Callback) => Any,
      putSync: (String, Any) => Unit,
      unlink: js.Function1[/* err */ ErrnoException | Null, Unit] => Unit
    ): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), deleteSync = js.Any.fromFunction1(deleteSync), get = js.Any.fromFunction2(get), getSync = js.Any.fromFunction1(getSync), keys = js.Any.fromFunction1(keys), keysSync = js.Any.fromFunction0(keysSync), put = js.Any.fromFunction3(put), putSync = js.Any.fromFunction2(putSync), unlink = js.Any.fromFunction1(unlink))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: (String, Callback) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setDeleteSync(value: String => js.UndefOr[Unit]): Self = StObject.set(x, "deleteSync", js.Any.fromFunction1(value))
      
      inline def setGet(value: (String, Callback) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetSync(value: String => Any): Self = StObject.set(x, "getSync", js.Any.fromFunction1(value))
      
      inline def setKeys(value: Callback => Any): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      inline def setKeysSync(value: () => js.Array[String]): Self = StObject.set(x, "keysSync", js.Any.fromFunction0(value))
      
      inline def setPut(value: (String, Any, Callback) => Any): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
      
      inline def setPutSync(value: (String, Any) => Unit): Self = StObject.set(x, "putSync", js.Any.fromFunction2(value))
      
      inline def setUnlink(value: js.Function1[/* err */ ErrnoException | Null, Unit] => Unit): Self = StObject.set(x, "unlink", js.Any.fromFunction1(value))
    }
  }
}
