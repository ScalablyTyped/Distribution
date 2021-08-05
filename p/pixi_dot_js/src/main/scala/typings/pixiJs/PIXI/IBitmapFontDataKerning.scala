package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataKerning
  * @property {number} first
  * @property {number} second
  * @property {number} amount
  */
trait IBitmapFontDataKerning extends StObject {
  
  var amount: Double
  
  var first: Double
  
  var second: Double
}
object IBitmapFontDataKerning {
  
  inline def apply(amount: Double, first: Double, second: Double): IBitmapFontDataKerning = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataKerning]
  }
  
  extension [Self <: IBitmapFontDataKerning](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
