package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends HTMLAttributes[HTMLDivElement] {
  
  var defaultSelectedIndex: js.UndefOr[Double] = js.native
  
  var justified: js.UndefOr[Boolean] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSelectedIndex(value: Double): Self = StObject.set(x, "defaultSelectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedIndexUndefined: Self = StObject.set(x, "defaultSelectedIndex", js.undefined)
    
    @scala.inline
    def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
