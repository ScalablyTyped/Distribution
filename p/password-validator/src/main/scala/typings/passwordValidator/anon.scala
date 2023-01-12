package typings.passwordValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Details extends StObject {
    
    var details: js.UndefOr[Boolean] = js.undefined
    
    var list: js.UndefOr[Boolean] = js.undefined
  }
  object Details {
    
    inline def apply(): Details = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    }
  }
}
