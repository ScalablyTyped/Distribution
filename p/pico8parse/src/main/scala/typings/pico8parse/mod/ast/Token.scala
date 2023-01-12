package typings.pico8parse.mod.ast

import typings.pico8parse.mod.tokenTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
trait Token extends StObject {
  
  var line: Double
  
  var lineStart: Double
  
  var range: js.Tuple2[Double, Double]
  
  var `type`: tokenTypes
  
  var value: String
}
object Token {
  
  inline def apply(
    line: Double,
    lineStart: Double,
    range: js.Tuple2[Double, Double],
    `type`: tokenTypes,
    value: String
  ): Token = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: tokenTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
