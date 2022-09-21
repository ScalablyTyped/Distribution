package typings.postcssNormalizeString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DoubleQuote extends StObject {
    
    var doubleQuote: Double
    
    var escapedDoubleQuote: Double
    
    var escapedSingleQuote: Double
    
    var singleQuote: Double
  }
  object DoubleQuote {
    
    inline def apply(doubleQuote: Double, escapedDoubleQuote: Double, escapedSingleQuote: Double, singleQuote: Double): DoubleQuote = {
      val __obj = js.Dynamic.literal(doubleQuote = doubleQuote.asInstanceOf[js.Any], escapedDoubleQuote = escapedDoubleQuote.asInstanceOf[js.Any], escapedSingleQuote = escapedSingleQuote.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoubleQuote]
    }
    
    extension [Self <: DoubleQuote](x: Self) {
      
      inline def setDoubleQuote(value: Double): Self = StObject.set(x, "doubleQuote", value.asInstanceOf[js.Any])
      
      inline def setEscapedDoubleQuote(value: Double): Self = StObject.set(x, "escapedDoubleQuote", value.asInstanceOf[js.Any])
      
      inline def setEscapedSingleQuote(value: Double): Self = StObject.set(x, "escapedSingleQuote", value.asInstanceOf[js.Any])
      
      inline def setSingleQuote(value: Double): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    }
  }
}
