package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteLinkAttrs extends Attributes {
  
  var href: String = js.native
  
  var options: js.UndefOr[RouteOptions] = js.native
  
  var selector: js.UndefOr[String | (ComponentTypes[_, js.Object])] = js.native
}
object RouteLinkAttrs {
  
  @scala.inline
  def apply(href: String): RouteLinkAttrs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLinkAttrs]
  }
  
  @scala.inline
  implicit class RouteLinkAttrsMutableBuilder[Self <: RouteLinkAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSelector(value: String | (ComponentTypes[_, js.Object])): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorFunction1(value: /* vnode */ Vnode[_, js.Object] => Component[_, js.Object]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
