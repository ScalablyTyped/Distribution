package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity metadata security values
  */
trait SecurityValues extends StObject {
  
  var editable: Boolean
  
  var readable: Boolean
  
  var secured: Boolean
}
object SecurityValues {
  
  inline def apply(editable: Boolean, readable: Boolean, secured: Boolean): SecurityValues = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityValues] (val x: Self) extends AnyVal {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
  }
}
