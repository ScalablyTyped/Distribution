package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxBoundaries extends StObject {
  
  var alt: String
  
  var mixed: String
}
object MailboxBoundaries {
  
  inline def apply(alt: String, mixed: String): MailboxBoundaries = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxBoundaries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailboxBoundaries] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setMixed(value: String): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
  }
}
