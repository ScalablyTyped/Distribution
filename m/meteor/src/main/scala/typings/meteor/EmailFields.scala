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
  
  @scala.inline
  def apply(): EmailFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFields]
  }
  
  @scala.inline
  implicit class EmailFieldsMutableBuilder[Self <: EmailFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: /* user */ User => String): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHtml(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setSubject(value: /* user */ User => String): Self = StObject.set(x, "subject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setText(value: (/* user */ User, /* url */ String) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
