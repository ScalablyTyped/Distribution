package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooLong extends StObject {
  
  var tooLong: js.UndefOr[String] = js.undefined
  
  var tooShort: js.UndefOr[String] = js.undefined
}
object TooLong {
  
  inline def apply(): TooLong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooLong]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooLong] (val x: Self) extends AnyVal {
    
    inline def setTooLong(value: String): Self = StObject.set(x, "tooLong", value.asInstanceOf[js.Any])
    
    inline def setTooLongUndefined: Self = StObject.set(x, "tooLong", js.undefined)
    
    inline def setTooShort(value: String): Self = StObject.set(x, "tooShort", value.asInstanceOf[js.Any])
    
    inline def setTooShortUndefined: Self = StObject.set(x, "tooShort", js.undefined)
  }
}
