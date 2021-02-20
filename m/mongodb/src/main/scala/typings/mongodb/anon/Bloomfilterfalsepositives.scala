package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bloomfilterfalsepositives extends StObject {
  
  var `bloom filter false positives`: Double = js.native
  
  var `bloom filter hits`: Double = js.native
  
  var `bloom filter misses`: Double = js.native
  
  var `bloom filter pages evicted from cache`: Double = js.native
  
  var `bloom filter pages read into cache`: Double = js.native
  
  var `bloom filters in the LSM tree`: Double = js.native
  
  var `chunks in the LSM tree`: Double = js.native
  
  var `highest merge generation in the LSM tree`: Double = js.native
  
  var `queries that could have benefited from a Bloom filter that did not exist`: Double = js.native
  
  var `sleep for LSM checkpoint throttle`: Double = js.native
  
  var `sleep for LSM merge throttle`: Double = js.native
  
  var `total size of bloom filters`: Double = js.native
}
object Bloomfilterfalsepositives {
  
  @scala.inline
  def apply(
    `bloom filter false positives`: Double,
    `bloom filter hits`: Double,
    `bloom filter misses`: Double,
    `bloom filter pages evicted from cache`: Double,
    `bloom filter pages read into cache`: Double,
    `bloom filters in the LSM tree`: Double,
    `chunks in the LSM tree`: Double,
    `highest merge generation in the LSM tree`: Double,
    `queries that could have benefited from a Bloom filter that did not exist`: Double,
    `sleep for LSM checkpoint throttle`: Double,
    `sleep for LSM merge throttle`: Double,
    `total size of bloom filters`: Double
  ): Bloomfilterfalsepositives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bloom filter false positives")((`bloom filter false positives`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter hits")((`bloom filter hits`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter misses")((`bloom filter misses`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages evicted from cache")((`bloom filter pages evicted from cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages read into cache")((`bloom filter pages read into cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filters in the LSM tree")((`bloom filters in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("chunks in the LSM tree")((`chunks in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("highest merge generation in the LSM tree")((`highest merge generation in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("queries that could have benefited from a Bloom filter that did not exist")((`queries that could have benefited from a Bloom filter that did not exist`).asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM checkpoint throttle")((`sleep for LSM checkpoint throttle`).asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM merge throttle")((`sleep for LSM merge throttle`).asInstanceOf[js.Any])
    __obj.updateDynamic("total size of bloom filters")((`total size of bloom filters`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloomfilterfalsepositives]
  }
  
  @scala.inline
  implicit class BloomfilterfalsepositivesMutableBuilder[Self <: Bloomfilterfalsepositives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBloom filter false positives`(value: Double): Self = StObject.set(x, "bloom filter false positives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBloom filter hits`(value: Double): Self = StObject.set(x, "bloom filter hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBloom filter misses`(value: Double): Self = StObject.set(x, "bloom filter misses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBloom filter pages evicted from cache`(value: Double): Self = StObject.set(x, "bloom filter pages evicted from cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBloom filter pages read into cache`(value: Double): Self = StObject.set(x, "bloom filter pages read into cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBloom filters in the LSM tree`(value: Double): Self = StObject.set(x, "bloom filters in the LSM tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChunks in the LSM tree`(value: Double): Self = StObject.set(x, "chunks in the LSM tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHighest merge generation in the LSM tree`(value: Double): Self = StObject.set(x, "highest merge generation in the LSM tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setQueries that could have benefited from a Bloom filter that did not exist`(value: Double): Self = StObject.set(x, "queries that could have benefited from a Bloom filter that did not exist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSleep for LSM checkpoint throttle`(value: Double): Self = StObject.set(x, "sleep for LSM checkpoint throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSleep for LSM merge throttle`(value: Double): Self = StObject.set(x, "sleep for LSM merge throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTotal size of bloom filters`(value: Double): Self = StObject.set(x, "total size of bloom filters", value.asInstanceOf[js.Any])
  }
}
