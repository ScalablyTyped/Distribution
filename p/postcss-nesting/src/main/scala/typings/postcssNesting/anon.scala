package typings.postcssNesting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NoIsPseudoSelector extends StObject {
    
    var noIsPseudoSelector: Boolean
  }
  object NoIsPseudoSelector {
    
    inline def apply(noIsPseudoSelector: Boolean): NoIsPseudoSelector = {
      val __obj = js.Dynamic.literal(noIsPseudoSelector = noIsPseudoSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoIsPseudoSelector]
    }
    
    extension [Self <: NoIsPseudoSelector](x: Self) {
      
      inline def setNoIsPseudoSelector(value: Boolean): Self = StObject.set(x, "noIsPseudoSelector", value.asInstanceOf[js.Any])
    }
  }
}
