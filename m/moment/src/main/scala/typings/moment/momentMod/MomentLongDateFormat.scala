package typings.moment.momentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentLongDateFormat extends StObject {
  
  var L: String
  
  var LL: String
  
  var LLL: String
  
  var LLLL: String
  
  var LT: String
  
  var LTS: String
  
  var l: js.UndefOr[String] = js.undefined
  
  var ll: js.UndefOr[String] = js.undefined
  
  var lll: js.UndefOr[String] = js.undefined
  
  var llll: js.UndefOr[String] = js.undefined
  
  var lt: js.UndefOr[String] = js.undefined
  
  var lts: js.UndefOr[String] = js.undefined
}
object MomentLongDateFormat {
  
  @scala.inline
  def apply(L: String, LL: String, LLL: String, LLLL: String, LT: String, LTS: String): MomentLongDateFormat = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], LL = LL.asInstanceOf[js.Any], LLL = LLL.asInstanceOf[js.Any], LLLL = LLLL.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LTS = LTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentLongDateFormat]
  }
  
  @scala.inline
  implicit class MomentLongDateFormatMutableBuilder[Self <: MomentLongDateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLL(value: String): Self = StObject.set(x, "LL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLLL(value: String): Self = StObject.set(x, "LLL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLLLL(value: String): Self = StObject.set(x, "LLLL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLT(value: String): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLTS(value: String): Self = StObject.set(x, "LTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    @scala.inline
    def setLlUndefined: Self = StObject.set(x, "ll", js.undefined)
    
    @scala.inline
    def setLllUndefined: Self = StObject.set(x, "lll", js.undefined)
    
    @scala.inline
    def setLlllUndefined: Self = StObject.set(x, "llll", js.undefined)
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
  }
}
