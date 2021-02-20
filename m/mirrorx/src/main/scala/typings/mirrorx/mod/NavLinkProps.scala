package typings.mirrorx.mod

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.CSSProperties
import typings.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavLinkProps extends LinkProps {
  
  var activeClassName: js.UndefOr[String] = js.native
  
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var isActive: js.UndefOr[
    js.Function2[/* match */ `match`[_], /* location */ Location[LocationState], Boolean]
  ] = js.native
  
  var location: js.UndefOr[Location[LocationState]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object NavLinkProps {
  
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): NavLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
  
  @scala.inline
  implicit class NavLinkPropsMutableBuilder[Self <: NavLinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIsActive(value: (/* match */ `match`[_], /* location */ Location[LocationState]) => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
