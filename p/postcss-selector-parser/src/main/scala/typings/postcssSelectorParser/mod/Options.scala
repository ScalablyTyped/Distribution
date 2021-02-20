package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /**
    * Preserve whitespace when true. Default: false;
    */
  var lossless: Boolean = js.native
  
  /**
    * When true and a postcss.Rule is passed, set the result of
    * processing back onto the rule when done. Default: false.
    */
  var updateSelector: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(lossless: Boolean, updateSelector: Boolean): Options = {
    val __obj = js.Dynamic.literal(lossless = lossless.asInstanceOf[js.Any], updateSelector = updateSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSelector(value: Boolean): Self = StObject.set(x, "updateSelector", value.asInstanceOf[js.Any])
  }
}
