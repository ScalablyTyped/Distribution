package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailLocationData extends StObject {
  
  var addr: String
  
  var name: js.UndefOr[String] = js.undefined
}
object MailLocationData {
  
  inline def apply(addr: String): MailLocationData = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailLocationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailLocationData] (val x: Self) extends AnyVal {
    
    inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
