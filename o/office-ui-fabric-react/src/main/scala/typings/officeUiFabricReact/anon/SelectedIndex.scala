package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedIndex extends StObject {
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object SelectedIndex {
  
  inline def apply(): SelectedIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedIndex] (val x: Self) extends AnyVal {
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
