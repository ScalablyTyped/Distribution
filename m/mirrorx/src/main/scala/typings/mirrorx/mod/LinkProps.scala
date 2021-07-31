package typings.mirrorx.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps
  extends StObject
     with AnchorHTMLAttributes[HTMLAnchorElement] {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var to: LocationDescriptor[LocationState]
}
object LinkProps {
  
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
