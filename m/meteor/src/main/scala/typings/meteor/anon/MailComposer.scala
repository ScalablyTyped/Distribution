package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailComposer extends StObject {
  
  var mailComposer: typings.meteor.emailMod.MailComposer
}
object MailComposer {
  
  inline def apply(mailComposer: typings.meteor.emailMod.MailComposer): MailComposer = {
    val __obj = js.Dynamic.literal(mailComposer = mailComposer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailComposer] (val x: Self) extends AnyVal {
    
    inline def setMailComposer(value: typings.meteor.emailMod.MailComposer): Self = StObject.set(x, "mailComposer", value.asInstanceOf[js.Any])
  }
}
