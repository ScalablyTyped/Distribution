package typings.ms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Long extends StObject {
    
    var long: Boolean
  }
  object Long {
    
    inline def apply(long: Boolean): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    }
  }
}
