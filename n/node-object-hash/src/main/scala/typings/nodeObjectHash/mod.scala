package typings.nodeObjectHash

import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.nodeObjectHash.objectSorterMod.SorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Hasher constructor
    * @param options hasher options
    */
  @JSImport("node-object-hash", JSImport.Namespace)
  @js.native
  def apply(): Hasher = js.native
  @JSImport("node-object-hash", JSImport.Namespace)
  @js.native
  def apply(options: HasherOptions): Hasher = js.native
  
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
  @js.native
  trait HasherOptions extends SorterOptions {
    
    /**
      * Hash algorithm to use
      * @default 'sha256'
      */
    var alg: js.UndefOr[String] = js.native
    
    /**
      * String encoding for hash
      * @default 'hex'
      */
    var enc: js.UndefOr[HexBase64Latin1Encoding] = js.native
  }
  object HasherOptions {
    
    @scala.inline
    def apply(): HasherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasherOptions]
    }
    
    @scala.inline
    implicit class HasherOptionsMutableBuilder[Self <: HasherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setEnc(value: HexBase64Latin1Encoding): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
    }
  }
}
