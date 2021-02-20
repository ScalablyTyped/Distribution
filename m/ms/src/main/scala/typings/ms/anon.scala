package typings.ms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Long extends StObject {
    
    var long: Boolean = js.native
  }
  object Long {
    
    @scala.inline
    def apply(long: Boolean): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    }
  }
}
