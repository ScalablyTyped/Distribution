package typings.nodeObjectHash

import typings.node.cryptoMod.BinaryToTextEncoding
import typings.nodeObjectHash.distObjectSorterMod.SorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Hasher constructor
    * @param options hasher options
    * @return hasher instance
    */
  inline def apply(): Hasher = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Hasher]
  inline def apply(options: HasherOptions): Hasher = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Hasher]
  
  @JSImport("node-object-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If object implements Hashable interface then value from toHash
    * will be used for hash function. It means that the different objects
    * with the function toHash that return the same value will have the same hash
    */
  trait Hashable extends StObject {
    
    def toHashableString(): String
  }
  object Hashable {
    
    inline def apply(toHashableString: () => String): Hashable = {
      val __obj = js.Dynamic.literal(toHashableString = js.Any.fromFunction0(toHashableString))
      __obj.asInstanceOf[Hashable]
    }
    
    extension [Self <: Hashable](x: Self) {
      
      inline def setToHashableString(value: () => String): Self = StObject.set(x, "toHashableString", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Hasher extends StObject {
    
    def hash(`object`: Any): String = js.native
    def hash(`object`: Any, opts: HasherOptions): String = js.native
    /**
      * Create hash of an object
      * @param object source object
      * @returns hash string of an object
      */
    def hash(`object`: Hashable): String = js.native
    def hash(`object`: Hashable, opts: HasherOptions): String = js.native
    
    /**
      * Create sorted string from an object
      * @param object source object
      * @returns sorted string from an object
      */
    def sort(`object`: Any): String = js.native
    
    /**
      * Create sorted string from an object
      * @param object source object
      * @returns sorted string from an object
      * @alias sort
      */
    def sortObject(`object`: Any): String = js.native
  }
  
  /**
    * Object hasher options
    */
  trait HasherOptions
    extends StObject
       with SorterOptions {
    
    /**
      * Hash algorithm to use
      * @default 'sha256'
      */
    var alg: js.UndefOr[String] = js.undefined
    
    /**
      * String encoding for hash
      * @default 'hex'
      */
    var enc: js.UndefOr[BinaryToTextEncoding] = js.undefined
  }
  object HasherOptions {
    
    inline def apply(): HasherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasherOptions]
    }
    
    extension [Self <: HasherOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setEnc(value: BinaryToTextEncoding): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
    }
  }
}
