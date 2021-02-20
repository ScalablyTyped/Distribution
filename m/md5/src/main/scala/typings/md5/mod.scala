package typings.md5

import typings.md5.anon.OptionsasBytestrue
import typings.md5.anon.PickOptionsasStringencodi
import typings.md5.md5Strings.binary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: String): String = js.native
  /**
    * js function for hashing messages with MD5
    *
    * @param message - a string or buffer to hash
    * @param options
    * @returns the resultant MD5 hash of the given message
    */
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: String, options: OptionsasBytestrue): js.Array[Double] = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: String, options: PickOptionsasStringencodi): String = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: String, options: Options): String | js.Array[Double] = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: js.Array[Double]): String = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: js.Array[Double], options: OptionsasBytestrue): js.Array[Double] = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: js.Array[Double], options: PickOptionsasStringencodi): String = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: js.Array[Double], options: Options): String | js.Array[Double] = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: Buffer): String = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: OptionsasBytestrue): js.Array[Double] = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: PickOptionsasStringencodi): String = js.native
  @JSImport("md5", JSImport.Namespace)
  @js.native
  def apply(message: Buffer, options: Options): String | js.Array[Double] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var asBytes: js.UndefOr[Boolean] = js.native
    
    var asString: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[binary | String] = js.native
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
      def setAsBytes(value: Boolean): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsBytesUndefined: Self = StObject.set(x, "asBytes", js.undefined)
      
      @scala.inline
      def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      @scala.inline
      def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
