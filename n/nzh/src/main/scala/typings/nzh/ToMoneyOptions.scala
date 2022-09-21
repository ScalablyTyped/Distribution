package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToMoneyOptions
  extends StObject
     with Options {
  
  /**
  	 * 输出完整金额开关, toMoney 函数专用配置, 默认 false
  	 * */
  var complete: js.UndefOr[Boolean] = js.undefined
  
  /*
  	 * 输出金额前缀字符, toMoney 函数专用配置, 默认 true
  	 * */
  var outSymbol: js.UndefOr[Boolean] = js.undefined
}
object ToMoneyOptions {
  
  inline def apply(): ToMoneyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToMoneyOptions]
  }
  
  extension [Self <: ToMoneyOptions](x: Self) {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setOutSymbol(value: Boolean): Self = StObject.set(x, "outSymbol", value.asInstanceOf[js.Any])
    
    inline def setOutSymbolUndefined: Self = StObject.set(x, "outSymbol", js.undefined)
  }
}
