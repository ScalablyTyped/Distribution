package typings.node.anon

import typings.node.nodeStrings.option
import typings.node.utilMod._PreciseTokenForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[K /* <: String */]
  extends StObject
     with _PreciseTokenForOptions[K, Any] {
  
  var index: Double
  
  var inlineValue: Boolean
  
  var kind: option
  
  var name: K
  
  var rawName: String
  
  var value: String
}
object Index {
  
  inline def apply[K /* <: String */](index: Double, inlineValue: Boolean, name: K, rawName: String, value: String): Index[K] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[K]]
  }
  
  extension [Self <: Index[?], K /* <: String */](x: Self & Index[K]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInlineValue(value: Boolean): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    
    inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
