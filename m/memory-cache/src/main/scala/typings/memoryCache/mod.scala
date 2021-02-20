package typings.memoryCache

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("memory-cache", "Cache")
  @js.native
  class Cache[K, V] () extends CacheClass[K, V]
  @JSImport("memory-cache", "Cache")
  @js.native
  val Cache: Instantiable0[CacheClass[js.Object, js.Object]] = js.native
  
  @JSImport("memory-cache", "CacheClass")
  @js.native
  class CacheClass[K, V] () extends StObject {
    
    def clear(): Unit = js.native
    
    def debug(bool: Boolean): Unit = js.native
    
    def del(key: K): Unit = js.native
    
    def get(key: K): V | Null = js.native
    
    def hits(): Double = js.native
    
    def keys(): js.Array[K] = js.native
    
    def memsize(): Double = js.native
    
    def misses(): Double = js.native
    
    def put(key: K, value: V): V = js.native
    def put(
      key: K,
      value: V,
      time: js.UndefOr[scala.Nothing],
      timeoutCallback: js.Function2[/* key */ K, /* value */ V, Unit]
    ): V = js.native
    def put(key: K, value: V, time: Double): V = js.native
    def put(key: K, value: V, time: Double, timeoutCallback: js.Function2[/* key */ K, /* value */ V, Unit]): V = js.native
    
    def size(): Double = js.native
  }
  
  @JSImport("memory-cache", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("memory-cache", "debug")
  @js.native
  def debug(bool: Boolean): Unit = js.native
  
  @JSImport("memory-cache", "del")
  @js.native
  def del(key: js.Any): Unit = js.native
  
  @JSImport("memory-cache", "get")
  @js.native
  def get(key: js.Any): js.Any = js.native
  
  @JSImport("memory-cache", "hits")
  @js.native
  def hits(): Double = js.native
  
  @JSImport("memory-cache", "keys")
  @js.native
  def keys(): js.Array[_] = js.native
  
  @JSImport("memory-cache", "memsize")
  @js.native
  def memsize(): Double = js.native
  
  @JSImport("memory-cache", "misses")
  @js.native
  def misses(): Double = js.native
  
  @JSImport("memory-cache", "put")
  @js.native
  def put[V](key: js.Any, value: V): V = js.native
  @JSImport("memory-cache", "put")
  @js.native
  def put[V](
    key: js.Any,
    value: V,
    time: js.UndefOr[scala.Nothing],
    timeoutCallback: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]
  ): V = js.native
  @JSImport("memory-cache", "put")
  @js.native
  def put[V](key: js.Any, value: V, time: Double): V = js.native
  @JSImport("memory-cache", "put")
  @js.native
  def put[V](
    key: js.Any,
    value: V,
    time: Double,
    timeoutCallback: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]
  ): V = js.native
  
  @JSImport("memory-cache", "size")
  @js.native
  def size(): Double = js.native
}
