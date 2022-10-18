package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotVisible extends StObject {
  
  /**
    * date, as JavaScript Date object, of the focused time.
    */
  var date: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set, the focused date is not rendered yet. (This happens by navigating out of the visible area.)
    */
  var notVisible: js.UndefOr[Boolean] = js.undefined
}
object NotVisible {
  
  inline def apply(): NotVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotVisible]
  }
  
  extension [Self <: NotVisible](x: Self) {
    
    inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNotVisible(value: Boolean): Self = StObject.set(x, "notVisible", value.asInstanceOf[js.Any])
    
    inline def setNotVisibleUndefined: Self = StObject.set(x, "notVisible", js.undefined)
  }
}
