package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxOptions extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MailboxOptions {
  
  inline def apply(): MailboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailboxOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
