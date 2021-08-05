package typings.nodeObjectHash

import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.nodeObjectHash.objectSorterMod.SorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Hasher constructor
    * @param options hasher options
    */
  inline def apply(): Hasher = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Hasher]
  inline def apply(options: HasherOptions): Hasher = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Hasher]
  
  @JSImport("node-object-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Hasher extends StObject {
    
    /**
      * Create hash of an object
      * @param object source object
      * @returns hash string of an object
      */
    def hash(`object`: js.Any): String = js.native
    def hash(`object`: js.Any, opts: HasherOptions): String = js.native
    
    /**
      * Create sorted string from an object
      * @param object source object
      * @returns sorted string from an object
      */
    def sort(`object`: js.Any): String = js.native
    
    /**
      * Create sorted string from an object
      * @param object source object
      * @returns sorted string from an object
      * @alias sort
      */
    def sortObject(`object`: js.Any): String = js.native
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
    var enc: js.UndefOr[HexBase64Latin1Encoding] = js.undefined
  }
  object HasherOptions {
    
    inline def apply(): HasherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasherOptions]
    }
    
    extension [Self <: HasherOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setEnc(value: HexBase64Latin1Encoding): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
    }
  }
}
