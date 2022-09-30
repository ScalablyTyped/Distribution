package typings.mirrorx.mod

import typings.history.mod.Location
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteProps extends StObject {
  
  var children: js.UndefOr[(js.Function1[/* props */ RouteComponentProps[Any], ReactNode]) | ReactNode] = js.undefined
  
  var component: js.UndefOr[ComponentType[Any | RouteComponentProps[Any]]] = js.undefined
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* props */ RouteComponentProps[Any], ReactNode]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object RouteProps {
  
  inline def apply(): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps]
  }
  
  extension [Self <: RouteProps](x: Self) {
    
    inline def setChildren(value: (js.Function1[/* props */ RouteComponentProps[Any], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ RouteComponentProps[Any] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setComponent(value: ComponentType[Any | RouteComponentProps[Any]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRender(value: /* props */ RouteComponentProps[Any] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
