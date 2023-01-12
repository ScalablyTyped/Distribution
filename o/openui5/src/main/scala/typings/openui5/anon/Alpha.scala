package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alpha extends StObject {
  
  /**
    * Parameter containing the alpha value (transparency).
    */
  var alpha: js.UndefOr[String] = js.undefined
  
  /**
    * Parameter containing the BLUE value (0-255).
    */
  var b: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the GREEN value (0-255).
    */
  var g: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the HUE value (0-360).
    */
  var h: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the Hexadecimal string (#FFFFFF).
    */
  var hex: js.UndefOr[String] = js.undefined
  
  /**
    * Parameter containing the LIGHTNESS value (0-100).
    */
  var l: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the RED value (0-255).
    */
  var r: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the SATURATION value (0-100).
    */
  var s: js.UndefOr[int] = js.undefined
  
  /**
    * Parameter containing the VALUE value (0-100).
    */
  var v: js.UndefOr[int] = js.undefined
}
object Alpha {
  
  inline def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: String): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: int): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setG(value: int): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    inline def setH(value: int): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    
    inline def setL(value: int): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setR(value: int): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setS(value: int): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setV(value: int): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
