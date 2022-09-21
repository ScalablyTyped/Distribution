package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLinkAttrs
  extends StObject
     with Attributes {
  
  var href: String
  
  var options: js.UndefOr[RouteOptions] = js.undefined
  
  var selector: js.UndefOr[String | (ComponentTypes[Any, js.Object])] = js.undefined
}
object RouteLinkAttrs {
  
  inline def apply(href: String): RouteLinkAttrs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLinkAttrs]
  }
  
  extension [Self <: RouteLinkAttrs](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSelector(value: String | (ComponentTypes[Any, js.Object])): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorFunction1(value: /* vnode */ Vnode[Any, js.Object] => Component[Any, js.Object]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
