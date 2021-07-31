package typings.mirrorx.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteProps extends StObject {
  
  var children: js.UndefOr[(js.Function1[/* props */ RouteComponentProps[js.Any], ReactNode]) | ReactNode] = js.undefined
  
  var component: js.UndefOr[ComponentType[js.Any | RouteComponentProps[js.Any]]] = js.undefined
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* props */ RouteComponentProps[js.Any], ReactNode]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object RouteProps {
  
  @scala.inline
  def apply(): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps]
  }
  
  @scala.inline
  implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ RouteComponentProps[js.Any], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ RouteComponentProps[js.Any] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[js.Any | RouteComponentProps[js.Any]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRender(value: /* props */ RouteComponentProps[js.Any] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
