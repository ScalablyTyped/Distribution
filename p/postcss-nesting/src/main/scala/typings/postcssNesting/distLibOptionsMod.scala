package typings.postcssNesting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOptionsMod {
  
  trait options extends StObject {
    
    var noIsPseudoSelector: Boolean
    
    var silenceAtNestWarning: Boolean
  }
  object options {
    
    inline def apply(noIsPseudoSelector: Boolean, silenceAtNestWarning: Boolean): options = {
      val __obj = js.Dynamic.literal(noIsPseudoSelector = noIsPseudoSelector.asInstanceOf[js.Any], silenceAtNestWarning = silenceAtNestWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      inline def setNoIsPseudoSelector(value: Boolean): Self = StObject.set(x, "noIsPseudoSelector", value.asInstanceOf[js.Any])
      
      inline def setSilenceAtNestWarning(value: Boolean): Self = StObject.set(x, "silenceAtNestWarning", value.asInstanceOf[js.Any])
    }
  }
}
