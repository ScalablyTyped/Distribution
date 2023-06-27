package typings.memoryCache

import org.scalablytyped.runtime.Instantiable0
import typings.memoryCache.anon.SkipDuplicates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memory-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("memory-cache", "Cache")
  @js.native
  open class Cache[K, V] () extends CacheClass[K, V]
  @JSImport("memory-cache", "Cache")
  @js.native
  val Cache: Instantiable0[CacheClass[js.Object, js.Object]] = js.native
  
  @JSImport("memory-cache", "CacheClass")
  @js.native
  open class CacheClass[K, V] () extends StObject {
    
    def clear(): Unit = js.native
    
    def debug(bool: Boolean): Unit = js.native
    
    def del(key: K): Boolean = js.native
    
    /**
      * @returns A JSON string representing all the cache data
      */
    def exportJson(): String = js.native
    
    def get(key: K): V | Null = js.native
    
    def hits(): Double = js.native
    
    /**
      * @returns The new size of the cache
      * @see {@link https://github.com/ptarjan/node-cache#importjson--functionjson-string-options--skipduplicates-boolean-}
      */
    def importJson(json: String): Double = js.native
    def importJson(json: String, options: SkipDuplicates): Double = js.native
    
    def keys(): js.Array[K] = js.native
    
    def memsize(): Double = js.native
    
    def misses(): Double = js.native
    
    def put(key: K, value: V): V = js.native
    def put(key: K, value: V, time: Double): V = js.native
    def put(key: K, value: V, time: Double, timeoutCallback: js.Function2[/* key */ K, /* value */ V, Unit]): V = js.native
    def put(key: K, value: V, time: Unit, timeoutCallback: js.Function2[/* key */ K, /* value */ V, Unit]): V = js.native
    
    def size(): Double = js.native
  }
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def debug(bool: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(bool.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def del(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def exportJson(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exportJson")().asInstanceOf[String]
  
  inline def get(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def hits(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hits")().asInstanceOf[Double]
  
  inline def importJson(json: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("importJson")(json.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def importJson(json: String, options: SkipDuplicates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("importJson")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def keys(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[js.Array[Any]]
  
  inline def memsize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("memsize")().asInstanceOf[Double]
  
  inline def misses(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("misses")().asInstanceOf[Double]
  
  inline def put[V](key: Any, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def put[V](key: Any, value: V, time: Double): V = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def put[V](
    key: Any,
    value: V,
    time: Double,
    timeoutCallback: js.Function2[/* key */ Any, /* value */ Any, Unit]
  ): V = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], time.asInstanceOf[js.Any], timeoutCallback.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def put[V](
    key: Any,
    value: V,
    time: Unit,
    timeoutCallback: js.Function2[/* key */ Any, /* value */ Any, Unit]
  ): V = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], time.asInstanceOf[js.Any], timeoutCallback.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def size(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Double]
}
