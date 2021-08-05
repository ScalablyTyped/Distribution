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
  
  inline def apply(to: LocationDescriptor[LocationState]): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  
  extension [Self <: LinkProps](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
