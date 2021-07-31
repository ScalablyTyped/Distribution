package typings.node.cryptoMod

import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashOptions
  extends StObject
     with TransformOptions {
  
  /**
    * For XOF hash functions such as `shake256`, the
    * outputLength option can be used to specify the desired output length in bytes.
    */
  var outputLength: js.UndefOr[Double] = js.undefined
}
object HashOptions {
  
  @scala.inline
  def apply(): HashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashOptions]
  }
  
  @scala.inline
  implicit class HashOptionsMutableBuilder[Self <: HashOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputLength(value: Double): Self = StObject.set(x, "outputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLengthUndefined: Self = StObject.set(x, "outputLength", js.undefined)
  }
}
