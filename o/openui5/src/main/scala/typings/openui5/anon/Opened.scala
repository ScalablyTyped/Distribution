package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opened extends StObject {
  
  /**
    * Node has been opened if true
    */
  var opened: js.UndefOr[Boolean] = js.undefined
}
object Opened {
  
  inline def apply(): Opened = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opened]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opened] (val x: Self) extends AnyVal {
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
  }
}
