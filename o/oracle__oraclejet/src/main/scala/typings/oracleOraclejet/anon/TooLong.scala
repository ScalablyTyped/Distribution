package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooLong extends StObject {
  
  var tooLong: js.UndefOr[String] = js.native
  
  var tooShort: js.UndefOr[String] = js.native
}
object TooLong {
  
  @scala.inline
  def apply(): TooLong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooLong]
  }
  
  @scala.inline
  implicit class TooLongMutableBuilder[Self <: TooLong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooLong(value: String): Self = StObject.set(x, "tooLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooLongUndefined: Self = StObject.set(x, "tooLong", js.undefined)
    
    @scala.inline
    def setTooShort(value: String): Self = StObject.set(x, "tooShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooShortUndefined: Self = StObject.set(x, "tooShort", js.undefined)
  }
}
