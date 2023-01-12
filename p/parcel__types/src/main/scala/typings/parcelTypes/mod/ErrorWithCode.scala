package typings.parcelTypes.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithCode
  extends StObject
     with Error {
  
  val code: js.UndefOr[String] = js.undefined
}
object ErrorWithCode {
  
  inline def apply(message: String, name: String): ErrorWithCode = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorWithCode] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
