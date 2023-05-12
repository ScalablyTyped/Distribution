package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  /** Transform function for column names in result rows */
  var from: js.UndefOr[js.Function1[/* column */ String, String]] = js.undefined
  
  /** Transform function for column names in interpolated values passed to tagged template literal */
  var to: js.UndefOr[js.Function1[/* column */ String, String]] = js.undefined
}
object From {
  
  inline def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: /* column */ String => String): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: /* column */ String => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
