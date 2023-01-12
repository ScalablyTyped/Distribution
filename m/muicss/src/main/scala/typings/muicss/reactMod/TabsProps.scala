package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps
  extends StObject
     with HTMLAttributes[HTMLDivElement] {
  
  var defaultSelectedIndex: js.UndefOr[Double] = js.undefined
  
  var justified: js.UndefOr[Boolean] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TabsProps {
  
  inline def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    inline def setDefaultSelectedIndex(value: Double): Self = StObject.set(x, "defaultSelectedIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedIndexUndefined: Self = StObject.set(x, "defaultSelectedIndex", js.undefined)
    
    inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
    
    inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
