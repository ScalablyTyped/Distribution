package typings.mnemonist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bloomFilterMod {
  
  @JSImport("mnemonist/bloom-filter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BloomFilter {
    // Constructor
    def this(capacity: Double) = this()
    def this(options: BloomFilterOptions) = this()
  }
  
  @js.native
  trait BloomFilter extends StObject {
    
    def add(string: String): this.type = js.native
    
    // Members
    var capacity: Double = js.native
    
    // Methods
    def clear(): Unit = js.native
    
    var errorRate: Double = js.native
    
    // Statics
    def from(iterable: js.Iterable[String]): BloomFilter = js.native
    def from(iterable: js.Iterable[String], options: Double): BloomFilter = js.native
    def from(iterable: js.Iterable[String], options: BloomFilterOptions): BloomFilter = js.native
    
    var hashFunctions: Double = js.native
    
    def test(string: String): Boolean = js.native
    
    def toJSON(): js.typedarray.Uint8Array = js.native
  }
  
  trait BloomFilterOptions extends StObject {
    
    var capacity: Double
    
    var errorRate: js.UndefOr[Double] = js.undefined
  }
  object BloomFilterOptions {
    
    inline def apply(capacity: Double): BloomFilterOptions = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[BloomFilterOptions]
    }
    
    extension [Self <: BloomFilterOptions](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setErrorRate(value: Double): Self = StObject.set(x, "errorRate", value.asInstanceOf[js.Any])
      
      inline def setErrorRateUndefined: Self = StObject.set(x, "errorRate", js.undefined)
    }
  }
}
