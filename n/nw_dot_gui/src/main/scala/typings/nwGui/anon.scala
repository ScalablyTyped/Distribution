package typings.nwGui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Datatype extends StObject {
    
    var datatype: String = js.native
    
    var format: String = js.native
  }
  object Datatype {
    
    @scala.inline
    def apply(datatype: String, format: String): Datatype = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datatype]
    }
    
    @scala.inline
    implicit class DatatypeMutableBuilder[Self <: Datatype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
