package typings.postcssNesting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOptionsMod {
  
  trait options extends StObject {
    
    var noIsPseudoSelector: Boolean
  }
  object options {
    
    inline def apply(noIsPseudoSelector: Boolean): options = {
      val __obj = js.Dynamic.literal(noIsPseudoSelector = noIsPseudoSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setNoIsPseudoSelector(value: Boolean): Self = StObject.set(x, "noIsPseudoSelector", value.asInstanceOf[js.Any])
    }
  }
}
