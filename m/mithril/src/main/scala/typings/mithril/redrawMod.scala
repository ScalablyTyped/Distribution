package typings.mithril

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redrawMod extends Shortcut {
  
  @JSImport("mithril/redraw", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait Static extends StObject {
    
    var redraw: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ Any
    
    var render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ Any
  }
  object Static {
    
    inline def apply(
      redraw: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ Any,
      render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ Any
    ): Static = {
      val __obj = js.Dynamic.literal(redraw = redraw.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    extension [Self <: Static](x: Self) {
      
      inline def setRedraw(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof redraw */ Any): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `redrawMod.foo` */
  override def _to: Static = ^
}
