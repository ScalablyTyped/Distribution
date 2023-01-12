package typings.nwGui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datatype extends StObject {
    
    var datatype: String
    
    var format: String
  }
  object Datatype {
    
    inline def apply(datatype: String, format: String): Datatype = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datatype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Datatype] (val x: Self) extends AnyVal {
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
