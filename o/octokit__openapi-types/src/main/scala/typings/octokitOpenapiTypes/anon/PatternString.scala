package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternString extends StObject {
  
  /** @description An optional glob pattern to match against when enforcing tag protection. */
  var pattern: String
}
object PatternString {
  
  inline def apply(pattern: String): PatternString = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternString]
  }
  
  extension [Self <: PatternString](x: Self) {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
