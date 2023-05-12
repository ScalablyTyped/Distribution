package typings.nodeObjectHash

import typings.node.cryptoMod.BinaryToTextEncoding
import typings.nodeObjectHash.distObjectSorterMod.SorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-object-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasher(): Hasher_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasher")().asInstanceOf[Hasher_[Any]]
  inline def hasher(options: HasherOptions): Hasher_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasher")(options.asInstanceOf[js.Any]).asInstanceOf[Hasher_[Any]]
  
  trait Hashable extends StObject {
    
    def toHashableString(): String
  }
  object Hashable {
    
    inline def apply(toHashableString: () => String): Hashable = {
      val __obj = js.Dynamic.literal(toHashableString = js.Any.fromFunction0(toHashableString))
      __obj.asInstanceOf[Hashable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hashable] (val x: Self) extends AnyVal {
      
      inline def setToHashableString(value: () => String): Self = StObject.set(x, "toHashableString", js.Any.fromFunction0(value))
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasherOptions] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setEnc(value: BinaryToTextEncoding): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
    }
  }
  
  @js.native
  trait Hasher_[T] extends StObject {
    
    def hash(`object`: T): String = js.native
    def hash(`object`: T, opts: HasherOptions): String = js.native
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
    def sort(`object`: T): String = js.native
    
    /**
      * Create sorted string from an object
      * @param object source object
      * @returns sorted string from an object
      * @alias sort
      */
    def sortObject(`object`: T): String = js.native
  }
}
