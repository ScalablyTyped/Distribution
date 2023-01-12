package typings.meteor

import typings.meteor.Meteor.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailFields extends StObject {
  
  var from: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
  
  var html: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
  
  var subject: js.UndefOr[js.Function1[/* user */ User, String]] = js.undefined
  
  var text: js.UndefOr[js.Function2[/* user */ User, /* url */ String, String]] = js.undefined
}
object EmailFields {
  
  inline def apply(): EmailFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailFields] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: /* user */ User => String): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHtml(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setSubject(value: /* user */ User => String): Self = StObject.set(x, "subject", js.Any.fromFunction1(value))
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
