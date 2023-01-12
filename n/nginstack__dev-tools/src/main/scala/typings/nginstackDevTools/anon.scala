package typings.nginstackDevTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisableHeader extends StObject {
    
    var disableHeader: js.UndefOr[Boolean] = js.undefined
  }
  object DisableHeader {
    
    inline def apply(): DisableHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisableHeader] (val x: Self) extends AnyVal {
      
      inline def setDisableHeader(value: Boolean): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
      
      inline def setDisableHeaderUndefined: Self = StObject.set(x, "disableHeader", js.undefined)
    }
  }
}
