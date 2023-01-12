package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBlackboxPatternsParameterType extends StObject {
  
  /**
    * Array of regexps that will be used to check script url for blackbox state.
    */
  var patterns: js.Array[String]
}
object SetBlackboxPatternsParameterType {
  
  inline def apply(patterns: js.Array[String]): SetBlackboxPatternsParameterType = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxPatternsParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBlackboxPatternsParameterType] (val x: Self) extends AnyVal {
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
  }
}
