package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxInput
  extends StObject
     with MailLocationData
     with RecipientOptions
object MailboxInput {
  
  inline def apply(addr: String): MailboxInput = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxInput]
  }
}
