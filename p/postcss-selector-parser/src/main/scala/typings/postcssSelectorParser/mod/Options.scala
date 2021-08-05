package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Preserve whitespace when true. Default: false;
    */
  var lossless: Boolean
  
  /**
    * When true and a postcss.Rule is passed, set the result of
    * processing back onto the rule when done. Default: false.
    */
  var updateSelector: Boolean
}
object Options {
  
  inline def apply(lossless: Boolean, updateSelector: Boolean): Options = {
    val __obj = js.Dynamic.literal(lossless = lossless.asInstanceOf[js.Any], updateSelector = updateSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setUpdateSelector(value: Boolean): Self = StObject.set(x, "updateSelector", value.asInstanceOf[js.Any])
  }
}
