package typings.nanoCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nano-cache", JSImport.Namespace)
  @js.native
  class ^ () extends NanoCache {
    def this(options: Options) = this()
  }
  @JSImport("nano-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("nano-cache", "DEFAULTS")
  @js.native
  def DEFAULTS_ : Defaults = js.native
  
  @scala.inline
  def DEFAULTS__=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULTS")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SIZE extends StObject {
    
    var GB: Double = js.native
    
    var KB: Double = js.native
    
    var MB: Double = js.native
  }
  object SIZE {
    
    /* static member */
    @JSImport("nano-cache", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGB(value: Double): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKB(value: Double): Self = StObject.set(x, "KB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMB(value: Double): Self = StObject.set(x, "MB", value.asInstanceOf[js.Any])
    }
  }
  
  /* static member */
  @JSImport("nano-cache", "singleton")
  @js.native
  def singleton: NanoCache = js.native
  @scala.inline
  def singleton_=(x: NanoCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singleton")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Defaults extends StObject {
    
    var bytes: Double = js.native
    
    var compress: Boolean = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var maxEvictBytes: Double = js.native
    
    var minFreeMem: Double = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object Defaults {
    
    @scala.inline
    def apply(bytes: Double, compress: Boolean, maxEvictBytes: Double, minFreeMem: Double): Defaults = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], maxEvictBytes = maxEvictBytes.asInstanceOf[js.Any], minFreeMem = minFreeMem.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults]
    }
    
    @scala.inline
    implicit class DefaultsMutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMaxEvictBytes(value: Double): Self = StObject.set(x, "maxEvictBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFreeMem(value: Double): Self = StObject.set(x, "minFreeMem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait Info extends StObject {
    
    var accessed: Double = js.native
    
    var bytes: Double = js.native
    
    var compressed: Boolean = js.native
    
    var cost: Double = js.native
    
    var expires: Double = js.native
    
    var hits: Double = js.native
    
    var key: String = js.native
    
    var limit: Double = js.native
    
    var ttl: Double = js.native
    
    var updated: Double = js.native
    
    var value: js.Any = js.native
  }
  object Info {
    
    @scala.inline
    def apply(
      accessed: Double,
      bytes: Double,
      compressed: Boolean,
      cost: Double,
      expires: Double,
      hits: Double,
      key: String,
      limit: Double,
      ttl: Double,
      updated: Double,
      value: js.Any
    ): Info = {
      val __obj = js.Dynamic.literal(accessed = accessed.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessed(value: Double): Self = StObject.set(x, "accessed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NanoCache extends StObject {
    
    def clear(): Unit = js.native
    
    def clearExpired(): Unit = js.native
    
    def delete(key: js.Any): js.Any = js.native
    
    def get(key: js.Any): js.Any = js.native
    
    def info(key: js.Any): Info = js.native
    
    def isLimitReached(key: js.Any): Boolean = js.native
    
    def isTTLExpired(key: js.Any): Boolean = js.native
    
    def set(key: js.Any, value: js.Any): Unit = js.native
    def set(key: js.Any, value: js.Any, options: Options): Unit = js.native
    
    def stats(): Stats = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var bytes: js.UndefOr[Double] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var maxEvictBytes: js.UndefOr[Double] = js.native
    
    var minFreeMem: js.UndefOr[Double] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMaxEvictBytes(value: Double): Self = StObject.set(x, "maxEvictBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEvictBytesUndefined: Self = StObject.set(x, "maxEvictBytes", js.undefined)
      
      @scala.inline
      def setMinFreeMem(value: Double): Self = StObject.set(x, "minFreeMem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFreeMemUndefined: Self = StObject.set(x, "minFreeMem", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var age: Double = js.native
    
    var bytes: Double = js.native
    
    var count: Double = js.native
    
    var evictions: Double = js.native
    
    var hits: Double = js.native
    
    var misses: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(age: Double, bytes: Double, count: Double, evictions: Double, hits: Double, misses: Double): Stats = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvictions(value: Double): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMisses(value: Double): Self = StObject.set(x, "misses", value.asInstanceOf[js.Any])
    }
  }
}
