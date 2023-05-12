package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Busy extends StObject {
  
  /**
    * busy state
    */
  var busy: js.UndefOr[Boolean] = js.undefined
}
object Busy {
  
  inline def apply(): Busy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Busy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Busy] (val x: Self) extends AnyVal {
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
  }
}
