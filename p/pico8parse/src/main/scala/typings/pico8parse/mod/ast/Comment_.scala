package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment_
  extends StObject
     with Base[Comment]
     with _Node {
  
  var raw: String
  
  var rawInterrupted: js.UndefOr[String] = js.undefined
  
  var value: String
}
object Comment_ {
  
  inline def apply(raw: String, value: String): Comment_ = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Comment")
    __obj.asInstanceOf[Comment_]
  }
  
  extension [Self <: Comment_](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawInterrupted(value: String): Self = StObject.set(x, "rawInterrupted", value.asInstanceOf[js.Any])
    
    inline def setRawInterruptedUndefined: Self = StObject.set(x, "rawInterrupted", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
