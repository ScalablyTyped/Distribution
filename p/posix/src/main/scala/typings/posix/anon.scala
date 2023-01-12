package typings.posix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hard extends StObject {
    
    var hard: js.UndefOr[Double | Null] = js.undefined
    
    var soft: js.UndefOr[Double | Null] = js.undefined
  }
  object Hard {
    
    inline def apply(): Hard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hard]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hard] (val x: Self) extends AnyVal {
      
      inline def setHard(value: Double): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      inline def setHardNull: Self = StObject.set(x, "hard", null)
      
      inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
      
      inline def setSoft(value: Double): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      inline def setSoftNull: Self = StObject.set(x, "soft", null)
      
      inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
    }
  }
}
