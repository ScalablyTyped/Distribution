package typings.miniprogram.anon

import typings.miniprogram.miniprogramStrings.code
import typings.miniprogram.miniprogramStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: manual | code
}
object Form {
  
  inline def apply(form: manual | code): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setForm(value: manual | code): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
