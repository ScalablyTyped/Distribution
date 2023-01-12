package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptions extends StObject {
  
  /** Routing parameters. If path has routing parameter slots, the properties of this object are interpolated into the path string. */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /** The state object to pass to the underlying history.pushState / history.replaceState call. */
  var state: js.UndefOr[Any] = js.undefined
  
  /** The title string to pass to the underlying history.pushState / history.replaceState call. */
  var title: js.UndefOr[String] = js.undefined
}
object RouteOptions {
  
  inline def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
